
public class Ex01_�������迭1 {

	public static void main(String[] args) {
		
		// 5�� 5�� array
		int [][] array = new int[5][5];
		//�����͸� 1 ~ 25���� �־��ּ���
		int num =1;
//		// num �� �̿��ؼ� 1�࿡ 1~5���� ���� �־��ּ���!
//		for(int i = 0; i < array[0].length; i++) {
//			array[0][i] = num;
//			num++;
//		}
//		for(int i = 0; i < array[0].length; i++) {
//			array[1][i] = num;
//			num++;
//		}
//		for(int i = 0; i < array[0].length; i++) {
//			array[2][i] = num;
//			num++;
//		}
		
		// ù���� for ���� ���° �࿡ �ִ� �迭���� ��Ÿ���ٰ���!!
		// ������ �迭���� �迭��.length -> ù��° �迭�� ���̸� ��Ÿ��
		// �Էº� !
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				array[i][j] = num;
				num++;
			}
		}
		// 2���� �迭 ���
		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15
		// 16 17 18 19 20
		// 21 22 23 24 25
		// ��º�!
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j]+ "\t"); // \t -> tab ��ŭ ����
				
			}
			System.out.println();
		}
	}

}
