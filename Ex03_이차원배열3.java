
public class Ex03_이차원배열3 {

	public static void main(String[] args) {
		
	int [][] array = new int [5][5];
		
		int num = 21;
		
		// 입력부
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				
				array[i][j] = num;
				num ++;
			}
		}
//		0,0 1,0 2,0 3,0 4,0
//		0,1 1,1 2,1 3,1 4,1
//		0,2 1,2 2,2 3,2 4,2
//		0,3 1,3,2,3 3,3 4,3
//		0,4 1,4 2,4 3,4 4,4
				
		
		// 출력부
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++ ) {
				System.out.print(array[j][i] + "\t");
				
			}
			System.out.println();
		}
	}

}
