package com.daquan.leetcode.simple;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/10
 */
public class AddDigits {

    public static int addDigits(int num) {
        String str = num+"";
        while(str.length()>1){
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                sum += Integer.parseInt(str.charAt(i)+"");
            }
            str = sum+"";
        }
        return Integer.parseInt(str);
    }


    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
}
