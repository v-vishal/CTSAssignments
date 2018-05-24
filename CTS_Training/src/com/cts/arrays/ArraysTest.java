package com.cts.arrays;

public class ArraysTest {
	public static void main(String[] args) {
		Arrays arr=new Arrays();
		int i;
		int[] ar={3,48,22,36,5,8};
		//Biggest number in an array
		System.out.println(arr.BiggestNo(ar));
		//Sum of Numbers
		System.out.println(arr.Sum(ar));
		//Search for number(Linear search)
		System.out.println(arr.LinearSearch(ar, 5));
		//Bubble Sort
		int[] arPrint=arr.BubbleSort(ar);
		for(i=0;i<arPrint.length;i++){
			System.out.print(arPrint[i]+" ");
		}
		System.out.println("");
		//Selection Sort
		int[] ar1={3,48,22,36,5,8};
		ar1=arr.SelectionSort(ar1);
		for(i=0;i<ar1.length;i++){
			System.out.print(ar1[i]+" ");
		}
		System.out.println("");
		//Binary Search
		System.out.println(arr.BinarySearch(ar, 9));
		//Insert elements
	
	}

}
