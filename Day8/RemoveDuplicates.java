package com.palle;

import java.util.Arrays;

public class RemoveDuplicates {

	public static int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
         int k = 1;
	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] != nums[i - 1]) {
	                nums[k] = nums[i];
	                k++;
	            }
	        }
	        
	        for (int i = 0; i < k; i++) {
	            System.out.println(nums[i]);
	        }
	        
	        return k;
    }
	public static void main(String[] args) {
		int[] ar= {0,0,1,2,1};
		removeDuplicates(ar);
	}

}
