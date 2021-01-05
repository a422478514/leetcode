package com.daquan.leetcode.simple;

/**
 * @Desc 反转链表
 * @Author zhangdaquan
 * @Date 2021/1/5
 */
public class ReverseLinkedList {

  public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public static ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        //先找三个指针，分别指向前一个、当前、下一个结点
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            //保存当前结点下一个结点
            ListNode next = cur.next;
            //当前结点的next指向前一个结点
            cur.next = pre;
            //重新赋值
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode cur = node;
        for (int i = 2; i < 6; i++) {
            ListNode next = new ListNode(i);
            cur.next = next;
            cur = cur.next;
        }
        ListNode listNode = reverseList(node);
        System.out.println(123);
    }
}
