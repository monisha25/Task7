package javaprogram;

import java.util.Scanner;

public class Greaterthan_numbers { 
	public static void main(String[]args) {
		Scanner obj=new Scanner(System.in);
		int a= obj.nextInt();
        int b=obj.nextInt();
        int c= obj.nextInt();
        int d=obj.nextInt();
        
        if((a+b)>(c+d)){
        	System.out.println("sum of a and b is greater than the sum of c and d");
            
	}
        else{
        	System.out.println("wow");
        }

}}
