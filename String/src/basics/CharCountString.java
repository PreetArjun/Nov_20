package basics;

import java.util.Scanner;

public class CharCountString {
	public static void main(String[] args) {
		System.out.println("Enter the String:");
		Scanner sc = new Scanner(System.in);
	String s  =	sc.nextLine();
	int count =0;
	for(int i=0; i<=s.length()-1; i++)
	{
		if(s.charAt(i)== 'i')
		{
			count++;
		}
	}
	System.out.println("Number of Words:" + count);
	}

}
