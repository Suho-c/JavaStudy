
public class Ex10_2�����迭1 {

	public static void main(String[] args) {
		
		// array ��� �̸��� 5�� 5�� ¥�� 2���� �迭�� �����!
		int [][] array = new int[5][5];
		
		// array ��� �迭�� 1 ~ 25 ������ ���ڷ� �ʱ�ȭ!
		int num = 1;
//		for(int i = 0; i < array[0].length; i++) {
//			array[0][i] = num;
//			num++;
//			
//		}
//		
//		for (int i = 0; i < array[1].length; i++) {
//			array[1][i] = num;
//			num++;
//		}
//		
//		for (int i = 0 ; i < array[2].length; i++) {
//			array[2][i] = num ;
//			num++;
//		}
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				array[i][j] = num;
				num++;
			}
		}
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				System.out.println(array[i][j]);
		}
	

		}
	}
}
