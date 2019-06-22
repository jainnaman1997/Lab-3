package cg;

import java.util.Scanner;

public class SecondSmallest {

	public static int getSecondSmallest(int a[]) {
		int s=a[0], ss=a[0];
		for(int i:a) {
			if(a[i]<=s) {
				ss=s;
				s=a[i];
			}
		}
		return ss;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter array elements");
		for(int i: arr) {
			arr[i]=sc.nextInt();
		}
		int ss=getSecondSmallest(arr);
		System.out.println("Second smallest number in the array is "+ss);
		sc.close();

	}

}
