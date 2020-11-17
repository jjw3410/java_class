package quiz;
import java.util.Scanner;
public class B09_forQuizBasic {

	//사용자가 숫자를 입력 했을때
	//1.10부터 입력한 숫자까지의 총 합을 구하시오.
	//2. 1부터 입력한 숫자 사이의 3의 배수만 모두 출력하고 총 몇개인지도 출력해보세요.
	
	public static void main(String[]args) {
		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("숫자를 입력하세요>");
//		int user=sc.nextInt();
//		
//		int start=10;
//		int end =user;
//				
//		if (start>end) {
//			int temp=start;// start 의 값을 따로 뺴놓는다.
//			start=end;
//			end=temp;// 뺴놓았던 start의 값을 end의갑에 넣는다.
//		}
//		
//		int sum=0;
//		for (int i=start;i<=end;++i) {
//			System.out.println(i);
//			sum+=i;
//		}System.out.println(sum);
//		
//		
//		int start2=1;
//		int end2=user;
//		
//		if(start2>end2) {
//			int temp=start2;
//			start2=end2;
//			end2=temp;
//		}
//		int count=0;
//		System.out.print("[");
//		for(int i=start2; i<=end2;++i) {
//			if(i%3==0) {
//				System.out.print(i+" ");
//				count+=1;
//			}
//			
//		}
//		System.out.print("\b]\n");
//		System.out.printf("3의 배수 개수:%d\n",count);
		
		
		
	

		//사용자가 숫자를 입력 했을때
		//1.10부터 입력한 숫자까지의 총 합을 구하시오.
		//2. 1부터 입력한 숫자 사이의 3의 배수만 모두 출력하고 총 몇개인지도 출력해보세요.
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자를 입력하세요>");
		int num=sc.nextInt();
		
		int start=10;
		int end=num;
		int sum=0;
		
		if(start>end) {
			
			int temp=start;
			start=end;
			end=temp;
		}
		
		for(int i=start;i<=num;++i) {	
			System.out.println(i);
			sum+=i;
		} 
		System.out.printf("10부터 %d까지의총합:%d",num,sum);
		
		System.out.println();
		
		int start2=1;
		int count=0;
		
		for (int i=start2;i<end;++i) {
			
			if(num%3==0) {
				
				count+=1;
				System.out.println(i);	
			}
			
		}
		System.out.println("3의 배수 총개수:"+count);
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
