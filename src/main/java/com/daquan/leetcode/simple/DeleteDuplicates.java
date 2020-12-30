package com.daquan.leetcode.simple;

/**
 * @Desc 删除排序链表中的重复元素
 * @Author zhangdaquan
 * @Date 2020/12/30
 */
public class DeleteDuplicates {
      public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
          }
      }

    public ListNode deleteDuplicates(ListNode head) {
      if(head == null){
          return null;
      }
      ListNode curNode = head.next;
      ListNode preNode = head;

      while (curNode != null){
          if(curNode.val == preNode.val){
              //删除重复元素
              preNode.next = curNode.next;
          }else{
              preNode = preNode.next;
          }
          curNode = curNode.next;
      }

      return head;
    }

    public static void main(String[] args) {

    }
}
