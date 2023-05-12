package java_program;

import java.util.Scanner;

public class Exp_add {
public static void main (String args[]) {
	int a,b,c;
	System.out.println("enter a & b values");
	Scanner obj = new Scanner(System.in);
	a = obj.nextInt();
	b = obj.nextInt();
	c = a/b;
//	c = a+b;
//	c = a*b;
//	c = a-b;
//	c = a^b;
	System.out.println("division of Two no's :" + c);
//	System.out.println("Addition of Two no's :" + c);
//	System.out.println("Mutliple of Two no's :" + c);
//	System.out.println("Substraction of Two no's :" + c);
//	System.out.println("Power of Two no's :" + c);
}
}
