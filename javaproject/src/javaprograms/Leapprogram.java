package javaprograms;

import java.util.Scanner;

public class Leapprogram {
	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		int leap=obj.nextInt();
		if((leap%4==0)&&(leap%100!=0)||(leap%400==0)) {
			System.out.println("Y");
		}
		else {
			System.out.println("N");
		}
			
		
	}

}
