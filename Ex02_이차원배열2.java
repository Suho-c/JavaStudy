
public class Ex02_�������迭2 {

	public static void main(String[] args) {
		
		// 5�� 5�� 2���� �迭 21~45
		
		int [][] array = new int [5][5];
		
		int num = 21;
		
		// �Էº�
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				array[i][j] = num;
				num ++;
			}
		}
		
		// ��º�
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
