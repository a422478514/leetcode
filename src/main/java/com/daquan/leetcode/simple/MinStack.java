package com.daquan.leetcode.simple;

/**
 * @Desc 最小栈
 * @Author zhangdaquan
 * @Date 2021/1/2
 */
public class MinStack {
    /** initialize your data structure here. */
    int arr[];
    int size;

    public MinStack() {
        arr = new int[10000];
        size = 0;
    }

    public void push(int x) {
        arr[size++] = x;
    }

    public void pop() {
        arr[size--] = 0;
    }

    public int top() {
        return arr[size-1];
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if( min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        /**
         * Your MinStack object will be instantiated and called as such:
         * MinStack obj = new MinStack();
         * obj.push(x);
         * obj.pop();
         * int param_3 = obj.top();
         * int param_4 = obj.getMin();
         */
    }
}
