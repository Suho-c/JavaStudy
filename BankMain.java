import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		
		Piggybank pig = new Piggybank();

		//pig.money = 5000;
		// ���� ����ڰ� �Է��� �ݾ׸�ŭ money �� ���� ��Ű�� �;��
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ݾ��� �Է����ּ���>> ");
		int inputMoney = sc.nextInt();
		//�Է��� �ݾ��� money�� ������Ű�� �;��!
		pig.deposit(inputMoney);
		
		pig.showMoney();
		//pig.money = inputMoney; 
		
		
		
		/* ������ �ݾ��� �Է¹޾Ƽ�
		 * �ش��ϴ� �ݾ׸�ŭ money�� ���� �����ּ���
		 * �ܾ��� ��½��� �ּ���
		 */
		
		System.out.print("������ �ݾ��� �Է����ּ���>> ");
		int outputMoney = sc.nextInt();
		
		pig.withdraw(outputMoney);
		pig.showMoney();
		

	}

}
