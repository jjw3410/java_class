package quiz;

import java.util.Scanner;

public class C12_inputRightThing {

	//사용자로부터 int 타입의 데이터를 입력받아보세요
	//잘못한 타입의 데이터가 들어오더라도 프로그램이 종료되지 않아야 합니다.
	//(올바르게 int가 입력된 경우 프로그램이 종료됩니다)
	

	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요>");
		
		while(true) {
			try {
				
				int num= sc.nextInt();
				System.out.println("입력한 숫자:"+num);
				System.out.println("프로그램을 종료합니다");
				break;
			}catch(Exception e) {
				sc.nextLine();
				
				System.out.println("int 형 데이터가 아닙니다.");
				
			}
				
		
		}
		
		
		
		
		
		
		
	}
}
