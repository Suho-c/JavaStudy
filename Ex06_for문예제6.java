
public class Ex06_for������6 {

	public static void main(String[] args) {
		
		// 1 ~ 100 ������ �����߿� 3�� ������� ���ϼ���!!
		// 1 ~ 100 ������ ���� ��� + 3�� ����� ���
		// 3�� ��� ���� ��!
//		
//		int sum = 0;
//		for (int i = 1; i <=100; i++) {
//			if(i % 3 == 0) {
//				sum += i; 
//			}
//		}
//		System.out.println("3�� ��� ���� : " + sum);
//
		int sum = 0;
		int i = 1;
		while(i <= 100) {
			if(i % 3 == 0) {
				sum += i;
			}
			i++;
			
		}
		System.out.println("3�� ��� ���� : " + sum);
	}

}
