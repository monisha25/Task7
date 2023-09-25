package javaprograms;

import java.util.Scanner;

public class Singleline {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int a= obj.nextInt();
		String s=String.valueOf(a);
		StringBuffer n=new StringBuffer();
		
	
for(int i=0;i<s.length();i++) {
		String c=s.charAt(i)+" ";
		n.append(c);
		
	}
System.out.println(n.toString().trim());
	}

}
