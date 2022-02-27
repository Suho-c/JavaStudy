
public class Ex02_약수구하기 {

	public static void main(String[] args) {

		for(int i = 2; i <= 30; i++) { // i = 2~30 까지 반복 
			System.out.print(i + " 의 약수 : "); 
			for(int j = 1; j <= i; j++) { // j 는 1부터 i까지 반복 
				if(i % j == 0) { // ex) 2 에서 
					System.out.print(j + " ");
			}
		}
		System.out.println(); 
		}
	}

}
