package Arrays;

import java.util.Random;

/*
Дан массив. Определить:
1. количество максимальных элементов в массиве;
2. количество минимальных элементов в массиве
 */
public class Homework5 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Random r = new Random();
        int min = 9;
        int max = 0;
        int minCounter = 0;
        int maxCounter = 0;
        for(int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(10);
            if(nums[i] > max) {
                max = nums[i];
            }
            if(nums[i] < min) {
                min = nums[i];
            }
            System.out.print(nums[i] + " ");
        }

        for (int num : nums) {
            if (num == max) {
                maxCounter++;
            }
            if (num == min) {
                minCounter++;
            }
        }
        System.out.println();
        System.out.println("Кол-во минимальных элементов в массиве: " + minCounter);
        System.out.println("Кол-во максимальных элементов в массиве: " + maxCounter);

    }
}