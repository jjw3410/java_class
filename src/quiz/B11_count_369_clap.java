package quiz;
import java.util.Scanner;

public class B11_count_369_clap {
	
	//사용자로부터 정수 하나를 입력받고 해당 숫자까지 369게임이 진행된다면 박수를 총 몇번 쳐야 하는지 세어보세요.
	
	
	public static void main(String[] args) {
		
		
		//프로그램 실행시간 측정 방법
	
//		Scanner sc= new Scanner(System.in);
//		System.out.print("숫자를 입력하세요>");
//		int num=sc.nextInt();
//		
//		if (num<0) { 
//			System.out.println("숫자를 다시 입력하세요>");
//		}
//		
//		
//		int start=1;
//		int count=0;
//		
//		while(start<=num) { // start 값부터 입력한수까지의 범위 지정
//			int check=start; // while 구문의 숫자가 변하면 안되니깐  임의로 check를 지정해준다.
//		
//			while(check!=0) { 
//				
//				if(check%10==3||check%10==6||check%10==9) {//check값을 10으로 나눈 나머지가3,6,9
//				
//					count++;// 카운트값을 올려주고
//				
//	
//				}	
//				check/=10;//일의자리 빼먹고 십의자리 다시 위의 if절 테스트
//					
//			}
//			start++; //검사할 숫자 1을 더해줌
//				
//		}
//		System.out.println(count);
//			
		
		
		//사용자로부터 정수 하나를 입력받고 해당 숫자까지 369게임이 진행된다면 박수를 총 몇번 쳐야 하는지 세어보세요.
		
		Scanner sc= new Scanner(System.in);
		System.out.print("숫자를 입력하세요>");
		int num=sc.nextInt();
		
		
		int start=1;
		int count=0;
		
		for(int i=start;i<=num;i++) {
			
			if(num%10==3||num%10==6||num%10==9) {
				
				count++;
				
				
				
				
				
				
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
