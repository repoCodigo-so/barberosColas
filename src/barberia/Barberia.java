/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package barberia;

import java.util.Arrays;

/**
 *
 * @author connec
 */
public class Barberia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 6, 4, 3, 20, 21};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5, 6]
        int[] arr2 = {5, 2, 1, 6, 4, 3, 20, 21};
        bubbleSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex-1);
            quickSort(arr, partitionIndex+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}

