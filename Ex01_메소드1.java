package �޼ҵ�;

import java.security.PublicKey;

public class Ex01_�޼ҵ�1 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		int result = add(num1, num2);
		System.out.println("���ϱ� : " + result);

		// minus ���� ����ϰ� �;��!
		// �޼ҵ� �̸����� ȣ�� : �޼ҵ带 ����Ұſ���!
		int result2 = minus(num1, num2);
		System.out.println("���� : " + result2);
		
		int result3 = mul(num1,num2);
		System.out.println("���ϱ� : " + result3);
		
		int result4 = div(num1,num2);
		System.out.println("������: " + result4);
		
		
		int re1 = add(10,30);
		System.out.println("���2 : " + re1);
		
		int re2 = add(40,50);
		System.out.println("���3 : " + re2);
		
		
		
		
	}
	// �޼ҵ� : ���� ����ϴ� ����� ���� �����°�!!�� �ǹ�
	// �ʿ��� ������ �ҷ��ͼ� �������!!
	// public : ���� ������ --> �� �޼ҵ带 ������ �������� ����� ���ΰ�?
	// static : �����ϴ�!
	// int : ���� Ÿ��!(��ȯŸ��)
	// add(int num1, int num2) : �޼ҵ� �̸�! (�ʿ����) {
	// 			�޼ҵ� ���� ����!
	// return result; --> �����͸� ��ȯ�Ұſ���! �ڡڡڡ� �߿�!!!
	// } ������ ����� ���� Ÿ�Կ� �°� �����͸� ��ȯ������Ѵ�!!

	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result*2;
	}
		
	// ���� ����� �ϴ� minus ��� �޼ҵ带 ����ſ���!
	
	public static int minus(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
		
	public static int mul(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	public static int div(int num1, int num2) {
		int result = num1 / num2;
		return result;	
	}
	
	
}

