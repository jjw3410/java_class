package quiz;

import java.util.Scanner;

public class B11_reverse_number {
	//사용자로부터 정수를 하나 입력받고 그 정수를 일의 자리부터 순서대로 출력해보세요    //정수는  10을 나눈나머지   
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("숫자를 입력하세요<");
	
//	String num= sc.nextLine();
//	
//	int a=num.length();
//	
//	int i=a;
//
//	
//	
//		while(i>0) {
//		--i;
//		System.out.print(num.charAt(i));
//		
//		
//		}
	
	int num= sc.nextInt(); // 입력받은 문자를 int형 변환
	

	if(num<0) {      // 숫자를 0이상 양수만 입력 
		System.out.println("양수만 입력하세요.");
	}
	
	long result=0;
	
	while (num!=0) { 
		
		result=num%10; //입력받은 숫자를 10으로 나눈 나머지 
		
		System.out.print(result); //출력
		
		num=num/10; //출력된 숫자를 제외한 나머지 숫자 
		
		
		
	}
	
	
	
	
	
	
	
	}
}
