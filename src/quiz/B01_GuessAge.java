package quiz;

import java.util.Scanner;
public class B01_GuessAge {
	
	//사용자로부터 올해의 년도와 나이를 입력받으면 한국나이를 계산하여 몇살인지
	//알려주는 프로그램을 만들어보세요
	
	public static void main(String[]args) {
		
	Scanner sc=new Scanner(System.in);
	
	System.out.print("올해의년도와 태어난년도를 입력하세요>");
	
	int year=sc.nextInt();
	int birth=sc.nextInt();
	
	System.out.printf("당신의 나이는: %d이다.",(year-birth+1));
		
		
	}
}
