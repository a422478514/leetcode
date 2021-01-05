package com.daquan.leetcode.simple;

/**
 * @Desc 回文链表
 * @Author zhangdaquan
 * @Date 2021/1/5
 */
public class PalindromeLinkedList {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    public static boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }
        //创建新的结点
        ListNode newHead = new ListNode(0);
        ListNode pHead = head;
        while( pHead != null ){
            //创建新元素头插保存pHead
            ListNode q = new ListNode(pHead.val);
            q.next = newHead.next;
            newHead.next = q;
            pHead = pHead.next;
        }
        pHead = head;
        newHead = newHead.next;
        while (pHead != null){
            if(newHead.val != pHead.val){
                return false;
            }
            pHead = pHead.next;
            newHead = newHead.next;
        }
      return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(-129);
        ListNode next = new ListNode(-129);
        head.next = next;
        System.out.println(isPalindrome(head));
    }
}
