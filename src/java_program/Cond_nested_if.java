package java_program;

public class Cond_nested_if {
public static void main (String args[]) {
	int A = 20;
	int B = 30;
	if (A == 20) {
		if(B == 30) {
			System.out.println("The value of A is 20 & The value of B is 30");
		}
		else {
			System.out.println("Here B condition should be excueted");
		}
	}
	else {
		System.out.println("Here A condition should be excueted");
	}
}
}
