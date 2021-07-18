package com.daquan.leetcode.simple;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/7/7
 */
public class CheckRecord {
    public boolean checkRecord(String s) {
        if(s == null || s.length() == 1){
            return true;
        }
        int aCount = 0;
        int bContinueCount = 0;
        for (int i = 0; i < s.length(); i++) {
            //检查有几个A
            if(s.charAt(i) == 'A'){
                aCount++;
            }
            //检查有几个LL
            if(s.charAt(i) == 'L'){
                bContinueCount++;
            }else {
                //reset
                bContinueCount = 0;
            }
            if(aCount > 1 || bContinueCount > 2){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
