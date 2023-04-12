package sample02;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionApp2_2 {
	// 예외의 전환 : catch 해버리고 다른 예외 발생시키기.
	public static void writeFile(String text) throws Exception {
		try {
			FileWriter writer = new FileWriter("src/sample02/sample.txt");
			writer.write(text);
			writer.close();
		} catch (IOException ex) {
			throw new Exception("읽고 쓰기 오류 발생", ex);
		}
	}

	public static Date toDate(String text) throws Exception {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date = sdf.parse(text);
			return date;
		} catch (ParseException ex) {
			throw new Exception("날짜 변환 오류 발생", ex);
		}

	}

	public static void main(String[] args) {
		try {
			writeFile("예외 전환 연습");
			Date date = toDate("20242-04-");
			System.out.println(date);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
