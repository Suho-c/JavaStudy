import java.util.Scanner;

public class Ex02_for문예제1 {

	public static void main(String[] args) {
		
		// 입력
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 1; i<=num ; i++) {
			System.out.print(i + " ");
		}

	}

}
