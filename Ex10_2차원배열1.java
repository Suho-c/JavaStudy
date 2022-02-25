
public class Ex10_2차원배열1 {

	public static void main(String[] args) {
		
		// array 라는 이름의 5행 5열 짜리 2차원 배열을 만들기!
		int [][] array = new int[5][5];
		
		// array 라는 배열을 1 ~ 25 까지의 숫자로 초기화!
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
