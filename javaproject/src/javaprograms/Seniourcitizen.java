package javaprograms;

import java.util.Scanner;

public class Seniourcitizen {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int birthdayyear=obj.nextInt();
		int currentyear=obj.nextInt();
		int age=birthdayyear-currentyear;
		if(age>=60) 
			System.out.println("senior citizen");
			else
				System.out.println("Not a senior citizen");
				
				
		}

}
