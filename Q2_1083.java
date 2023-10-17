/*
 * Name: Shikha Kumari
 * Reg No: 2241011230
 * PS LINK: https://cses.fi/problemset/task/1083
 */

import java.util.Scanner;
import java.util.Arrays;
public class Q2_1083 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		long s=0;
		long n = sc.nextLong();
		long arr[] = new long[(int) (n-1)];
		for(int i=0; i<n-1; i++) {
		 arr[i] = sc.nextInt();
		}
		if(n>=2) {
			for(int i=0; i<n-1; i++) {
				s += arr[i];
			}
				
		}
			long missNum = n*(n+1)/2 - s ;
			System.out.println(missNum);
			

	}

}
