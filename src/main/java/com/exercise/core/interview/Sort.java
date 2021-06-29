package com.exercise.core.interview;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 5, 3};
        System.out.println(Arrays.asList(arr));
        bubbleSort(arr);
        System.out.println(Arrays.asList(arr));

    }

    public static void bubbleSort(int[] arr ) {
        for(int i = 0;  i < arr.length; i++) {
            for(int j = 0; j < arr.length -1 - i; j++){
                if(arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

