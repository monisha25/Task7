package taskprogram;

import java.util.Scanner;

public class Reversedstring {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String str = obj.nextLine();
		String reversedString="";
		for(int i=0;i<str.length();i++) {
			reversedString=str.charAt(i)+reversedString;
			System.out.println("The reversed string "+str+"+is "+reversedString);
			
			
		}
		
	}

}
