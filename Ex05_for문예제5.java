
public class Ex05_for������5 {

	public static void main(String[] args) {
		
		// 1. 1~50 ������ ���ڸ� ���!
		// �������� ~ ��������!!
		
//		for (int i = 1; i <= 50; i++) {
//			// System.out.println(i);
//			// ������ ���ڸ���(�����ڸ���) 3,6,8 �� �����ٸ� '�ڼ�'
//			if(i%10 == 3 || i%10 == 6 || i%10 == 9) {
//				System.out.print("�ڼ�" );
//			}
//			//������ ���ڸ��� 5ȣ �����ٸ� '����'
//			else if( i%10 ==5 ) {
//				System.out.print("���� ");
//			}
//			//�� ���� ���ڴ� ���� �׷��� ���
//			else {
//				System.out.print(i + " ");
//			}
//		}
		for (int i =1 ;i <=50; i++) {
			switch (i % 10) {
			case 3,6,9: 
				System.out.print("�ڼ� ");
				break;
			case 5:
				System.out.print("���� ");
				 break;
			default:
				System.out.print(i + " ");
		}
		
		
		
		
		
		}	
		
		
	}

}
