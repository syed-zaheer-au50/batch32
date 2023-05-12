package java_program;

import java.util.Scanner;

public class Exp_2_Add {
public static void main(String args[]) {
	int a,b,c,d;
	System.out.println("enter a,b,c values");
	Scanner obj = new Scanner(System.in);
	a = obj.nextInt();
	b = obj.nextInt();
	c = obj.nextInt();
	d = a-b+c;
	System.out.println("Addition 3 values :" + d);
	
}
}
