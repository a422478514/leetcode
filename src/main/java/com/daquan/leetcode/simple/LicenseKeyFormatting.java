package com.daquan.leetcode.simple;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/26
 */
public class LicenseKeyFormatting {
    public static String licenseKeyFormatting(String S, int K) {
        String str = S.replace("-","");
        if(str == ""){
            return "";
        }
        String newStr = "";
        int i = 0;
        for (i = str.length(); (i-K) > 0; i=i-K) {
            newStr = str.substring(i-K,i) + "-" + newStr;
        }
        if(i > 0){
            newStr = str.substring(0,i) + "-" + newStr;
        }
        return newStr.substring(0,newStr.length()-1).toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("5F3Z-2e-9-w",4));
    }
}
