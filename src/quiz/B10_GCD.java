package quiz;
import java.util.Scanner;
public class B10_GCD {
	//두 숫자를 입력받으면 두 숫자의 최대공약수를 구해보세요.
	public static void main(String[] args) {
//		System.out.print("숫자 1를 입력하세요>");
//		int num=new Scanner(System.in).nextInt();
//		System.out.print("숫자 2를 입력하세요>");
//		int num2=new Scanner(System.in).nextInt();
//		//20 (1,2,4,5,10,20)  30(1,2,3,5,10,15,30)   
//		
//		if(num<0) {
//			if(num2<0) {
//				System.out.println("양수만 입력하세요.");
//			}
//		 }	//
//		for(int i=num;i>=1;--i) {
//			if (num%i==0) {
//				if(num2%i==0) {
//					
//					System.out.println(i);
//					break;
//				}
//				
//				
//			}
//		}
		//20,60
		//두 숫자를 입력받으면 두 숫자의 최대공약수를 구해보세요.
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("첫번째 숫자를 입력하세요>");
		 int num=sc.nextInt();
		 System.out.println("두번째 숫자를 입력하세요>");
		 int num2=sc.nextInt();
		 
		 if(num<=0) {
			 System.out.print("숫자를 다시 입력하세요");
		 }
		 
		 for (int i=num;i>=1;--i) {
			 if(num%i==0) {//입력한 숫자를  입력한 숫자보다 작은 숫자로 나눌때 떨어지면 약수
				 if(num2%i==0) {//입력한 숫자를  입력한 숫자보다 작은 숫자로 나눌때 떨어지면 약수
					 System.out.println(i);
					 break;
				 }
			 }
			 
		 }
		
		 
		 
		
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
