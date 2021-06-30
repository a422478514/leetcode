package com.daquan.leetcode.simple;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/27
 */
public class KeyboardRow {
    public String[] findWords(String[] words) {
        String str1 = "qwertyuiop";
        String str2 = "asdfghjkl";
        String str3 = "zxcvbnm";

        Set<Character> sSet1 = new HashSet<Character>();
        Set<Character> sSet2 = new HashSet<Character>();
        Set<Character> sSet3 = new HashSet<Character>();

        for (int i = 0; i < str1.length(); i++) {
            sSet1.add(str1.charAt(i));
        }
        for (int i = 0; i < str2.length(); i++) {
            sSet2.add(str2.charAt(i));
        }
        for (int i = 0; i < str3.length(); i++) {
            sSet3.add(str3.charAt(i));
        }

        List<String> list = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            boolean b1 = true;
            boolean b2 = true;
            boolean b3 = true;

            String s = words[i];
            s = s.toLowerCase();
            for (int j = 0; j < s.length(); j++) {
                if(!sSet1.contains(s.charAt(j))){
                    b1 = false;
                    break;
                }
            }
            for (int j = 0; j < s.length(); j++) {
                if(!sSet2.contains(s.charAt(j))){
                    b2 = false;
                    break;
                }
            }
            for (int j = 0; j < s.length(); j++) {
                if(!sSet3.contains(s.charAt(j))){
                    b3 = false;
                    break;
                }
            }
            if(b1 || b2 || b3){
                list.add(words[i]);
            }
        }

        return list.toArray(new String[list.size()]);
    }
}
