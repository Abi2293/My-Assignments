package week3.day2;

public class Automation extends MultipleLanguage {
	public void java() {
		System.out.println("From Language Interface-Java");		
	}

	public void selenium() {
		System.out.println("From Test Tool Interface-Selenium");
	}

	@Override
	public void ruby() {
		System.out.println("From Abstract class unimplemented method-Ruby");
	}
	public static void main(String[] args) {
		Automation a=new Automation();
		a.java();
		a.selenium();
		a.python();
		a.ruby();
	}
}
