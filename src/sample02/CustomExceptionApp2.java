package sample02;

public class CustomExceptionApp2 {

	public static void getDepositPoint(String grade, int amount) {
		if(grade == null || grade.isBlank()) {
			throw new CustomException("고객등급 정보가 없습니다.");
		}
		
		double depositRate = 0.0;
		if("골드".equals(grade)) {
			depositRate = 0.05;
		}else if("실버".equals(grade)) {
			depositRate = 0.02;
		}else if("브론즈".equals(grade)) {
			depositRate = 0.01;
		}
		
		
		return (int) (amount*depositRate); 
	}
}
