/*
 * Name: Shikha Kumari
 * Reg No: 2241011230
 * PS LINK: https://cses.fi/problemset/task/1069
 */

import java.util.Scanner;
public class Q3_1069 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String dna = sc.nextLine();
	    char[] ch = dna.toCharArray();
	    long count=1, max = 1;
	    for(int i=1; i<dna.length(); i++) {
	    	if(ch[i]==ch[i-1]) 
	    		count++;
	    	else
	    		count = 1;
	    max = Math.max(max, count);
	    }
	    System.out.println(max);

	}

}
