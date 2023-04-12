package sample02;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionApp2 {

	public static void writeText(String text) throws IOException {
		
		FileWriter writer = new FileWriter("src/sample02/sample.txt");
		writer.write(text);
		writer.close();
	}
	
	public static Date toDate(String text) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(text);
		return date;
		
	}
	
	public static void main(String[] args) {
		try {
			writeText("예외변환하기");
			Date date = toDate("2023-04-11");
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Parse e) {
			e.printStackTrace();
		}
		
		
	}
}
