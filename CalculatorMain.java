
public class CalculatorMain {

	public static void main(String[] args) {
		
		
		//2���� �Ű������� �Ѱܹ޴� �����ڸ� �̿��ؼ� cal�̶�� ��ü�� ���弼��
		
		Calculator cal = new Calculator(10, 20);
		// cal ��ü�� num1 �� num2 �� ���� ���� ������ּ���!
		System.out.println("���ϱ� : " + cal.sum());
		
		// cal ��ü�� num1�� 75, num2�� 5�� ������ �ּ���!
		cal.setNum1(70);
		cal.setNum2(5);
		
		// ���ϱ�, ����, ���ϱ�, ������ ���!!
		System.out.println("���� �� ���ϱ� : " + cal.sum());
		System.out.println("���� : " + cal.sub());
		System.out.println("���ϱ� : " + cal.mul());
		System.out.println("������ : " + cal.div());
		
		
		
	}

}
