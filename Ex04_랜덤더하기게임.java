import java.util.Random;
import java.util.Scanner;

public class Ex04_�������ϱ���� {

	public static void main(String[] args) {
		
		// �������� �̴� ���
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int suc = 0;
		int fail = 0;
		
		while (true) {
			
			int num1 = rd.nextInt(10)+1; // 1���� 10����
			int num2 = rd.nextInt(10)+1; 
			System.out.print(num1 + " + " + num2 + " = " );
			int user_ans = sc.nextInt();
			int ans = num1 + num2;
			if (user_ans == ans) {
				System.out.println("Success!");
				suc++;
			}else {
				System.out.println("Fail!");
				fail++;
			}
			System.out.print("����Ͻðڽ��ϱ�? ");
			String ans2 = sc.next();
			if(ans2.equals("Y")) {
				continue;
			}else if (ans2.equals("N")) {
				System.out.println("����!");
				System.out.println("���� ���� : " + suc);
				System.out.println("Ʋ�� ���� : " + fail);
				break;			
		}
		
		}
	}

}
