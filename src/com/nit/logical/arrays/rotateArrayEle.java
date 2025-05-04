package com.nit.logical.arrays;
 

public class rotateArrayEle {
    public static int[] rotateLeft3(int[] nums) {
        return new int[] { nums[1], nums[2], nums[0] };
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] rotatedArr = rotateLeft3(arr);

        System.out.print("Rotated Array: ");
        for (int num : rotatedArr) {
            System.out.print(num + " ");
        }
    }
}
