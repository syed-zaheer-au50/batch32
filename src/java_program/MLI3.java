package java_program;

class MLI {
	int a = 5;
	int b = 10;
	public void a1() {
		System.out.println("a1 has been executed");
	}
}
class MLI2 extends MLI {
	int x = 20;
	int y = 30;
	public void a2() {
		System.out.println("a2 has been executed");
		System.out.println(a+b);
	}
}
class MLI3 extends MLI2 {
	public void a3() {
		System.out.println("a3 has been executed");
		System.out.println(x+y);
		System.out.println(a+b);
	}

public static void main (String args[]) {
	MLI3 obj = new MLI3();
	obj.a1();
	obj.a2();
	obj.a3();
}
}

