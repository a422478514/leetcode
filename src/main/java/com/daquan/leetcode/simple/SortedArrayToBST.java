package com.daquan.leetcode.simple;


/**
 * @Desc 将有序数组转换为二叉搜索树
 * @Author zhangdaquan
 * @Date 2020/12/31
 */
public class SortedArrayToBST {
  public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public static TreeNode sortedArrayToBST(int[] nums) {
      if(nums.length <= 0){
          return null;
      }
      TreeNode root = new TreeNode(0);
      //splice(root,nums,0,nums.length-1);
        return splice2(nums,0,nums.length-1);
    }

    public static void splice(TreeNode root,int []nums,int i, int j){
      //生成新的结点
        if(i <= j){
            //找到中间结点
            int mid = (i+j)/2;
            root.val = nums[mid];
            if(i != j){
                TreeNode left = new TreeNode(0);
                TreeNode right = new TreeNode(0);

                if( (mid +1) <= j){
                    //右子树
                    root.right = right;
                    splice(right,nums,mid+1,j);
                }
                if( i <= (mid -1)){
                    //左子树
                    root.left = left;
                    splice(left,nums,i,mid-1);
                }
            }
        }else{
            root = null;
        }
    }

    public static TreeNode splice2(int []nums,int i, int j){
        //生成新的结点
        if(i <= j){
            //找到中间结点
            int mid = (i+j)/2;
            TreeNode root = new TreeNode(nums[mid]);
            //右子树
            root.right = splice2(nums,mid+1,j);
            //左子树
            root.left = splice2(nums,i,mid-1);
            return root;
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode t = sortedArrayToBST(new int[]{-10,-3,0,5,9});
        System.out.println(123);
    }

}
