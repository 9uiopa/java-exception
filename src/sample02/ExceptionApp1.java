package sample02;

public class ExceptionApp1 {

	public static int toInt(String text) {
		int number = Integer.parseInt(text);
		return number;

	}

	public static void main(String[] args) {

		try {
			int value = toInt("1234r");
			System.out.println(value);

		} catch (NumberFormatException ex) {
			String errorMessage = ex.getMessage();
			System.out.println("오류 메시지 : " + errorMessage);
			
			String text = ex.toString();
			System.out.println(text);
			
			ex.printStackTrace();
		}
	}

}
