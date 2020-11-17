package quiz;
import java.util.Scanner;
public class B10_NextPrime {
	//사용자로부터 숫자를 입력받으면 입력받으 수보다 더크거나 같은 다음 소수를 찾아서 출력해보세요
	public static void main(String[] args) {
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("숫자를 입력하세요");
//		
//		int num=sc.nextInt();
//		
//		if(num<0) {
//			System.out.println("숫자를 다시 입력하세요");
//		}
//		
//		for (int i=num;i>=num;++i) {
//			boolean result=false;
//			for (int j=2;j<i;++j) {
//				if(i%j==0) {
//					result=true;
//					break;
//				}
//			}if(result==false) {
//				
//				System.out.println(i);
//				break;
//			}
//		}
		
		//1.임의의 두 자연수 a, b가 주어졌을 때 둘중 큰값이 a라고 가정해보겠습니다.
		//2.a를 b로 나눈 나머지를 n이라고 하면(A%B=n)
		//n이 0일때 b가 최대공약수 (GCD)입니다.
		//3.만약 n이 0이 아니라면.,a에b값을 다시 넣고 b에n을 대입한후 다시 2/.의 과정을 반복
		
//		int a=46;
//		int b=100;
//		
//		if(a<b) {
//			int temp=a;
//			a=b;
//			b=temp;
//		}
//		
//		int n= a%b;
//		int gcd=1;
//		if(n==0) {
//			gcd=b;
//		}else {
//			a=b;
//			b=n;
//		}
//		for (;n!=0;) {
//			n=a%b;
//			a=b;
//			b=n;
//		}
//		System.out.println("최대 공약수는"+a+"입니다");
//		
		
		
		
		//사용자로부터 숫자를 입력받으면 입력받은 수보다 더크거나 같은 다음 소수를 찾아서 출력해보세요
		
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자를 입력하세요>");
		int num=sc.nextInt();
		
		for(int i=num;i>=num;++i) {//입력받은 수보다 크거나 작은 수 뽑는 반복문
			boolean result=false;
			for (int j=2;j<i;++j) {//위의 for문에서 나온 숫자를 나눌 숫자 반복문
				if(i%j==0) {
					result=true;
					break;
				}
				
			}
			
			if(result==false) {
				
				System.out.println(i);
				break;
			}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
