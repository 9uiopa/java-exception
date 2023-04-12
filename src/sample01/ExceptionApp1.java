package sample01;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionApp1 {

	public static void main(String[] args) {
		//예외처리
		/*
		 * 
		 */
		try {
			FileWriter writer = new FileWriter("src/sample01/sample01.text");
			writer.write("예외처리 실습해보기");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IOException이 발생하였습니다.");
		}
		
	}
	
	
}
