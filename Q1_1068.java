/*
 * Name: Shikha Kumari
 * Reg No: 2241011230
 * PS LINK: https://cses.fi/problemset/task/1068
 */

import java.util.Scanner;

public class Q1_1068 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		System.out.print(n+" ");
		if(n>0 && n<=Math.pow(10, 6)) {
			while(n!=1) {
				if(n%2==0) {
					n/=2;
				}
				else {
					n =n*3+1;
				}
				System.out.print(n+" ");
			}
		}
	}

}
