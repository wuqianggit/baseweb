package cn.student.customeexception;

public class CustomException extends Exception {
	private static final long serialVersionUID = -9013874665022706546L;

	public CustomException(){}
	// 异常信息
	private String message;

	public CustomException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
