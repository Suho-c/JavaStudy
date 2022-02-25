import java.util.Scanner;

public class Ex01_switch글자입력 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//.next() : 스트링형태의 데이터를 입력하는 메소드.
		System.out.print("입력 : ");
		String data = sc.next();
//		// String 데이터는 참조형데이터타입 == 비교가 불가능.
//		// 문자형태를 비교할때는 .equals()
//		
//		
//		if(data.equals("한국어")) {
//			System.out.println("안녕하세요!");
//		} else if (data.equals("영어")) {
//			System.out.println("헬로!");
//		}
		

		switch (data) {
		case "한국어":
			System.out.println("안녕하세요");
			break;
		case "영어":
			System.out.println("헬로");
			break;
		case "중국어":
			System.out.println("니하오");
			break;
		case "일본어":
			System.out.println("곤니찌와");
			break;
		default:
			System.out.println("인사가 아닙니다.");
		}
		
	}

}
