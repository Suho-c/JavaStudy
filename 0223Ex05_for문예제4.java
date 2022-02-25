

public class Ex05_for문예제4 {

	public static void main(String[] args) {
		// 1~50 369게임
		// if 끝자리수가 3,6,9 "박수" 출력 % 10 ==3,6,9or
		// else if 끝자리수가 5 "으악" 출력 % 5 = 0
		// else 그외의 수는 숫자를 그대로 출력
			
		
//		for (int i = 1; i <= 50; i++) {
//			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
//				System.out.println("박수");
//			} else if (i % 10 == 5) { 
//					System.out.println("으악");
//				} else 
//			System.out.println(i + " ");
//				
//		
//		}
		for (int i  = 1; i <= 50; i++) {
			switch (i % 10) {
			case 3:
			case 6:
			case 9:
				System.out.println("박수");
				break;
			case 5:
				System.out.println("으악");
				break;
			default:
				System.out.println(i + " ");
				break;

				
				
			}
		}

		
	}

}
