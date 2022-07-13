package Arrays;

import java.util.Random;
import java.util.Scanner;

/*
Составить программу:
1. нахождения минимального значения среди элементов любой строки двумерного
массива;
2. нахождения максимального значения среди элементов любого столбца двумерногоВопро
 */
public class Homework6 {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        //Сначала спрсим у пользователя сколько строк и столбцов будет в массиве
        System.out.println("Введите кол-во строк двумерного массива --> ");
        int rows = sc.nextInt();
        System.out.println("Введите кол-во столбцов двумерного массива --> ");
        int cols = sc.nextInt();
        int[][] nums = new int[rows][cols];
        int min = 9;
        int max = 0;

        //Заполняем сам массив
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums[i].length; j++) {
                nums[i][j] = r.nextInt(10);
                System.out.print(nums[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("Введите номер строки для нахождения минимума --> ");
        int row_to_findmin = sc.nextInt();
        for(int j = 0; j < nums[row_to_findmin].length; j++) {
            if(nums[row_to_findmin][j] < min) {
                min = nums[row_to_findmin][j];
            }
        }
        System.out.println("Минимум = " + min);

        System.out.println("Введите номер столбца для нахождения максимума --> ");
        int column_to_findmax = sc.nextInt();
        for (int[] num : nums) {
            if (num[column_to_findmax] > max) {
                max = num[column_to_findmax];
            }
        }
        System.out.println("Максимум = " + max);

        }
}
