package javaprograms;

import java.util.Scanner;

public class Swapvalues {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a= obj.nextInt();
		int b= obj.nextInt();
		System.out.println("before swapping A value is"+a+" "+"B value is "+b);
		int x=a;
		a=b;
		b=x;
		System.out.println("after swapping A value is "+a+" "+"B value is"+b);
		
		
			
	}

}
