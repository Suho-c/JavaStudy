import java.util.Scanner;

public class Ex09_�迭����6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int[] ans = {1,4,3,2,1};
		int[] user = new int[5];
		
		// 1. user ��� �迭�� ����ڰ� �Է��� ���� �־��ּ���.
			for(int i = 0; i < user.length; i++) {
			System.out.print((i+1)+ "���� >> ");
			user[i] = sc.nextInt();
			
			// 2. ans ��� �迭�� user ��� �迭�� ���ؼ�
			//    ���� ���ٸ� 'O', �ٸ��ٸ� 'X' ��½����ּ���!
			
			
		}
			int cnt = 0;
			for(int i = 0; i < user.length; i++) {
				
				if(ans[i] == user[i]) {
					System.out.print("O ");
					cnt +=20;
					
				}
				else {
					System.out.print("X ");
				}
				
			}
			System.out.println("���� : " + cnt);
			
			
		
	}
	
}


