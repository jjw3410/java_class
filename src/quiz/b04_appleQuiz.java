package quiz;

import java.util.Scanner;
public class b04_appleQuiz {

	//사과를 10개씩 담을 수 있는 바구니가 있다.
	//사용자가 사과의 개수를 입력하면 필요한 바구니의 개수를 출력해보세요
	public static void main(String[]args) {
		
		//Scanner sc=new Scanner(System.in);
		
//		System.out.print("사과개수를 입력하세요>");
//		//변수앞에 final : 수정이 불가능한 변수가 된다.
//		final int BASKET_SIZE =10;
//		
//		int appleCount=sc.nextInt();
//		
//		if(appleCount<0) {
//			System.out.println("0이상의 숫자를 입력하셔야 됩니다");
//		} else {
//			int needBasket = (int) Math.ceil(appleCount/BASKET_SIZE);
//			System.out.printf("필요한 바구나는%d개입니다.\n",needBasket);
//		}
//		
//		System.out.println("프로그램을 종료합니다.");
		
		
		
		//사과를 10개씩 담을 수 있는 바구니가 있다.
		//사용자가 사과의 개수를 입력하면 필요한 바구니의 개수를 출력해보세요
		
		
		
		
		
		
		
		Scanner sc=new Scanner(System.in);//사과 개수 입력받기
		System.out.print("사과 개수를 입력하세요>");
		int num = sc.nextInt();
		
	
		
		int apple_box=10;
		
		
		if(num%apple_box==0) {
			
			System.out.println(num/apple_box);
			
		}else {
			System.out.println((num/apple_box)+1);//사과를 10개담고 남은것은 바구니 1개에 더 담아야 되니 +1
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
