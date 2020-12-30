package com.daquan.leetcode.simple;

/**
 * @Desc x 的平方根
 * @Author zhangdaquan
 * @Date 2020/12/30
 */
public class AddBinary {

    public static String addBinary(String a, String b) {
        //取出两字符串中长度小的那个
        if(a == "" || a == null){
            return b;
        }
        if(b == "" || b == null){
            return a;
        }
        //短字符串长度
        String shortStr = a.length() > b.length() ? b : a;
        String longStr = a.length() > b.length() ? a : b;

        int distance = longStr.length() - shortStr.length();
        if(distance > 0){
            for (int i = 0; i < distance; i++) {
                shortStr = "0" + shortStr;
            }
        }


        String result = "";
        boolean flag = false;//进位标志
        //从后向前迭代字符串的字符
        for (int i = shortStr.length()-1; i >= 0 ; i--) {
            if(shortStr.charAt(i) == '1' && longStr.charAt(i) == '1'){
                if(flag){
                    result = "1" + result;
                }else{
                    result = "0" + result;
                }
                flag = true;
            }else if(shortStr.charAt(i) == '1' || longStr.charAt(i) == '1'){
                if(flag){
                    result = "0" + result;
                    flag = true;
                }else{
                    result = "1" + result;
                }
            }else{
                if(flag) {
                    result = "1" + result;
                    flag = false;
                }else{
                    result = "0" + result;
                }
            }
        }

        if(flag){
            result = "1" + result;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11","1"));
    }
}
