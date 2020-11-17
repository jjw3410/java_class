
package quiz;

import java.util.Scanner;

public class B01_wonToDollar {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("한국돈을 입력하세요.>");
		
		int won= sc.nextInt();
		double dollar=won/1138.96;
		
		System.out.printf("한국돈 입력한돈:%d￦, 달러환전금액:%.2f$입니다.",won,dollar-(dollar*0.0175));
		
		
		
	}

}
