package com.daquan.leetcode.simple;

import java.util.LinkedHashSet;

/**
 * @Desc 环形链表
 * @Author zhangdaquan
 * @Date 2021/1/2
 */
public class LinkedListCycle {
    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public boolean hasCycle(ListNode head) {
        LinkedHashSet<ListNode> set = new LinkedHashSet<ListNode>();
        //遍历Head并把遍历后的元素存入，
        ListNode cur = head;
        while(cur != null){
            if(set.contains(cur)){
                return true;
            }
            set.add(cur);
            cur = cur.next;
        }
        return false;
    }

}
