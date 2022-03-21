
public class Calculator {
	
	private int num1;
	private int num2;
	
	
	// 생성자 오버로딩
	public Calculator(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	

	public void setNum1(int num1) {
		this.num1 = num1;
	}


	public void setNum2(int num2) {
		this.num2 = num2;
	}

	// 더한 값을 반환 () <- 전역변수 들어가므로 비워둔다

	public int sum() {
		return num1 + num2;
	}
	
	public int sub() {
		return num1 - num2;
	}
	
	public int mul() {
		return num1 * num2;
	}
	
	public double div() {
		return num1 / num2;
	}
}


