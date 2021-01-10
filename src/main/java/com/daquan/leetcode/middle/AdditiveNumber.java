package com.daquan.leetcode.middle;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/7
 */
public class AdditiveNumber {
    public boolean isAdditiveNumber(String num) {
        int len = num.length();
        //第一位的长度
        String sub;
        for (int i = 1; i <= len / 2; i++) {
            sub = num.substring(0, i);
            if (sub.length() != 1 && sub.startsWith("0")) {
                continue;
            }
            long frist = Long.parseLong(sub);
            //第二位的起点
            for (int j = i + 1; j <= i + (len - i) / 2; j++) {
                sub = num.substring(i, j);
                if (sub.length() != 1 && sub.startsWith("0")) {
                    continue;
                }
                long second = Long.parseLong(sub);
                long sum = frist + second;
                if (num.substring(j).startsWith(String.valueOf(sum))) {
                    //顺推下去。
                    if (isValid(num, second, sum, j + String.valueOf(sum).length())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean isValid(String num, long frist, long second, int start) {
        if (start == num.length()) {
            return true;
        }
        String next = num.substring(start);
        long sum = frist + second;
        if (next.startsWith(String.valueOf(sum))) {
            return isValid(num, second, sum, start + String.valueOf(sum).length());
        }
        return false;
    }
}
