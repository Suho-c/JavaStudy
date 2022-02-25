
public class Ex02_이차원배열2 {

	public static void main(String[] args) {
		
		// 5행 5열 2차원 배열 21~45
		
		int [][] array = new int [5][5];
		
		int num = 21;
		
		// 입력부
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				array[i][j] = num;
				num ++;
			}
		}
		
		// 출력부
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
