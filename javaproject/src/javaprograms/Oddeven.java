package javaprograms;

import java.util.Scanner;

public class Oddeven {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        
         if(a%2==0){
            System.out.print("Even");
            }
            else{
                System.out.print("Odd");
            }
	}
}
