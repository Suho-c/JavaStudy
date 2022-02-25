import java.util.Scanner;

public class Ex09_if_else예제 {

	public static void main(String[] args) {
		
		//1. 스캐너 임폴트
		Scanner sc = new Scanner(System.in);
		
		//2. 사용자가 임의의 숫자를 입력
		System.out.print("숫자 입력 : ");
		int number = sc.nextInt();
				
		int result = 0;
		//3. 사용자가 입력한 숫자의 1의 자리가 5보다 크다면 올림!
		if (number % 10 > 5) {
			// 올림! --> 128 -> 130
			//			120 숫자를 128에서 추출해서 +10
			
			result = number / 10 * 10 + 10;
			
		}else {
			// 내림! --> 123 -> 120
            //   		123 -> 123 -3!
			
			result = number - number % 10;
			
		}		
		System.out.println("반올림 수 : " + result);
		
		
	}

}
