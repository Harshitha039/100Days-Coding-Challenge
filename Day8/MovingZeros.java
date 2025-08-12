package com.palle;

import java.util.Arrays;

public class MovingZeros {
	 public static void moveZeroes(int[] nums) {
	        int slow=0;
	        for(int fast=0;fast<nums.length;fast++)
	        {
	            if(nums[fast]!=0)
	            {
	                int temp=nums[slow];
	                nums[slow]=nums[fast];
	                nums[fast]=temp;
	                slow++;
	            }
	        }
	        System.out.println("After moving zeros array is: "+Arrays.toString(nums));
	    }
	public static void main(String[] args) {
		int[] nums= {0,2,5,0,0,1,0,12};
		moveZeroes(nums);

	}

}
