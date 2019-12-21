package com.nidong.shop.shoppingMall.biz.suanfa.week1;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/move-zeroes
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Test283 {

    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int index = 0;
        for(int num:nums){
            if(num!=0){
                nums[index++]=num;
            }
        }
        while(index<nums.length){
            nums[index++] = 0;
        }
    }
}
