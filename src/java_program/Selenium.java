package java_program;

public class Selenium {
	public void method1() {
		System.out.println("method1 has been executed");
	}
	public void method2() {
		System.out.println("method2 has been executed");
	}
	public void method3() {
		System.out.println("method3 has been executed");
	}
	
public static void main (String args[]) {
	System.out.println("Java second sample has been exceuted");
	Selenium  method = new Selenium();
	method.method1();
	method.method2();
	method.method3();
}
}
