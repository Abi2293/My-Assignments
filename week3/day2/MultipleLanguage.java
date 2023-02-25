package week3.day2;

public abstract class MultipleLanguage implements Language,TestTool {
	public void python()
	{
		System.out.println("From Abstract class implemented method-Python");
	}
	public abstract void ruby();
}
