package com.bptn.course;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
		/*int a= 0;
		int b= 0 ;
		int sum=1; 
		while (b <= 1000) {
			a=b;
			b= sum;
			sum = a + b;
			System.out.println(a + ",");
		}
		
		
	}

}
import java.util.Scanner;
public class Main {

public static void main(String[] args) {
*/
		
    Scanner input= new Scanner (System.in);
    System.out.println( "Enter a number");
    int num = input.nextInt();

    if(num<0){
        System.out.println("must be a positive number");
    }
    else if (num==0){
        System.out.println ("must be  a positive number");
    }
    else {
        int firstPt= 0, secondPt=1;

        for (int count=2; count<num; count++){
            int thirdPt= firstPt + secondPt;
            firstPt=secondPt;
            secondPt = thirdPt;
            System.out.println(secondPt);
        }
    }
    }
    }

/*  int t= 0;
Scanner a = new Scanner(System.in);
System.out.println("Enter a number: ");
		int b= 0 ;
		int sum=1; 
		while (b <= 40) {
			t=b;
			b= sum;
			sum = t + b;
			System.out.println(t + ",");
        }
    }
}
*/


