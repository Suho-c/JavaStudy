import java.util.Scanner;

public class Ex07_배열예제4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 정수를 담을 수 있는 5칸 짜리 배열 생성!
		int[] arr = new int[5];
		// int 타입의 배열은 기본값으로 0을 가지고 있다!
		
		// 입력부
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 입력 >> ");
			arr[i] = sc.nextInt();
			
		}
		System.out.print("입력된 점수 : ");
		// 출력부
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " " );
		}
		int max = arr[0]; // 최고 점수를 저장할 변수
		int min = arr[0]; // 최저 점수를 저장할 변수
		int sum = 0; // 총합을 저장할 변수
		
		for(int i = 0; i < arr.length; i++) {
		
			if(max < arr[i]) {
				max = arr[i] ;
		}
			if(min > arr[i]) {
			min = arr[i];
		}		
			// 점수 누적
			sum += arr[i];
		}
				
		System.out.println();
		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
		System.out.println("총 합 : " + sum);
		System.out.print("평 균 : " + (double)sum/arr.length);
 }

}
