package com.cts.basicJava;

public class Numbers {
	public int addNum(int n1, int n2) {
		int sum = 0;
		sum = n1 + n2;
		return sum;
	}
	public int big(int n1,int n2){
		if(n1>n2){
			return n1;
		}
		else{
			return n2;
		}
	}
	public boolean evenOrOdd(int n){
		if(n%2==0){
			return true;
		}
		else{
			return false;
		}
	}
	public String gradeIfElse(int m1,int m2,int m3){
		float avg=(m1+m2+m3)/3;
		if(avg>=90){
			return "A+";
		}
		else if(avg<90&&avg>=80){
			return "A";
		}
		else if(avg<80&&avg>=70){
			return "A-";
		}
		else if(avg<70&&avg>=60){
			return "B+";
		}
		else if(avg<60&&avg>=50){
			return "B";
		}
		else{
			return "Fail";
		}
	}
	public String gradeSwitch(int m1,int m2,int m3){
		int avg=(m1+m2+m3)/3;
		switch(avg/10){
		case 10:
		case 9:{
			return "A+";
		}
		case 8:{
			return "A";
		}
		case 7:{
			return "A-";
		}
		case 6:{
			return "B+";
		}
		case 5:{
			return "B";
		}
		default:{
			return "Fail";
		}
		}
	}
	public void natNum(int st){
		for(int i=0;i<10;i++,st++){
			System.out.print(st+(i!=9?",":"\n"));
		}
	}
	public void natNumRev(int st){
		for(int i=9;i>=0;i--){
			System.out.print((st+i)+(i!=0?",":"\n"));
		}
	}
	public void natNumEven(int st){
		for(int i=0;i<20;i++,st++){
			if(st%2==0){
			System.out.print(st+(i!=19?",":"\n"));
			}
		}
	}
	public boolean checkPrime(int n){
		int count=0;
		for(int i=1;i<=n/2;i++){
			if(n%i==0){
				count++;
			}
		}
		if(count<=1){
			return true;
		}
		else
			return false;
	}
	public int digitSum(int num){
		int sum=0,rem;
		while(num>0){
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		return sum;
	}
	public int luckyNum(int num){
		int sum=0,rem;
		while(num>0){
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			if(sum>9&&num==0){
				num=sum;
				sum=0;
			}
		}
		return sum;
	}
	public int reverse(int num){
		int rev=0,rem;
		while(num>0){
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
	return rev;
	}
	public int fact(int num){
		int prod=1;
		for(int i=num;i>0;i--){
			prod*=i;
		}
		return prod;
	}
	public String numToWord(int num){
		if(num==1)
			return "One";
		else if(num==2)
			return "Two";
		else if(num==3)
			return "Three";
		else if(num==4)
			return "Four";
		else if(num==5)
			return "Five";
		else if(num==6)
			return "Six";
		else if(num==7)
			return "Seven";
		else if(num==8)
			return "Eight";
		else if(num==9)
			return "Nine";
		else
			return "";
	}
	public String numToWords(int num){
		String ones[]={"One","Two","Three","Four","Five","Six","Seven","Eight",
				"Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen",
				"Sixteen","Seventeen","Eighteen","Nineteen"};
		String tens[]={"Twenty","Thirty","Fourty","Fifty","Sixty","Seventy",
				"Eighty","Ninety"};
		String word[]={"","",""};
		int i,j=num%100;
		while(num>0){
			i=num%10;
			if(num>=100&&i>0){
				word[2]=word[2].concat(ones[i-1]);
			}
			else if(num>=10&&num<100&&i>0){
				if(j>=11&&j<20){
					word[1]=word[1].concat(ones[j-1]);
					break;
				}
				else{
				word[1]=word[1].concat(tens[i-2]);
				}
			}
			else{
				word[0]=word[0].concat(ones[i-1]);
			}
			num=num/10;
		}
		return word[0]+' '+word[1]+' '+word[2];
	}

}
