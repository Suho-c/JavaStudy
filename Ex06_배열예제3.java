import java.util.Scanner;

public class Ex06_¹è¿­¿¹Á¦3 {

	public static void main(String[] args) {

		// 1. ½ºÄ³³Ê ÀÓÆ÷Æ®
		Scanner sc = new Scanner(System.in);
		
		// 2. 10Ä­Â¥¸® ÀÎÆ®Çü ¹è¿­ »ı¼º(°ø°£¸¸)
		int[] arr = new int[10];
		
		// 3. ÃÑ 10¹øµ¿¾È »ç¿ëÀÚ¿¡°Ô ¼ıÀÚ(Á¤¼ö)ÀÔ·Â
		for(int i = 0; i < 10; i++) {
			System.out.print(i+1 + "¹øÂ° Á¤¼ö ÀÔ·Â : ");
			// 3.1 10Ä­Â¥¸® ¹è¿­¿¡ µ¥ÀÌÅÍ¸¦ Â÷°îÂ÷°î ÀúÀå
			arr[i] = sc.nextInt();
			}
			
		// 4. 3ÀÇ ¹è¼ö ­x·Â : Ãâ·Â¹® Á¦°ø
		System.out.print("3ÀÇ ¹è¼öÀÎ ¼ıÀÚ : ");
		// 5. ¹è¿­ ¼Ó¿¡ 3ÀÇ ¹è¼öµé¸¸ ¿·À¸·Î Ãâ·Â!
//		for(int j = 0; j < 10; j++) {
//			if(arr[j] % 3 == 0) {
//				System.out.print(arr[j] + " ");
//			}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 3 == 0) {
				System.out.print(arr[i] + " ");

			}
		}
		
		
	}

}
