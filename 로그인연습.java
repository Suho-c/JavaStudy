import java.util.Scanner;

public class �α��ο��� {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
				
		String id = "";
		String pw = "";
		int cnt = 1;
		
		while(true) {
			
			System.out.print("���̵� �Է� : ");
			id = sc.next();
			System.out.print("��й�ȣ �Է� : ");
			pw  = sc.next();

			if (id.equals("smhrd") && pw.equals("1234")) {
				System.out.println("�α��� ����!");
				break;
			}else {
				
				System.out.println("�α��� ����!");
				System.out.print("��� �Ͻðڽ��ϱ�? ");
				String ans = sc.next();
				
				if (ans.equals("N")) {
					break;
				}else if(ans.equals("Y")) {
					if (cnt >= 3) {
						System.out.println("�����������ּ���!!!");
						break;
					}
					cnt++;
					
				}
			}
		} 
	}
}
