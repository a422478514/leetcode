package com.daquan.leetcode.simple;

/**
 * @Desc 移除链表元素
 * @Author zhangdaquan
 * @Date 2021/1/5
 */
public class RemoveLinkedListElements {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public ListNode removeElements(ListNode head, int val) {
        if(head == null || (head.val == val && head.next == null)){
            return null;
        }
        //创建个头结点，方便统一处理
        ListNode shou = new ListNode(0);
        shou.next = head;
        ListNode pre = shou;
        ListNode cur = shou.next;
        while (cur != null){
            if(cur.val == val){
                //删除该节点
                pre.next = cur.next;
                cur = cur.next;
            }else{
                pre = pre.next;
                cur = cur.next;
            }
        }
        return shou.next;
    }
}
