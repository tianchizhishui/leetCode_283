package com.company;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        //corner case
        if (nums == null || nums.length == 0) {
            return;
        }

        for (int i = 0, j = 1; i < nums.length && j < nums.length; j++) {
            if (nums[i] != 0) {
                i++;
            } else {
                if (nums[j] != 0) {
                    swap(nums, i, j);
                    i++;
                }
            }
        }
        print(nums);

        // older version:

//        for (int i = 0; i < nums.length; i++) {
//            if (i == nums.length - 1) {
//                printArray(nums);
//                return;
//            }
//            if (!isZero(nums[i])) {
//                continue;
//            }
//            //int index = i;
//            for (int j = i + 1; j < nums.length; j++) {
//                if (!isZero(nums[j])) {
//                    int temp = nums[i];
//                    nums[i] =  nums[j];
//                    nums[j] = temp;
//                    break;
//
//                    //swapElement(nums[i], nums[j]);
//                    // swap(nums, i, j);
//                }
//                continue;
//            }
    }

    // if the array element is zero
    public boolean isZero(int num) {
        if (num == 0) {
            return true;
        }
        return false;
    }

    //Print array ver1
    public void printArray(int[] num) {
        if (num.length == 1) {
            System.out.println("[" + num[0] + "]");
            return;
        }
        int i = 0;
        System.out.print("[" + num[i] + ", ");
        for (i = 1; i < num.length - 1; i++) {
            System.out.print(num[i] + ", ");
        }
        i = num.length - 1;
        System.out.println(num[i] + "]");
    }

    //print array ver2
    private void print(int[] num) {
        System.out.print("[");
        for (int i = 0; i < num.length; i++) {
            if (i < num.length - 1) {
                System.out.print(num[i] + ", ");
            } else {
                System.out.print(num[i]);
            }
        }
        System.out.print("]");
    }

    //swap element of arrays
    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
