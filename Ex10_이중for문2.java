import java.util.Scanner;

public class Ex10_����for��2 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�� �Է� : ");
//		int dan = sc.nextInt();
//		
//		for(int i = 1; i < 10; i++) {
//			System.out.println(dan + " * " + i + " = " + dan * i );
//		
//		
//		
//			
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ܼ� �Է� : ");
		int dan = sc.nextInt();
		System.out.print("��� ������ ��� : ");
		int num = sc.nextInt();
		
		for(int i = 1;  i <= num; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i );
		
		}

	}

}
