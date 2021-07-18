package com.daquan.leetcode.middle;

/**
 * @Desc 2. 两数相加
 * @Author zhangdaquan
 * @Date 2021/7/11
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //保存相加结果
        ListNode newNode = new ListNode();
        ListNode pre = null;
        //指向Ll1
        ListNode p1 = l1;
        //指向l2
        ListNode p2 = l2;
        //标识是否进位
        boolean b = false;
        //同时不为0则继续遍历
        while (p1 != null && p2 != null){
            int v = p1.val + p2.val;
            //处理低阶进位
            if(b){
                v = v+1;
            }
           //处理高阶
            if(v > 9){
                //进位
                b = true;
                v = v%10;
            }else{
                b = false;
            }
            //新节点
            if(pre != null){
                //创建新节点保存和
                ListNode cur = new ListNode();
                cur.val = v;
                pre.next = cur;
                pre = cur;
            }else{
                //说明是第一个结点
                newNode.val = v;
                pre = newNode;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        while (p1 != null){
            ListNode cur = new ListNode();
            cur.val = p1.val;
            if(b){
                cur.val = cur.val+1;
            }
            //处理高阶
            if(cur.val > 9){
                //进位
                b = true;
                cur.val = cur.val%10;
            }else{
                b = false;
            }
            pre.next = cur;
            pre = pre.next;
            p1 = p1.next;
        }
        while (p2 != null){
            ListNode cur = new ListNode();
            cur.val = p2.val;
            if(b){
                cur.val = cur.val+1;
            }
            //处理高阶
            if(cur.val > 9){
                //进位
                b = true;
                cur.val = cur.val%10;
            }else{
                b = false;
            }
            pre.next = cur;
            pre = pre.next;
            p2 = p2.next;
        }
        if(b){
            ListNode node = new ListNode();
            node.val = 1;
            pre.next = node;
        }
        return newNode;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
