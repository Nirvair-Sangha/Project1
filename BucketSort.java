package com.company;
import java.util.*;

public class BucketSort<E extends Comparable> {

    static int movements;
    static int comparisons;

    public static void bucketSort(int[] intArr, int noOfBuckets){

        List<Integer>[] buckets = new List[noOfBuckets];

        for(int i = 0; i < noOfBuckets; i++){
            buckets[i] = new LinkedList<>();
        }

        for(int num : intArr){
            buckets[hash(num)].add(num);
            movements++;
        }

        for(List<Integer> bucket : buckets){
            Collections.sort(bucket);
        }
        int i = 0;
        for(List<Integer> bucket : buckets){
            for(int num : bucket){
                intArr[i++] = num;
            }
        }
    }

    private static int hash(int num){
        return num/10;
    }




    public int getMovementsB(){
        return movements;
    }

    public int getComparisonsB(){
        return comparisons;
    }
}





