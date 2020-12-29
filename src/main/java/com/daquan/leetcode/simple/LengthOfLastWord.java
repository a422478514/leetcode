package com.daquan.leetcode.simple;

/**
 * @Desc 最后一个单词的长度
 * @Author zhangdaquan
 * @Date 2020/12/29
 */
public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        int k = 0;//上一个单词的长度
        for (int i = s.length()-1; i >= 0; i--) {
            if( s.charAt(i) != ' '){
                k++;
            }else{
                if(k != 0){
                    return k;
                }
            }
        }
        return k;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
}
