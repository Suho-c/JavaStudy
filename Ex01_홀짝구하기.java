import java.util.Scanner;

public class Ex01_Ȧ¦���ϱ� {

	public static void main(String[] args) {
		
		// 1. ��ĳ�� ����Ʈ
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		int odd = 0;
		int even = 0;
		
		
		
		// 2. �ݺ���Ű�� ! Ƚ���� �������� �ʾ���!
		while (true) {
			// 3. �����Է� ��¹� ���� / ����ڿ��� ������ �Է�
			System.out.print("���� �Է� : ");
			num = sc.nextInt();
			if (num == -1) {
				// 4. ����ڰ� -1 �Է��ϸ� ���α׷� ����
				break;
			}
			
			if (num % 2 == 1) {
				// Ȧ���϶�
				odd++;
			}else if(num % 2 == 0) {
				even++;
			}
		}
		
		// ���α׷��� ��������� Ȧ���� ¦�������� ���
		
		System.out.println("Ȧ���� ���� : " + odd);
		System.out.println("¦���� ���� : " + even);

	}

}
