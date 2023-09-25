package taskprogram;

import java.util.Scanner;

public class Palindrome {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
	
	Scanner obj = new Scanner(System.in);
    String str = obj.nextLine();
    String reversedString = ""; // making new empty string 
	// Reversing a String
    for(int i=0; i<str.length(); i++)
    {
        reversedString = str.charAt(i) + reversedString;
    }
    // Checking the string is Palindrome or not
    if(str.equals(reversedString))
    {
        System.out.println(str+" is Palindrome");
    }
    else
    {
        System.out.println(str+" is Not a Palindrome");
    }
}
}


