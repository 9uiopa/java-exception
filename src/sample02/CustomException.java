package sample02;

public class CustomException extends RuntimeException {

	public CustomException(String message) {
		super(message);
	}

	public Customexception(String message, Throwable cause)
	{
		super(message,cause);
	}
}
