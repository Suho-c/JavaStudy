import java.util.Scanner;

public class Ex05�ú��� {

	public static void main(String[] args) {

		// 1. ��ĳ�� ����Ʈ
		Scanner sc = new Scanner(System.in);
		
		// 2. ��¹�
		System.out.print("�� �Է� : ");
		
		// 3. �����Է¹ޱ�!
		int time = sc.nextInt();
		
		
		// 4. �Է¹��� ������ ��,��,�� ����ϸ� �˴ϴ�!
		// 3723�� 1�ð� 2�� 3�� 
		
		int hr = time/(60*60);
		int min = time%3600/60;
		int sec = time % 60;
				
		System.out.println(hr + "�� " + min + "�� " + sec + "�� ");

	}

}
