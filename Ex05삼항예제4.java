import java.util.Scanner;

public class Ex05���׿���4 {

	public static void main(String[] args) {
		
//		// 1. ��ĳ�� ����Ʈ
//		Scanner sc = new Scanner(System.in);
//		// 2. �뵿�ð��� �Է��϶�� ��¹�
//		System.out.print("�뵿�ð��� �Է��ϼ��� : ");
//		// 3. �뵿�ð��� �Է�
//		int hr = sc.nextInt();
//		// 4. 7�ð� ������ 9000���� �⺻�ñ� �ް�, 8�ð����ʹ� 1�ð� ���� 1.5���� ����ޱ�!
//		int money = (hr > 8) ? (int)(8 * 9000 + (hr-8) * 9000 * 1.5) : (hr * 9000);
//		System.out.println("�� �ӱ��� " + money + " �� �Դϴ�.");
		
		// if ~ else ������ �̿��ؼ� Ǯ���ּ���
		
		
		Scanner sc = new Scanner(System.in);

		System.out.print("�뵿�ð��� �Է��ϼ��� : ");

		int hr = sc.nextInt();
		int money = 0;
				
		if (hr > 8) {
			money = (int)(8 * 9000 + (hr-8) * 9000 * 1.5);
		}else {
			money = hr * 9000;
		}
		System.out.println("�� �ӱ��� " + money + " �� �Դϴ�.");
			
		
	}

}
