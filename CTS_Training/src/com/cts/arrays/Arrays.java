package com.cts.arrays;

public class Arrays {
	public int BiggestNo(int[] n){
		int big = n[0];
		for(int i=1;i<n.length-1;i++){
			if(n[i]>=big){
				big=n[i];
			}
		}
		return big;
	}
	public int Sum(int[] n){
		int sum=0;
		for(int i=0;i<n.length;i++){
			sum+=n[i];
		}
		return sum;
	}
	public boolean LinearSearch(int[] n,int num){
		for(int i=0;i<n.length;i++){
			if(n[i]==num){
				return true;
			}
		}
		return false;
	}
	public int[] BubbleSort(int[]n){
		int temp;
		for(int i=n.length-2;i>=0;i--){
			for(int j=0;j<=i;j++){
				if(n[j]>n[j+1]){
					temp=n[j];
					n[j]=n[j+1];
					n[j+1]=temp;
				}
			}
		}
		return n;
	}
	public int[] SelectionSort(int[] n){
		int smLoc,temp;
		for(int i=0;i<n.length-1;i++){
			smLoc=i;
			for(int j=i+1;j<n.length;j++){
				if(n[j]<n[smLoc]){
					smLoc=j;
				}
			}
			temp=n[i];
			n[i]=n[smLoc];
			n[smLoc]=temp;
		}
		return n;
	}
	public boolean BinarySearch(int[] n,int num){
	 	n=BubbleSort(n);
		int lb=0,ub=n.length-1;
		int mid;
		while(lb<=ub){
			mid=(lb+ub)/2;
			if(num==mid){
				return true;
			}
			else if(num>mid){
				lb=mid+1;
			}
			else{
				ub=mid-1;
			}
		}
		return false;
	}
	public boolean InsertElement(int[] n,int m,int num,int pos){
		for(int i=m;i>=pos;i--){
			n[i+1]=n[i];
		}
		n[pos]=num;
		return true;
	}

}
