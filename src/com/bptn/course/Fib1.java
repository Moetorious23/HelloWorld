package com.bptn.course;

import java.util.Scanner;

public class Fib1 {

	public static void main(String[] args) {
		
		System.out.println("Enter value:");
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		int a= 0 ;
		int b=1;
		int c;
		for (int i= 0; i< n ; i++) {
			System.out.println(a+ " ");
			c= a+b;
			a=b;
			b=c;
		}
		

	}

}
