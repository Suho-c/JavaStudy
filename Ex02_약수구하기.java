
public class Ex02_������ϱ� {

	public static void main(String[] args) {

		for(int i = 2; i <= 30; i++) { // i = 2~30 ���� �ݺ� 
			System.out.print(i + " �� ��� : "); 
			for(int j = 1; j <= i; j++) { // j �� 1���� i���� �ݺ� 
				if(i % j == 0) { // ex) 2 ���� 
					System.out.print(j + " ");
			}
		}
		System.out.println(); 
		}
	}

}
