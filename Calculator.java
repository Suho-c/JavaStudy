
public class Calculator {
	
	private int num1;
	private int num2;
	
	
	// ������ �����ε�
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

	// ���� ���� ��ȯ () <- �������� ���Ƿ� ����д�

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


