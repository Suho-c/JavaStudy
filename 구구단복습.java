
public class 구구단복습 {

	public static void main(String[] args) {
		for(int i = 2; i < 10; i++) {
			System.out.print(i + " 단 " + "\n");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
	}

}
