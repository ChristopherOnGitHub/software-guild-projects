/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDSorting;

import java.util.Random;

public class SelectionSort {
  
    public static void selection_sort(int[] a) {
        int[] b = new int[10];
        while ((a[0] > a[1]) || (a[1] > a[2]) || (a[2] > a[3]) || (a[3] > a[4])
                || (a[4] > a[5]) || (a[5] > a[6]) || (a[6] > a[7]) || a[7] > a[8]
                || (a[8] > a[9])) {

            for (int i = 0; i < 10; i++) {
                b[i] = a[i];
                if ((i > 0) && (b[i] < b[i - 1])) {
                    swap(b, i, i - 1);
                }

            }

            for (int i = 0; i < 10; i++) {
                a[i] = b[i];
            }
        }

    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        int i;

        // Fill up the array with random numbers
        for (i = 0; i < arr.length; i++) {
            arr[i] = 1 + r.nextInt(100);
        }

        // Display it
        System.out.print("before: ");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Sort it
        selection_sort(arr);

        // Display it again to confirm that it's sorted
        System.out.print("after : ");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
