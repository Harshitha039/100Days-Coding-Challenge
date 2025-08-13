package com.palle;

public class MaxWaterContainer {
	public static int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max_area=0;
        while(left<right)
        {
            int base=right-left;
            int len=Math.min(height[left],height[right]);
            int area=base*len;
            max_area=Math.max(max_area,area);
            if(height[left]<height[right])
            {
                left++;
            }
            else{
                right--;
            }
        }
        return max_area;
    }
	public static void main(String[] args) {
		int[] height= {1,8,6,2,5,4,8,3,7};
		System.out.println("Maximum area of container is: "+maxArea(height));
	}

}
