
public class Ex01_이차원배열1 {

	public static void main(String[] args) {
		
		// 5행 5열 array
		int [][] array = new int[5][5];
		//데이터를 1 ~ 25까지 넣어주세요
		int num =1;
//		// num 을 이용해서 1행에 1~5까지 값을 넣어주세요!
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
		
		// 첫번재 for 문은 몇번째 행에 있는 배열인지 나타내줄거임!!
		// 이차원 배열에서 배열명.length -> 첫번째 배열의 길이를 나타냄
		// 입력부 !
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				array[i][j] = num;
				num++;
			}
		}
		// 2차원 배열 출력
		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15
		// 16 17 18 19 20
		// 21 22 23 24 25
		// 출력부!
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j]+ "\t"); // \t -> tab 만큼 띄어쓰기
				
			}
			System.out.println();
		}
	}

}
