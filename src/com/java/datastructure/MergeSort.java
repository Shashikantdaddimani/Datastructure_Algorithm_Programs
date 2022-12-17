package com.java.datastructure;
/**
 * imports all the  class of the java.utill package
 */
import java.util.*;

public class MergeSort {
	/*
	 *  Merge two sub arrays L and M into array
	 */
	  void merge(int array[], int start, int mid, int end) {

	    int n1 = mid - start + 1;
	    int n2 = end - mid;

	    int Left[] = new int[n1];
	    int Right[] = new int[n2];

	    /*
	     *  fill the left and right array
	     */
	    for (int i = 0; i < n1; i++)
	    	Left[i] = array[start + i];
	    for (int j = 0; j < n2; j++)
	    	Right[j] = array[mid + 1 + j];

	    /*
	     *  Maintain current index of sub-arrays and main array
	     */
	    int i, j, k;
	    i = 0;
	    j = 0;
	    k = start;
	    while (i < n1 && j < n2) {
	      if (Left[i] <= Right[j]) {
	        array[k] = Left[i];
	        i++;
	      } else {
	        array[k] = Right[j];
	        j++;
	      }
	      k++;
	    }

	    // When we run out of elements in either L or M,
	    // pick up the remaining elements and put in A[p..r]
	    while (i < n1) {
	      array[k] = Left[i];
	      i++;
	      k++;
	    }

	    while (j < n2) {
	      array[k] = Right[j];
	      j++;
	      k++;
	    }
	  }

	  /*
	   */
	  void divide(int array[], int start, int end) {
	    if (start < end) {

	      /*
	       *  m is the point where the array is divided into two sub arrays
	       */
	      int mid = (start + end) / 2;

	      /*
	       *  recursive call to each sub arrays
	       */
	      divide(array, start, mid);
	      divide(array, mid + 1, end);

	      /*
	       *  Merge the sorted sub arrays
	       */
	      merge(array, start, mid, end);
	    }
	  }

	  public static void main(String args[]) {

	    /*
	     *  created an unsorted array
	     */
	    int[] array = { 6, 5, 12, 10, 9, 1 };
	    System.out.println("given elements are:");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	    MergeSort object = new MergeSort();

	   /*
	    *   call the method mergeSort()
	    *   pass argument: array, first index and last index
	    */
	    object.divide(array, 0, array.length - 1);

	    System.out.println("Sorted elements are:");
	    System.out.println(Arrays.toString(array));
	  }
}
