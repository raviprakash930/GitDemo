package stringDemo;

import java.util.Scanner;

public class StrReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2 = "";
		Scanner s= new Scanner(System.in);
		s1=s.next();
		int n=s1.length();
		for(int i=n-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
	

	}

}
