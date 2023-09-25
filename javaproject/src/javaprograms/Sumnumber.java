package javaprograms;

import java.util.Scanner;

public class Sumnumber {
public static void main(String[] args) {
	Scanner obj= new Scanner(System.in);
	int a= obj.nextInt();
	int sum=0;
	for(int i=0;i<=a;i++) {
		sum=sum+i;
		
	}
	System.out.println(sum);
}
}
