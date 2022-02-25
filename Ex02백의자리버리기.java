
public class Ex02백의자리버리기 {

	public static void main(String[] args) {

		
		// int 형 변수에 456 값을 넣고 생성
		
		// 결과창에 400(백의자리를 제외하고 나머지값은 버리는) 결과를 출력
		// ex) 111을 넣으면 100이 출력
		
		
		int num = 456;
		int result = (num / 100) * 100 ;
		//           num - (num % 100);
		System.out.println(result);
		
		
		
		

	}

}
