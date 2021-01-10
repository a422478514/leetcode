package com.daquan.leetcode.simple;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/10
 */
public class DeleteNode {
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
