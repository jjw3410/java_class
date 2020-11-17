package quiz;
import java.util.Scanner;
public class B06_monthToseason {
	
	//switch-case문을 이용하여 사용자로부터 달을 입력 받으면 해당하는 계절을 출력해보세요.
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("달을 입력하세요.>");
		
		int month=sc.nextInt();
		
		switch(month) {
		case 12: 
		case 1:
		case 2:
			System.out.println("겨울입니다.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을입니다.");
			break;
		default:
			System.out.println("달을 다시 입력 해주세요.");
			break;
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		}
	}
}
	
	


