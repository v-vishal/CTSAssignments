package com.cts.basicJava;

public class NumbersTest {
	public static void main(String args[]){
		Numbers number=new Numbers();
		//Add
		System.out.println(number.addNum(10, 20));
		System.out.println(number.addNum(number.addNum(10, 20), 20));
		//Biggest Number
		System.out.println(number.big(10, 20));
		System.out.println(number.big(number.big(4, 6), 2));
		//Even or Odd
		if(number.evenOrOdd(10)){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
		//Grade
		System.out.println(number.gradeIfElse(70,60,50));
		System.out.println(number.gradeSwitch(90, 80, 70));
		//Natural Numbers
		number.natNum(1);
		//Reverse natural numbers
		number.natNumRev(1);
		//Even Natural numbers
		number.natNumEven(1);
		//Prime Number
		System.out.println(number.checkPrime(7));
		//Print prime numbers
		for(int i=2;i<=100;i++){
			if(number.checkPrime(i)==true){
				System.out.print(i+" ");
			}
		}
		//Sum of Digits
		System.out.println("\n"+number.digitSum(1234));
		//Sum of digits till sum<9
		System.out.println(number.luckyNum(56789));
		//reverse
		System.out.println(number.reverse(9876));
		//Palindrome
		if(1551==number.reverse(1551)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
		//Factorial
		System.out.println(number.fact(4));
		//nCr
		int n=5;
		int r=3;
		System.out.println(number.fact(n)/(number.fact(r)*number.fact(n-r)));
		//number to text
		System.out.println(number.numToWord(3));
		//number of larger numbers to words
		System.out.println(number.numToWords(115));
	}

}
