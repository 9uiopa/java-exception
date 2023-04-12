package sample01;

public class ExceptionApp4_2 {

	public static void test(String str) {
		int number = Integer.parseInt(str);
		System.out.println("number -> " + number);
		
	}
	

	public static void main(String[] args) {
		test("123");
		test("123d");
		
		
	}
}
