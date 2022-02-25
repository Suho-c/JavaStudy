
public class Ex02_for문문자 {

	public static void main(String[] args) {
				
		// A ~ Z 출력하는 반복문 작성
		// 대문자 A는 아스키코드 65 / 대문자 Z는 아스키코드 90
//		for(char i = 'A'; i <= 'Z'; i++) {
//			System.out.println("알파벳 : " + i);
//		}
		for(int i = 65; i <= 90; i++) {
			System.out.print((char)i + " ");
		}

	}

}
