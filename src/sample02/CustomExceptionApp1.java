package sample02;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CustomExceptionApp1 {

	
	public void writeText(String Text) {
		try {
			FileWriter writer = new FileWriter("src/sample02/sample.txt");
		}catch(IOException ex) {
				throw new CustomException("읽고 쓰기 오류",ex);
		}
	}
	
	public static Date todate(String text) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM=dd");
			Date date = sdf.parse(text);
			return date;
		}catch(ParseException ex){
			throw new CustomException("파싱 오류",ex);
			
		}
	}
	
	
	public static void main(String[] args) {
		try {
			writeText("사용자정의 예외객체 사용하기");
			Date date = toDate("2023-04-");
			System.out.println(date);
		} catch (CustomException ex) {
			ex.printStackTrace();
		}
	}
}
