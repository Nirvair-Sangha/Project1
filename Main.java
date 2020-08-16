package com.company;
import java.util.*;

public class Main<E extends Comparable> {

    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int size = sc.nextInt();
        int[] gg = new int[size];

        System.out.println("Enter the single digit number to choose what type of list you want to sort\n" +
                "1: In Order\n2: Reverse Order\n3: Almost Order\n4: Random ");

        int input = sc.nextInt();
        switch (input)
        {
            case 1: for (int a = 0; a < size; a++) { int randNum = rand.nextInt(size); gg[a] = randNum; }
                    Arrays.sort(gg);
                    break;

            case 2: for (int i = 0; i < size; i++) { int randNum = rand.nextInt(size); gg[i] = randNum; }
                    Arrays.sort(gg);
                    int b, k, t;
                    for (b = 0; b < size / 2; b++) {
                        t = gg[b];
                        gg[b] = gg[size - b - 1];
                        gg[size - b - 1] = t;
                    }
                    break;

            case 3: for (int j = 0; j < ((size * 4)/5); j++) { int randNum = rand.nextInt(size); gg[j] = randNum; }
                    Arrays.sort(gg);
                    for (int j = ((size * 4)/5); j < size; j++) { int randNum = rand.nextInt(size); gg[j] = randNum; }
                    break;

            case 4: for (int z = 0; z < size; z++) { int randNum = rand.nextInt(size); gg[z] = randNum; }
                    break;

        }

        //QuickSort
        int [] quickGg = gg.clone();
        long b = System.currentTimeMillis();
        QuickSort q1=new QuickSort();
        q1.quickSort(quickGg);
        long a = System.currentTimeMillis();
        long quickSortTime = (a-b);

        //InsertionSort
        int [] insertGg = gg.clone();
        long c = System.currentTimeMillis();
        InsertionSort q2 = new InsertionSort();
        q2.insertionSort(gg);
        long d = System.currentTimeMillis();
        long insertionSortTime = (d-c);

        //SelectionSort
        int [] selectGg = gg.clone();
        long e = System.currentTimeMillis();
        SelectionSort q3 = new SelectionSort();
        q3.selectionSort(selectGg);
        long f = System.currentTimeMillis();
        long selectionSortTime = (f-e);

        //MergeSort
        int [] mergeGg = gg.clone();
        long g = System.currentTimeMillis();
        MergeSort q4 = new MergeSort();
        q4.mergeSort(mergeGg);
        Long h = System.currentTimeMillis();
        long mergeSortTime = (h-g);

        //HeapSort
        Integer [] heapGg = new Integer[size];
        for(int i = 0; i < size; i++)
            heapGg[i] = gg[i];
        long j = System.currentTimeMillis();
        HeapSort q5 = new HeapSort();
        q5.heapSort(heapGg);
        long k = System.currentTimeMillis();
        long heapSortTime = (k-j);

        //RadixSort
        int [] radixGg = gg.clone();
        long l = System.currentTimeMillis();
        Radix q6 = new Radix();
        q6.radixSort(radixGg, size);
        long m = System.currentTimeMillis();
        long radixSortTime = (m-l);

        //BucketSort
        int [] bucketGg = gg.clone();
        long s = System.currentTimeMillis();
        BucketSort q7 = new BucketSort();
        q7.bucketSort(bucketGg, size);
        long t = System.currentTimeMillis();
        long bucketSortTime = (t-s);


        long[] q = {quickSortTime, insertionSortTime, selectionSortTime, mergeSortTime, heapSortTime, radixSortTime, bucketSortTime};
        long min = Math.min(quickSortTime, Math.min(insertionSortTime, Math.min(selectionSortTime, Math.min(mergeSortTime, Math.min(heapSortTime, Math.min(radixSortTime, bucketSortTime))))));

        //if(min == quickSortTime) {
            System.out.println("Winning Algorithm: Quick Sort");
            System.out.println("Number of Comparisons: " + q1.getComparisonsQ());
            System.out.println("Number of Movements: " + q1.getMovementsQ());
            System.out.println("Total Time: " + quickSortTime);
       // }
        //else if(min == insertionSortTime) {
            System.out.println("Winning Algorithm: Insertion Sort");
            System.out.println("Number of Comparisons: " + q2.getComparisonsI());
            System.out.println("Number of Movements: " + q2.getMovementsI());
            System.out.println("Total Time: " + insertionSortTime);
       // }
       // else if(min == selectionSortTime) {
            System.out.println("Winning Algorithm: Selection Sort");
            System.out.println("Number of Comparisons: " + q3.getComparisonsS());
            System.out.println("Number of Movements: " + q3.getMovementsS());
            System.out.println("Total Time: " + selectionSortTime);
        //}
       // else if(min == mergeSortTime) {
            System.out.println("Winning Algorithm: Merge Sort");
            System.out.println("Number of Comparisons: " + q4.getComparisonsM());
            System.out.println("Number of Movements: " + q4.getMovementsM());
            System.out.println("Total Time: " + mergeSortTime);
       // }
       // else if(min == heapSortTime) {
            System.out.println("Winning Algorithm: Heap Sort");
            System.out.println("Number of Comparisons: " + q5.getComparisonsHS());
            System.out.println("Number of Movements: " + q5.getMovementsHS());
            System.out.println("Total Time: " + heapSortTime);
       // }
       // else if (min == radixSortTime) {
            System.out.println("Winning Algorithm: Radix Sort");
            System.out.println("Number of Comparisons: " + q6.getComparisonsR());
            System.out.println("Number of Movements: " + q6.getMovementsR());
            System.out.println("Total Time: " + radixSortTime);
       // }
            System.out.println("Winning Algorithm: Bucket Sort");
            System.out.println("Number of Comparisons: " + q7.getComparisonsB());
            System.out.println("Number of Movements: " + q7.getMovementsB());
            System.out.println("Total Time: " + bucketSortTime);


    }


}

