package java_program;

public class Cond_elseif_printgradeforstd {
public static void main (String args[]) {
	int stdmarks = 92;
	if(stdmarks >= 90 && stdmarks <=100) {
		System.out.println("student grade is O");
	}
	else if (stdmarks >=80 && stdmarks <= 90) {
		System.out.println("student grade is A++");
	}
	else if (stdmarks >=70 && stdmarks <= 80) {
		System.out.println("student grade is A");
	}
	else if (stdmarks >=60 && stdmarks <= 70) {
		System.out.println("student grade is B++");
	}
	else if (stdmarks >=50 && stdmarks <= 60) {
		System.out.println("student grade is B");
	}
	else if (stdmarks >40 && stdmarks <= 50) {
		System.out.println("student grade is pass");
	}
	else
	{
		System.out.println("student grade is fail");
	}
}
}
