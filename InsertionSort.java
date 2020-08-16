package com.company;

public class InsertionSort {

    static int comparisons;
    static int movements;


    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length; i++){
            int currentElement = list[i];
            int k;
            for (k= i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k+1] = list[k];
                comparisons++;
            }
            list[k+1] = currentElement;
            movements++;
        }

    }

    public int getComparisonsI() {
        return comparisons;
    }

    public int getMovementsI() {
        return movements;
    }

}
