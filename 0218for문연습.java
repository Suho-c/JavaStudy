import java.util.Scanner;

public class for¹®¿¬½À {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			for(int i = num2; i <=num1; i++) {
				System.out.print(i + " ");
			}
		}else if(num2 > num1) {
			for(int i = num1; i <=num2 ; i++) {
				System.out.print(i + " ");
			}
		}
		
	}

}
