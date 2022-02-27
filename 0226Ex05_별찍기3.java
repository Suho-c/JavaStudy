
public class Ex05_º°Âï±â3 {

	public static void main(String[] args) {
		for(int i = 1; i < 6; i++) {
			for(int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
	}

}
