
public class Ex07_for������7 {

	public static void main(String[] args) {
		
		
		
		// 1. 1~100���� ���
		int sum = 0; //���� �������� ���� ����
		for(int i = 1; i <= 100; i++) {
			// ¦�� -> ����, Ȧ�� -> ����� ���
			if(i % 2 == 0) {
				System.out.print(-i + " ");
				sum -= i;
			// Ȧ�����	
			}else {
				System.out.print(i + " ");
				sum += i;
			}
			
			
		}

		System.out.println("\n��� : " + sum );
		

	}

}
