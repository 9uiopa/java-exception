package sample01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionApp2 {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader ("src/sample01/sample01.text");  //예외가 발생하지 않을때 읽어옴.
			BufferedReader br = new BufferedReader(reader);
			String text = br.readLine();
			System.out.println(text);
			br.close();
		} catch (FileNotFoundException ex) {
			System.out.println(ex);
		} catch(IOException ex) {
			System.out.println(ex);
		}
	}
}
