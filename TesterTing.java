package com.company;
import java.util.*;

public class TesterTing {

    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    static void max_heapify (int Arr[ ], int i, int N)
    {
        int left = 2*i;                   //left child
        int right = 2*i +1;
        int largest;            //right child
        if(left<= N && Arr[left] > Arr[i] )
        largest = left;
    else
        largest = i;
        if(right <= N && Arr[right] > Arr[largest] )
        largest = right;
        if(largest != i )
        {
            swap (Arr, Arr[i] , Arr[largest]);
            max_heapify (Arr, largest, N);
        }
    }

    public static void main(String[] args)
    {
        int [] array1 = {1,3,5,7,2,15,44, 3, 5, 6};
        max_heapify(array1, array1[3], array1[5]);




    }
}
