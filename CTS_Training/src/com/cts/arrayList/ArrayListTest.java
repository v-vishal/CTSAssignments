package com.cts.arrayList;

import java.util.List;

public class ArrayListTest {
	public static void main(String args[]){
		ArrayList arr=new ArrayList();
		//Integer List
		int[] num={1,2,3,4};
		List<Integer> n=new java.util.ArrayList<Integer>();
		n=arr.addInt(num);
		arr.Display(n);
		System.out.println(arr.searchList(n, 0));
		System.out.println(arr.ListPos(n, 3));
		n.add(2,0);
		arr.Display(n);
		arr.sortInt(n);
		arr.Display(n);
		System.out.println(arr.findInt(n, 2));
	}	

}