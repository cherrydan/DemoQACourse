package Arrays;

import java.util.Random;

public class Demo2 {

    public static void main(String[] args) {
        Random r = new Random();

        int[] nums = new int[20];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(6);
            System.out.print(nums[i] + " ");
        }
        System.out.println();


        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    nums[j] = r.nextInt(6);
                };
            }
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }


    }
}
