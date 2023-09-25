package javaprograms;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Circleprogram {
	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		DecimalFormat dec= new DecimalFormat("0.00");
		double radius=obj.nextDouble();
		
		if (radius>0) {
		double area=Math.PI*2*radius;
		//double round=Math.round(area*100)/100;
		System.out.println(dec.format(area));
		}
		else
			System.out.println("Error  ");
	}

}
