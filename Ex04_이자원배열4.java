
public class Ex04_���ڿ��迭4 {

	public static void main(String[] args) {

		// Ctrl + a ���� �Ŀ� 
		// Ctrl + Shift + f ��ü �ڵ� ����!!! 
		
		
		int[][] array = new int[5][5];

		int num = 21;
		
		

		// �Էº�
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {

				array[i][j] = num;
				num++;
			}
		}
		
		
		for(int i = 0; i < array.length; i++) {
			for (int j = array.length-1; j >= 0; j--) {
				System.out.print(array[i][j] + "\t");
				
			}
			System.out.println();
		}
//		for(int i = 0; i < array.length; i++) {
//			for(int j = 0; j < array[0].length; j++ ) {
//				System.out.print(array[i][4-j] + "\t");
//				
//			}
//			System.out.println();
//		}
		
		
	}

}
