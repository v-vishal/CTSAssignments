package com.cts.arrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList {
	public List<Integer> addInt(int[] n){
		List<Integer> num=new java.util.ArrayList<Integer>();
		for(int i=0;i<n.length;i++){
			num.add(n[i]);
		}
		return num;
	}
	public boolean searchList(List<Integer> n,int num){
		for(int i:n){
			if(i==num){
				return true;
			}
		}
		return false;
	}
	public int ListPos(List<Integer> n,int num){
		int i=0;
		for(int a:n){
			i++;
			if(a==num){
				return i;
			}
		}
		return i-1;
	}
	public int findInt(List<Integer> n,int pos) {
		return n.get(pos);
	}
	public List<Integer> sortInt(List<Integer> n){
		//List<Integer> nl=new ArrayList<>();
		Collections.sort(n);
		return n;
	}
	
	public void addString(String[] s){
		
	}
	public static void Display(List<Integer> n){
		Iterator<Integer> it=n.iterator();
		System.out.print('\n');
		while(it.hasNext()){
			System.out.print(it.next());
		}
		System.out.print('\n');
		for(int num:n){
			System.out.print(num);
		}
	}

}
