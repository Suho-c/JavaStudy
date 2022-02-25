import java.util.Scanner;

public class Ex05시분초 {

	public static void main(String[] args) {

		// 1. 스캐너 임포트
		Scanner sc = new Scanner(System.in);
		
		// 2. 출력문
		System.out.print("초 입력 : ");
		
		// 3. 정수입력받기!
		int time = sc.nextInt();
		
		
		// 4. 입력받은 정수를 시,분,초 출력하면 됩니다!
		// 3723을 1시간 2분 3초 
		
		int hr = time/(60*60);
		int min = time%3600/60;
		int sec = time % 60;
				
		System.out.println(hr + "시 " + min + "분 " + sec + "초 ");

	}

}
