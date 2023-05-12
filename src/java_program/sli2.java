package java_program;

class sli1 {
	public void Single() {
		System.out.println("Hello....");
		System.out.println("super class");
	}
}
class sli2 extends sli1{
	public static void main(String args[]) {
	sli2 obj = new sli2();
	obj.Single();
	}
}

