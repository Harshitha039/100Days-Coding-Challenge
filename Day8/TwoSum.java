package com.palle;

import java.util.Arrays;

public class TwoSum {
	 public static int[] twoSum(int[] numbers, int target) {
		 	Arrays.sort(numbers);
	        int left=0;
	        int right=numbers.length-1;
	        while(left<right)
	        {
	            int sum=numbers[left]+numbers[right];
	            if(sum==target)
	            {
	                int[] ar={left+1,right+1};
	                return ar;
	            }
	            else if(sum<target)
	            {
	                left++;
	            }
	            else
	            {
	                right--;
	            }
	        }
	        return null;
	    }
	
	public static void main(String[] args) {
		int[] numbers= {2,7,10,3,5};
		int target=9;
		 int[] result = twoSum(numbers, target);
		 System.out.println("Sorted array: "+Arrays.toString(numbers));
        if (result != null) {
            System.out.println("Pairs found in position: " + Arrays.toString(result));
        } else {
            System.out.println("No pair found");
        }

	}

}
