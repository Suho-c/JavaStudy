import java.util.Scanner;

public class Ex02_���̾�Ʈ���α׷� {

	public static void main(String[] args) {
		
		// 1. ��ĳ�� ����Ʈ
		Scanner sc = new Scanner(System.in);
		
		// 2. ���� ������ ��¹� ����
		System.out.print("���� ������ : ");
		// 2-1. ���� ������ �Է�
		int cur = sc.nextInt();
		
		// 3. ��ǥ ������ ��¹� ����
		System.out.print("��ǥ ������ : ");
		// 3-1. ���� ������ �Է�
		int goal = sc.nextInt();
		
		int cnt = 1;
		int weight = 0;
		
		// 4. �ݺ�����
		// n���� ���� ������ ��¹� ����
		// �����Ը� �Է�
		while(true) {
			System.out.print(cnt +"���� ���� ������ : ");
			weight = sc.nextInt();
			cnt++;
			// ���� �����Ը� ����ϴ� ���� �ۼ�(���� ������ - ���� ������)
			cur -= weight;
			System.out.println("���� ������ : " + cur);
			if (cur <= goal) {
				System.out.println("���� ������ : " + cur);
				System.out.println("�����մϴ�!!!");
				break;
			}

		}
		
	}
}


		

