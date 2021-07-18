package com.daquan.leetcode.simple;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/7/3
 */
public class DetectCapitalUse {
    public static boolean detectCapitalUse(String word) {
        //1.循环遍历该单词
        if(word.length() == 1){
            return true;
        }
        char first = word.charAt(0);
        char second = word.charAt(1);
        boolean isAllSmall = true;
        boolean isAllBig = true;
        if(word.length() > 2){
            for (int i = 2; i < word.length(); i++) {
                if (word.charAt(i) <= 'Z' && word.charAt(i) >= 'A'){
                    isAllSmall = false;
                }else{
                    isAllBig = false;
                }
            }
        }
        if(first <= 'Z' && first >= 'A'){
            if(second <= 'Z' && second >= 'A'){
                //该字符串符合类型应该为全大写类型
                return isAllBig;
            }else {
                //该字符串后续字符应该为全小写类型
                return isAllSmall;
            }
        }else{
            if(second <= 'Z' && second >= 'A'){
                return false;
            }else {
                //该字符串应该为全小写类型
                return isAllSmall;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("isA"));
    }

}
