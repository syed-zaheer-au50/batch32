package java_program;
import java.util.Scanner;
public class Switch_case {
	    public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("1.Add");
	    System.out.println("2.Sub");
	    System.out.println("3.Div");
	    System.out.println("4.Multiply");
	    System.out.println("enter your first number");
	    int a = sc.nextInt();
	    System.out.println("enter your second number");
	    int b = sc.nextInt();
	    System.out.println("enter your option");
	    int opt = sc.nextInt();
	    switch(opt) {
	    case 1 :
	    	System.out.println(a+b);
	    	break;
	    case 2 :
	    	System.out.println(a-b);
	    	break;
	    case 3 :
	    	System.out.println(a/b);
	    	break;
	    case 4 :
	    	System.out.println(a*b);
	    	break;
	    default :
	    	System.out.println("option is not valid");
	    }
	    }
	    }