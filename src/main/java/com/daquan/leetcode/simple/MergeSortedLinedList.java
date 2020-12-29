package com.daquan.leetcode.simple;

/**
 * @Desc 合并有序链表
 * @Author zhangdaquan
 * @Date 2020/12/29
 */
public class MergeSortedLinedList {
  public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      if(l1 == null && l2 == null){
          return null;
      }
      //构建新链表，保存合并后的两个有序链表
        ListNode newList = new ListNode();
        ListNode curNode = newList;

        while(l1 != null && l2 != null){
            curNode.next = new ListNode();
            curNode = curNode.next;
            if(l1.val > l2.val){
                curNode.val = l2.val;
                l2 = l2.next;
            }else{
                curNode.val = l1.val;
                l1 = l1.next;
            }
        }

        while (l1 != null){
            curNode.next = new ListNode();
            curNode = curNode.next;
            curNode.val = l1.val;
            l1 = l1.next;
        }
        while (l2 != null){
            curNode.next = new ListNode();
            curNode = curNode.next;
            curNode.val = l2.val;
            l2 = l2.next;
        }
      return newList.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        l2.val=0;
        ListNode listNode = mergeTwoLists(null, l2);
        System.out.println(listNode);
    }
}
