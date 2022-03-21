import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		
		Piggybank pig = new Piggybank();

		//pig.money = 5000;
		// 돈을 사용자가 입력한 금액만큼 money 를 증가 시키고 싶어요
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("저금할 금액을 입력해주세요>> ");
		int inputMoney = sc.nextInt();
		//입력한 금액을 money에 증가시키고 싶어요!
		pig.deposit(inputMoney);
		
		pig.showMoney();
		//pig.money = inputMoney; 
		
		
		
		/* 인출할 금액을 입력받아서
		 * 해당하는 금액만큼 money를 차감 시켜주세요
		 * 잔액을 출력시켜 주세요
		 */
		
		System.out.print("인출할 금액을 입력해주세요>> ");
		int outputMoney = sc.nextInt();
		
		pig.withdraw(outputMoney);
		pig.showMoney();
		

	}

}
