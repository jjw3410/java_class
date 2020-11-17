package quiz;
import java.util.Scanner;
public class B10_prime {

	//사용자로부터 숫자를 입력받으면 1부터 입력한 숫자 사이에 존재하는 소수를 모두 출력하시오
	//소수- 약수가 1과 자기 자신 밖에 없는 숫자
	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		
		int num=sc.nextInt();
		
		if(num<1) {
			System.out.println("숫자를 다시입력하세요.");
		}
		
		//i= 소수인지 테스트 해볼숫자
		for (int i=2;i<=num;++i) {
			boolean measure= false;
		//j= i의 약수인지 테스트 해볼숫자
			for(int j=2;j<i;++j) {
				
				if(i%j==0) {
					
					measure=true;
					
					break;
				}
				
			
			}
			if(measure==false) {
				System.out.println(i);
			}
		
        }
		
		
		//사용자로부터 숫자를 입력받으면 1부터 입력한 숫자 사이에 존재하는 소수를 모두 출력하시오
		
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("숫자를 입력하세요>");
//		int num=sc.nextInt();
//		
//		if(num<1) {
//			System.out.print("숫자를 다시 입력하세요>");
//		}
//		
//		for(int i=2;i<=num;i++) 	{
//			boolean result=false;
//			
//			for(int j=2;j<i;j++) {
//				if (i%j==0) {
//					result=true;
//					break;	
//				}
//			}
//			if (result=false) {
//				System.out.print(i);
//			}
//				
//			
//		}
	}
		
}	


