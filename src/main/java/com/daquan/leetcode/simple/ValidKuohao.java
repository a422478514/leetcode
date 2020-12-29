package com.daquan.leetcode.simple;

import java.util.Stack;
import java.util.Vector;

/**
 * @Desc 括号匹配
 * @Author zhangdaquan
 * @Date 2020/12/29
 */
public class ValidKuohao {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        //遍历真个字符串
        for (int i = 0; i < s.length(); i++) {
            //遇到左括号压栈
            Character c = s.charAt(i);
            if( c == '{' || c == '[' || c == '('){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                Character e = stack.pop();
                if(e == null){
                    return false;
                }else {
                    if((e == '{' && c == '}') || (e == '[' && c == ']') || (e == '(' && c == ')')){

                    }else{
                        return false;
                    }
                }

            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        System.out.println(isValid(")"));
    }
}
