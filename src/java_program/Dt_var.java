package java_program;

public class Dt_var {
	int b = 30 ; //instance var
	static int appleid = 15; // static var
	public void s1() {
		int a = 25; //local var
		System.out.println("s1 has been executed");
		System.out.println(a + " Local variable");
	}
	public void s2() {
		System.out.println("s2 has been executed");
		System.out.println(b + " Instance variable");
	}
	public void s3() {
		System.out.println("s3 has been executed");
		System.out.println(appleid + " Static variable");
		System.out.println(b + " Instance var");
		}
	
	public static void main(String args[]) {
		System.out.println("main method has been executed");
		Dt_var s = new Dt_var();
		s.s1();
		s.s2();
		s.s3();
	}
}
