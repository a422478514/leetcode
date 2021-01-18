package com.daquan.leetcode.simple;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/16
 */
public class AddStrings {
    public String addStrings(String num1, String num2) {
        //从后向前加
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        String result = "";
        while ( i>=0 || j >= 0){
            //找到末位数
            int n1 = i >= 0 ? Integer.parseInt(num1.charAt(i)+"") : 0;
            int n2 = j >= 0 ? Integer.parseInt(num2.charAt(j)+"") : 0;
            int sum = n1+n2+carry;
            if(sum >= 10){
                //进位
                carry = 1;
                sum = sum%10;
            }else{
                //不进位
                carry = 0;
            }
            result = sum + result;
            i--;
            j--;
        }
        if(carry > 0){
            result = "1" + result;
        }
        return result;
    }
}
