package com.daquan.leetcode.simple;

import java.util.Arrays;

/**
 * @Desc 给出 N 名运动员的成绩，找出他们的相对名次并授予前三名对应的奖牌。前三名运动员将会被分别授予 “金牌”，“银牌” 和“ 铜牌”（"Gold Medal", "Silver Medal", "Bronze Medal"）。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/relative-ranks
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author zhangdaquan
 * @Date 2021/6/30
 */
public class FindRelativeRanks {
    public static String[] findRelativeRanks(int[] score) {
        //0.找出最大值
        int max = 0;
        for (int i = 0; i < score.length; i++) {
            if(max < score[i]){
                max = score[i];
            }
        }
        max = max + 1;
        //保存当前排名
        int curRank = 0;
        //1.新建一个长度为10000的数组，分别用来放程序员排名
        int []rank = new int[max];
        //2.初始化
        Arrays.fill(rank,0);
        //3.把每个运动员成绩映射到rank的第score[i]个位置中
        for (int i = 0; i < score.length; i++) {
            rank[score[i]] = 1;
        }
        //4.从尾部遍历rank给每个运动员排名
        for (int i = (rank.length-1); i >= 0; i--) {
            if(rank[i] == 1){
                curRank++;
                //分数为i的真实排名为curRank
                rank[i] = curRank;
            }
        }
        //4.从尾部开始输出
        int k = 0;
        String []output = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            if(rank[score[i]] == 1){
                //第一名
                output[k] = "Gold Medal";
            }else if(rank[score[i]] == 2){
                //第二名
                output[k] = "Silver Medal";
            }else if(rank[score[i]] == 3){
                //第三名
                output[k] = "Bronze Medal";
            }else{
                output[k] = rank[score[i]]+"";
            }
            k++;
        }

        return output;
    }

    public static void main(String[] args) {
        int [] arr = new int[]{6,5,1,0,4};
        findRelativeRanks(arr);
    }
}
