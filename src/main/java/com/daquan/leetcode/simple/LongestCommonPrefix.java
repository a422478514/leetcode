package com.daquan.leetcode.simple;

/**
 * @Desc 最长公共子序列
 * @Author zhangdaquan
 * @Date 2020/12/28
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs){
        String commonStr = "";
        int i = 0;//从各字符串的第i个字符开始判断
        boolean processing = true;
        if(strs.length > 0){
            while (processing){
                //字符串未越界等特殊情况
                if(strs[0].length() <= 0 || strs[0].length() == i){
                    break;
                }
                char c  = strs[0].charAt(i);

                for(int k = 1; k < strs.length ; k++){
                    //字符串未越界等特殊情况或已经找到不匹配的字符
                    if(strs[k].length() == i || c != strs[k].charAt(i)) {
                        processing = false;
                        break;
                    }
                }
                //对比结束
                if(!processing){
                    break;
                }
                commonStr+=c;
                i++;
            }
        }
        return commonStr;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"a"}));
    }
}
