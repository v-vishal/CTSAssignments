package com.cts.basicJava;

public class PrintPattern {
	public static void stars1(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void stars2(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j>n-i){	
					System.out.print("*");
				}	
				else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	public static void stars3(int n){
		for(int i=1;i<=n;i++){
			for(int j=n;j>=i;j--){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void numTriangle(int n){
		for(int i=1;i<=n;i++){
			int k=1;
			for(int j=1;j<=n;j++){
				if(j>n-i&&k<=i){	
					System.out.print(k);
					k++;
				}	
				else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	public static void rectangle(int l,int b){
		for(int i=1;i<=l;i++){
			for(int j=1;j<=b;j++){
				if(i==1||i==l){
					System.out.print("_");
				}
				else{
					if(j==1||j==b){
						System.out.print("|");
					}
					else{
						System.out.print(" ");
					}
				}
			}
			System.out.println("");
		}
	}

}
