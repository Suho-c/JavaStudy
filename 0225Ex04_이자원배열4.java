
public class Ex04_이자원배열4 {

	public static void main(String[] args) {

		// Ctrl + a 누른 후에 
		// Ctrl + Shift + f 전체 코드 정렬!!! 
		
		
		int[][] array = new int[5][5];

		int num = 21;
		
		

		// 입력부
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
