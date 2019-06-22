package cg;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSorted {

	public int[] getSorted(int[] a) {
		int l=a.length;
		for(int i=0;i<l;i++) {
			String temp=Integer.toString(a[i]);
			StringBuilder temp1=new StringBuilder();
			temp1.append(temp);
			temp1=temp1.reverse();
			temp=temp1.toString();
			a[i]=Integer.parseInt(temp);
			}
		Arrays.sort(a);
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		ReverseSorted rs=new ReverseSorted();
		arr=rs.getSorted(arr);
		System.out.println("Sorted Array");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		sc.close();

	}

}
