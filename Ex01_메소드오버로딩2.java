
public class Ex01_�޼ҵ�����ε�2 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		System.out.println("���1 : " + add(num1, num2));

		double num3 = 10.5;
		double num4 = 21.7;
		System.out.println("���2 : " + add(num3, num4));

		float num5 = 3.14f;
		float num6 = 5.89f;
		System.out.println("���3 : " + add(num5, num6));
	
		
		// �޼ҵ� �����ε�
		// ���� �޼ҵ� �̸����� �ٸ� �Ű������� �޾Ƽ� �ٸ� ����� ���� �� �ֵ��� �ϴ� ���!
		// Ư¡ : �� �޼ҵ� �̸��� ���ƾ� �Ѵ�! 
		//		 �� �޼ҵ� �̸��� �����鼭 �� �Ű������� �޶�߸� �Ѵ�!
		// �޼ҵ� �̸��� �����鼭 ���� Ÿ���� �ٸ����� �޼ҵ� �ι��ε��� �ƴϴ�!

		System.out.println("Test ��� : " + add(num1, num3));
//		System.out.println(" Test ��� : " + add(10, "test")); �ȵ�!! 
		
	}
	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	
	public static double add(double num3, double num4) {
		return num3 + num4;
	}

	public static float add(float num5, float num6) {
		return num5 + num6;
	}
	public static String add(String str1, String str2) {
		return str1 + str2; 
	}
}
