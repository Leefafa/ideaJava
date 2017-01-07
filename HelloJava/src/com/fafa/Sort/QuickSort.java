package com.fafa.Sort;

/**
 * 快速排序
 * Created by Stark on 2017/1/7 0007.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] x={6,2,4,1,5,9};
        quick_sort(x,0,x.length-1);
        System.out.println("快速排序后：");
        for (int a:x) {
            System.out.print(a+" ");
        }
    }

    static int partition(int[] unsorted, int low, int high) {
        int pivot = unsorted[low];
        while (low < high) {
            while (low < high && unsorted[high] > pivot)
                high--;
            unsorted[low] = unsorted[high];
            while (low < high && unsorted[high] <= pivot)
                low++;
            unsorted[high] = unsorted[low];
        }
        unsorted[low]=pivot;
        return low;
    }
    static void quick_sort(int[] unsorted, int low, int high){
        int loc=0;
        if (low<high){
            loc=partition(unsorted,low,high);
            quick_sort(unsorted,low,loc-1);
            quick_sort(unsorted,loc+1,high);
        }
    }
}
