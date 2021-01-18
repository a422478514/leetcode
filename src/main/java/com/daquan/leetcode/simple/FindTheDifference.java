package com.daquan.leetcode.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/12
 */
public class FindTheDifference {
    public static char findTheDifference(String s, String t) {
        //先保存magazine中的每个字符
        Map<Character,Integer> magMap = new HashMap<Character,Integer>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            Integer v = magMap.get(c);
            if(v == null){
                v= 0;
            }
            magMap.put(c,v+1);
        }
        //遍历ransomNote
        for (int i = 0; i < t.length(); i++) {
            Character c = t.charAt(i);
            Integer v = magMap.get(c);
            if(v == null || v == 0){
                return c;
            }
            magMap.put(c,v-1);
        }
        for(Character c : magMap.keySet()){
            if(magMap.get(c) == 1){
                return c;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("a","aa"));
    }
}
