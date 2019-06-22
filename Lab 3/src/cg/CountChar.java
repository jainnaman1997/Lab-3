package cg;

import java.util.Scanner;

public class CountChar {

	public static String[][] getCharCount(char ch[]){
		int l=ch.length;
		char []c=new char[l];
		for(int i=0;i<l;i++) {
			c[i]=' ';
		}
		int []count=new int[l];
		c[0]=ch[0];
		count[0]++;
		for(int i=1;i<l;i++) {
			for(int j=0;j<l;j++) {
				if(ch[i]==c[j]) {
					count[j]++;
					break;
				}
				else if(c[j]==' ') {
					c[j]=ch[i];
					count[j]++;
					break;
				}
			}
		}
		int i=0;
		for(int j=0;j<l;j++) {
			if(c[j]!=' ')
				i++;
		}
		String [][]st=new String[i][2];
		for(int j=0;j<i;j++) {
			st[j][0]=Character.toString(c[j]);
			st[j][1]=Integer.toString(count[j]);
		}
		return st;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		char []ch=s.toCharArray();
		String [][]count=getCharCount(ch);
		for(int i=0;i<count.length;i++) {
			System.out.println("Count of "+count[i][0]+" is "+count[i][1]);
		}
		sc.close();
		
		

	}

}
