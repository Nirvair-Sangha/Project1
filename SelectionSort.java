package com.company;

public class SelectionSort {

    static int comparisons;
    static int movements;

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;
            movements++;
            for (int j = i + 1; j < list.length; j++){
                if(currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                    movements++;
                }
                comparisons++;
            }

            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
                movements++;
            }
        }
    }

    public int getComparisonsS() {
        return comparisons;
    }

    public int getMovementsS() {
        return movements;
    }

}
