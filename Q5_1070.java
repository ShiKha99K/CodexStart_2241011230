/*
 * Name: Shikha Kumari
 * Reg No: 2241011230
 * PS LINK: https://cses.fi/problemset/task/1070
 */

import java.util.Scanner;
public class Q5_1070 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    StringBuilder permut = new StringBuilder();
	    if(n==1)
	    	System.out.println("1");
	    else if(n==2 || n==3)
	    	System.out.println("NO SOLUTION");
	    else {
	    	for(int i=n-1; i>0; i-=2)
	    		permut.append(i+" ");
	    	for(int i=n; i>0; i-=2)
	    		permut.append(i+" ");
	    	System.out.println(permut);
	    }
	    	

	}

}
