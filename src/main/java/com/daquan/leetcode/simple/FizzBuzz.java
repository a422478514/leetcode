package com.daquan.leetcode.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/16
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        String fizzBuzz = "FizzBuzz";
        String fizz = "Fizz";
        String buzz = "Buzz";
        List<String> list = new ArrayList<String>(n*2);
        for (int i = 1; i <= n; i++) {
            String temp = "";
            if(i%3 == 0){
                temp = fizz;
            }
            if(i%5 == 0){
                temp += buzz;
            }

            if(temp == ""){
                temp += String.valueOf(i);
            }
            list.add(temp);
        }
        return list;
    }
}
