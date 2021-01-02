package com.daquan.leetcode.simple;

import java.util.HashSet;
import java.util.Set;

/**
 * @Desc 相交链表
 * @Author zhangdaquan
 * @Date 2021/1/2
 */
public class IntersectionOfTwoLinkedLists {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        //遍历第一个list
        Set<ListNode> set = new HashSet<ListNode>();
        while(headA != null){
            set.add(headA);
            headA = headA.next;
        }

        while (headB != null){
            if(set.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}
