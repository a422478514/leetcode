package com.daquan.leetcode.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @Desc 同构字符串
 * @Author zhangdaquan
 * @Date 2021/1/5
 */
public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        //遍历字符，对每个遇到的字符都打上数字标签
        Map<String,Integer> tMap = new HashMap<String, Integer>();
        Map<String,Integer> sMap = new HashMap<String, Integer>();

        for (int i = 0; i < s.length(); i++) {
            //判断当前字符是否已存在
            Integer sv = sMap.get(s.charAt(i)+"");
            Integer tv = tMap.get(t.charAt(i)+"");
            if(sv == null && tv == null){
                sMap.put(s.charAt(i)+"",i);
                tMap.put(t.charAt(i)+"",i);
            }else if(sv != null && tv != null){
                if(sv.intValue() != tv.intValue()){
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));
    }
}
