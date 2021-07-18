package com.daquan.leetcode.middle;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/7/12
 */
public class ConvertZ {
    public static String convert(String s, int numRows) {

        if (numRows == 1) return s;

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++)
            rows.add(new StringBuilder());

        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();
    }

//    public static String convert2(String s, int numRows) {
//        if(numRows == 1 || s.length() == 1){
//            return s;
//        }
//        int len = s.length();
//        int cols = 200;
//        char arr[][] = new char[numRows][cols];
//
//        int k = 0;
//        int j = 0;
//        boolean isDown = true;
//        char[] charArray = s.toCharArray();
//        //迭代字符串
//        for (int i = 0; i < len; i++) {
//            arr[k][j] = charArray[i];
//            if(isDown){
//                k++;
//            }else{
//                k--;
//                j++;
//            }
//            //判断是否到底
//            if(k == numRows-1){
//                //到底则向上
//                isDown = false;
//            }
//            if(k == 0){
//                //到顶则向下
//                isDown = true;
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < numRows; i++) {
//            for (int l = 0; l < cols; l++) {
//                if(arr[i][l] != '\0'){
//                    sb.append(arr[i][l]);
//                }
//            }
//        }
//        return sb.toString();
//    }

    public static void print(char arr[][]){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int l = 0; l < arr[0].length; l++) {
                if(arr[i][l] != '\0'){
                    sb.append(arr[i][l]);
                }
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {

        String paypalishiring = convert("PAYPALISHIRING", 4);
        System.out.println(paypalishiring);
    }
}
