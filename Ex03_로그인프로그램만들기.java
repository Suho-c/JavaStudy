import java.util.Scanner;

public class Ex03_�α������α׷������ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String user_id = "smhrd";
		
		String user_pass = "1234";
		
		int cnt = 1;
		
		while(true) {
			
			System.out.print("���̵� �Է� : ");
			String input_id = sc.next();
			
			if (user_id.equals(input_id)) {
				System.out.print("��й�ȣ : ");
				String input_pass = sc.next();
				
				if (input_pass.equals(user_pass)) {
					System.out.println("�α��� ����");
					break;
				}
				else {
					System.out.println("�α��� ����");
					System.out.print("��� �Ͻðڽ��ϱ�? ");
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
