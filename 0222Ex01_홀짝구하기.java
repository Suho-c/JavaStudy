import java.util.Scanner;

public class Ex01_홀짝구하기 {

	public static void main(String[] args) {
		
		// 1. 스캐너 임포트
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		int odd = 0;
		int even = 0;
		
		
		
		// 2. 반복시키기 ! 횟수가 정해지지 않았음!
		while (true) {
			// 3. 숫자입력 출력문 제공 / 사용자에게 정수를 입력
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			if (num == -1) {
				// 4. 사용자가 -1 입력하면 프로그램 종료
				break;
			}
			
			if (num % 2 == 1) {
				// 홀수일때
				odd++;
			}else if(num % 2 == 0) {
				even++;
			}
		}
		
		// 프로그램이 종료瑛뻑 홀수와 짝수개수를 출력
		
		System.out.println("홀수의 개수 : " + odd);
		System.out.println("짝수의 개수 : " + even);

	}

}
