package javaprograms;

import java.util.Scanner;

public class Primenumber {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
		int a= obj.nextInt();
		boolean f= false;
		
		for(int i=2;i<=a/2;++i) {
			if(a%i==0) {
				f=true;
			break;	
			}
			}
			if (!f) 
				System.out.println(a+" is a prime number");
			
			else 
			System.out.println(a+"is a not prime number");
		}}


