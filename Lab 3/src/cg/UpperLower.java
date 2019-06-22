package cg;

import java.util.Arrays;
import java.util.Scanner;

public class UpperLower {

	public static String[] sortString(int n, String[] s) {
		Arrays.sort(s);
		int i;
		if(n%2==0) {
			for(i=0;i<n/2;i++) {
				s[i]=s[i].toUpperCase();
				s[i+n/2]=s[i+n/2].toLowerCase();
			}
		}
		else {
			for(i=0;i<n/2+1;i++) {
				s[i]=s[i].toUpperCase();
				s[i+n/2]=s[i+n/2].toLowerCase();
			}
			s[n/2]=s[n/2].toUpperCase();
		}
		return s;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=sc.nextInt();
		String []s=new String[n];
		System.out.println("Enter string elements");
		int i;
		for(i=0;i<n;i++) {
			s[i]=sc.next();
		}
		s=sortString(n, s);
		System.out.println("Resulted string array is");
		for(i=0;i<n;i++) {
			System.out.println(s[i]);
		}
		sc.close();

	}

}
