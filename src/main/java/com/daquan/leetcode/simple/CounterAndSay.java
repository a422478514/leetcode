package com.daquan.leetcode.simple;

/**
 * @Desc 外观数列
 * @Author zhangdaquan
 * @Date 2020/12/29
 */
public class CounterAndSay {
    public static String countAndSay(int n) {
        if(n == 0) return "";
        if(n == 1) return "1";
        if(n == 2) return "11";
        String str = "11";
        //从第二层开始
        for (int i = 2; i < n; i++) {
            StringBuilder newStr = new StringBuilder();
            //按不同数字分割str，并统计各数字出现次数
            int k = 1;
            Character c = str.charAt(0);
            for (int j = 1; j < str.length(); j++) {
                if( c == str.charAt(j) ){
                    k++;
                }else{
                    newStr.append(k).append(c);
                    //如果遇到新字符，保存上次记录结果，重新计数
                    k = 1;
                    c = str.charAt(j);
                }
            }
            newStr.append(k).append(c);
            str = newStr.toString();
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
}
