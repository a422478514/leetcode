package com.daquan.leetcode.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/12
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        //先保存magazine中的每个字符
        Map<Character,Integer> magMap = new HashMap<Character,Integer>();
        for (int i = 0; i < magazine.length(); i++) {
            Character c = magazine.charAt(i);
            Integer v = magMap.get(c);
            if(v == null){
                v= 0;
            }
            magMap.put(c,v+1);
        }
        //遍历ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {
            Character c = ransomNote.charAt(i);
            Integer v = magMap.get(c);
            if(v == null || v == 0){
                return false;
            }
            magMap.put(c,v-1);
        }
        return true;
    }
}
