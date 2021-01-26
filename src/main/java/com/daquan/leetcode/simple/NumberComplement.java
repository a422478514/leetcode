package com.daquan.leetcode.simple;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/26
 */
public class NumberComplement {
    public static int findComplement(int num) {
        StringBuilder sb = new StringBuilder();
        //十进制转二进制
        while (num > 0){
            sb.append(num%2);
            num = num/2;
        }
        String str = sb.reverse().toString();
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '0'){
                result += Math.pow(2,str.length()-i-1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findComplement(4));
    }
}
