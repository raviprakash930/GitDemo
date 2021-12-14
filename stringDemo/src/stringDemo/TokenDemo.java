package stringDemo;

import java.util.StringTokenizer;

public class TokenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringTokenizer st= new StringTokenizer("Ravi Prakash","a");
 while(st.hasMoreTokens())
 {
	 st.nextToken();
 }
	
 System.out.println(st.countTokens());
	}

}
