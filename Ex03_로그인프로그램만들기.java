import java.util.Scanner;

public class Ex03_로그인프로그램만들기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String user_id = "smhrd";
		
		String user_pass = "1234";
		
		int cnt = 1;
		
		while(true) {
			
			System.out.print("아이디 입력 : ");
			String input_id = sc.next();
			
			if (user_id.equals(input_id)) {
				System.out.print("비밀번호 : ");
				String input_pass = sc.next();
				
				if (input_pass.equals(user_pass)) {
					System.out.println("로그인 성공");
					break;
				}
				else {
					System.out.println("로그인 실패");
					System.out.print("계속 하시겠습니까? ");
					String ans = sc.next();
					
					if (ans.equals("N")) {
						break;
					}else if (ans.equals("Y")) {
						if (cnt >= 3) {
							break;
						}
						cnt++;
					}
				}
			}
		}
	}
}
