package week6;

public class local101 {
	 String br = "Black Dimond";
	static int age = 10;
	static String cat = "Luca";
	public static void main(String[]args) {
		
		local101 obj = new local101();
		String owner = "tommy";
		System.out.println("The name of is : "+ cat +" and Tommy is : "+ owner);
		cat();
		obj.display();
	}
	public static void cat() {
		age = 1;
		age = age+5;
		
		System.out.println(age);
	}
	public void display() {
		
		System.out.println(br);
	}
}
