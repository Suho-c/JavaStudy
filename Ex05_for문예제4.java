

public class Ex05_for������4 {

	public static void main(String[] args) {
		// 1~50 369����
		// if ���ڸ����� 3,6,9 "�ڼ�" ��� % 10 ==3,6,9or
		// else if ���ڸ����� 5 "����" ��� % 5 = 0
		// else �׿��� ���� ���ڸ� �״�� ���
			
		
//		for (int i = 1; i <= 50; i++) {
//			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
//				System.out.println("�ڼ�");
//			} else if (i % 10 == 5) { 
//					System.out.println("����");
//				} else 
//			System.out.println(i + " ");
//				
//		
//		}
		for (int i  = 1; i <= 50; i++) {
			switch (i % 10) {
			case 3:
			case 6:
			case 9:
				System.out.println("�ڼ�");
				break;
			case 5:
				System.out.println("����");
				break;
			default:
				System.out.println(i + " ");
				break;

				
				
			}
		}

		
	}

}
