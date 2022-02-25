
public class Ex06_for문예제6 {

	public static void main(String[] args) {
		
		// 1 ~ 100 까지의 숫자중에 3의 배수합을 구하세요!!
		// 1 ~ 100 까지의 숫자 출력 + 3의 배수만 출력
		// 3의 배수 누적 합!
//		
//		int sum = 0;
//		for (int i = 1; i <=100; i++) {
//			if(i % 3 == 0) {
//				sum += i; 
//			}
//		}
//		System.out.println("3의 배수 총합 : " + sum);
//
		int sum = 0;
		int i = 1;
		while(i <= 100) {
			if(i % 3 == 0) {
				sum += i;
			}
			i++;
			
		}
		System.out.println("3의 배수 총합 : " + sum);
	}

}
