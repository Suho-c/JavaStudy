import java.util.Scanner;

public class Ex01_switch�����Է� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//.next() : ��Ʈ�������� �����͸� �Է��ϴ� �޼ҵ�.
		System.out.print("�Է� : ");
		String data = sc.next();
//		// String �����ʹ� ������������Ÿ�� == �񱳰� �Ұ���.
//		// �������¸� ���Ҷ��� .equals()
//		
//		
//		if(data.equals("�ѱ���")) {
//			System.out.println("�ȳ��ϼ���!");
//		} else if (data.equals("����")) {
//			System.out.println("���!");
//		}
		

		switch (data) {
		case "�ѱ���":
			System.out.println("�ȳ��ϼ���");
			break;
		case "����":
			System.out.println("���");
			break;
		case "�߱���":
			System.out.println("���Ͽ�");
			break;
		case "�Ϻ���":
			System.out.println("������");
			break;
		default:
			System.out.println("�λ簡 �ƴմϴ�.");
		}
		
	}

}
