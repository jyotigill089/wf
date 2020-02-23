package wf;

import java.util.Arrays;
import java.util.Scanner;

public class anagram2 {
	
	 static boolean areAnagram(char[] str1 ,char[] str2) {
	
		 //get length of both string 
	 int n1 = str1.length;
	 int n2 = str2.length;	
	 
	 //if length is not same then no anagram
	   if(n1!= n2)
		 return false;
	   
	 
	 //sorting of array
	  Arrays.sort(str1);
	  Arrays.sort(str2);
	  
	  //campare sorted array length
	  for(int i = 0;i <n1; i++)
		  if (str1 [i]!= str2[i])
			  return false;
	  
	  return true;
	  
	 }  
	 
	public static void main(String[] args) {
	
	//	Scanner scan = new Scanner (System.in);
	//	System.out.println("enter two string");
	//	String str1 = in.nextline();
		
		 char str1[] = { 't', 'e', 's', 't' }; 
	     char str2[] = { 't', 't', 'e', 's' }; 
	     
	     if (areAnagram (str1, str2))
	     System.out.println("string is anagram");
		
	     else System.out.println("string is not anagram");
	

    }
}