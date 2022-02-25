import java.util.Scanner;

public class Ex06_배열예제3 {

	public static void main(String[] args) {

		// 1. 스캐너 임포트
		Scanner sc = new Scanner(System.in);
		
		// 2. 10칸짜리 인트형 배열 생성(공간만)
		int[] arr = new int[10];
		
		// 3. 총 10번동안 사용자에게 숫자(정수)입력
		for(int i = 0; i < 10; i++) {
			System.out.print(i+1 + "번째 정수 입력 : ");
			// 3.1 10칸짜리 배열에 데이터를 차곡차곡 저장
			arr[i] = sc.nextInt();
			}
			
		// 4. 3의 배수 x력 : 출력문 제공
		System.out.print("3의 배수인 숫자 : ");
		// 5. 배열 속에 3의 배수들만 옆으로 출력!
//		for(int j = 0; j < 10; j++) {
//			if(arr[j] % 3 == 0) {
//				System.out.print(arr[j] + " ");
//			}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 3 == 0) {
				System.out.print(arr[i] + " ");

			}
		}
		
		
	}

}
