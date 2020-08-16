package com.company;

public class MergeSort {

    static int comparisons;
    static int movements;

    public static void mergeSort(int [] list) {
        if(list.length > 1) {
            int [] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);

            int secondHalfLength = list.length - list.length / 2;
            int [] secondHalf = new int[secondHalfLength];
            System.arraycopy(list, list.length /2, secondHalf, 0 , secondHalfLength);
            mergeSort(secondHalf);

            merge(firstHalf, secondHalf, list);
        }
    }

    public static void merge(int [] list1, int[] list2, int[] temp) {
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;

        while (current1 < list1.length && current2 < list2.length) {
            comparisons++;
            if(list1[current1] < list2[current2]) {
                temp[current3++] = list1[current1++];
                movements++;
            }
            else {
                temp[current3++] = list2[current2++];
                movements++;
            }
        }

        while (current1 < list1.length) {
            temp[current3++] = list1[current1++];
            comparisons++;
            movements++;
        }

        while (current2 < list2.length) {
            temp[current3++] = list2[current2++];
            comparisons++;
            movements++;

        }
    }

   /* public static void main(String[] args){
        int[] list = {2, 3, -2, 5, 6, 2, 3, 14, 22};
        mergeSort(list);
        for(int i =0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }*/

    public int getComparisonsM() {
        return comparisons;
    }

    public int getMovementsM() {
        return movements;
    }

}
