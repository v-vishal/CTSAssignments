package com.cts.strings;

public class Strings {
	public boolean compareString(String s1,String s2){
		if(s1.length()==s2.length()){
			for(int i=0;i<s1.length();i++){
				if(s1.charAt(i)!=s2.charAt(i)){
					return false;
				}
			}
			return true;
		}
		return false;
	}
	public String reverseString(String s){
		String rev="";
		for(int i=s.length()-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}
		return rev;
	}
	public boolean palindrome(String s){
		int mid=(s.length()/2)-1;
		for(int i=0,j=s.length()-1;i<mid;i++,j--){
			if(s.charAt(i)!=s.charAt(j)){
				return false;
			}
		}
		return true;
	}
	public int countNum(String s){
		int num,count=0;
		for(int i=0;i<s.length();i++){
			num=s.charAt(i);
			if(num>47&&num<58){
				count++;
			}
		}
		return count;
	}
	public int countLower(String s){
		int num,count=0;
		for(int i=0;i<s.length();i++){
			num=s.charAt(i);
			if(num>96&&num<123){
				count++;
			}
		}
		return count;
	}

}
