import java.util.Scanner;

public class Ex09_if_else���� {

	public static void main(String[] args) {
		
		//1. ��ĳ�� ����Ʈ
		Scanner sc = new Scanner(System.in);
		
		//2. ����ڰ� ������ ���ڸ� �Է�
		System.out.print("���� �Է� : ");
		int number = sc.nextInt();
				
		int result = 0;
		//3. ����ڰ� �Է��� ������ 1�� �ڸ��� 5���� ũ�ٸ� �ø�!
		if (number % 10 > 5) {
			// �ø�! --> 128 -> 130
			//			120 ���ڸ� 128���� �����ؼ� +10
			
			result = number / 10 * 10 + 10;
			
		}else {
			// ����! --> 123 -> 120
            //   		123 -> 123 -3!
			
			result = number - number % 10;
			
		}		
		System.out.println("�ݿø� �� : " + result);
		
		
	}

}
