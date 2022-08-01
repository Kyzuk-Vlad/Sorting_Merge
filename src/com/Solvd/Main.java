package com.Solvd;
import java.util.Arrays;

public class Main {
    public static void main(String args[])
    {
        int[] array = new int[6];
        System.out.println("Created Array:");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int) Math.round((Math.random() * 20) - 10);
        }

        System.out.println(Arrays.toString(array));

        Sorting sorter = new Sorting();
        sorter.MergeSort(array, 0, array.length - 1);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(array));
    }
}
