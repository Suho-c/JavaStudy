
public class Ex05_for문예제5 {

	public static void main(String[] args) {
		
		// 1. 1~50 까지의 숫자를 출력!
		// 언제부터 ~ 언제까지!!
		
//		for (int i = 1; i <= 50; i++) {
//			// System.out.println(i);
//			// 숫자의 끝자리가(일의자리가) 3,6,8 로 끝난다면 '박수'
//			if(i%10 == 3 || i%10 == 6 || i%10 == 9) {
//				System.out.print("박수" );
//			}
//			//숫자의 끝자리가 5호 끝난다면 '으악'
//			else if( i%10 ==5 ) {
//				System.out.print("으악 ");
//			}
//			//그 외의 숫자는 숫자 그래돌 출력
//			else {
//				System.out.print(i + " ");
//			}
//		}
		for (int i =1 ;i <=50; i++) {
			switch (i % 10) {
			case 3,6,9: 
				System.out.print("박수 ");
				break;
			case 5:
				System.out.print("으악 ");
				 break;
			default:
				System.out.print(i + " ");
		}
		
		
		
		
		
		}	
		
		
	}

}
