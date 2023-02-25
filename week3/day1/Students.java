package week3.day1;

public class Students {
	public void getStudentInfo(int id)
	{
		System.out.println("Method with one argument");
		System.out.println("Student Id:"+id);
	}
	public void getStudentInfo(int id,String name,String email,long phonenumber)
	{
		System.out.println("Method with multiple arguments");
		System.out.println("Student Id:"+id);
		System.out.println("Student Name:"+name);
		System.out.println("Student Email:"+email);
		System.out.println("Student Contact Number:"+phonenumber);
	}
	public static void main(String[] args) {
		Students s=new Students();
		s.getStudentInfo(100);
		s.getStudentInfo(101,"Abirami","abi@gmail.com",9800376165l);
	}
}
