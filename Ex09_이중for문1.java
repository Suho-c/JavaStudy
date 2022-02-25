
public class Ex09_이중for문1 {

	public static void main(String[] args) {
		
		
		// 표현식 -> 문자열 중에 특정한 기능을 만들어 놓는것!
		// System.out.println("\n" + i);
		
		
		// 2 ~ 9단 까지 출력
		
		
		for(int i = 2; i < 10; i++) {
			System.out.println("\n"+ "==" + i + "단" + "==");
		
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j );
			}
		}

	}

}
