
public class Piggybank {

	private int money;
		
	
	public void showMoney() {
		
		System.out.println("�ܾ��� " + money + " �Դϴ�.");
		
	}	
	public void deposit(int inputMoney) {
		money += inputMoney;
	}
	public void withdraw(int outputMoney) {
		money -= outputMoney;
	}
	
}
