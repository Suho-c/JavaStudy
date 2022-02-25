
public class Ex07_for문예제7 {

	public static void main(String[] args) {
		
		
		
		// 1. 1~100까지 출력
		int sum = 0; //최종 누적합을 구할 변수
		for(int i = 1; i <= 100; i++) {
			// 짝수 -> 음수, 홀수 -> 양수로 출력
			if(i % 2 == 0) {
				System.out.print(-i + " ");
				sum -= i;
			// 홀수라면	
			}else {
				System.out.print(i + " ");
				sum += i;
			}
			
			
		}

		System.out.println("\n결과 : " + sum );
		

	}

}
