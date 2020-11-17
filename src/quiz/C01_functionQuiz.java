package quiz;
import java.util.Scanner;
public class C01_functionQuiz {
	private static char[] recursine_pow;





	//#다음 함수를 정의해 보세요.
	//1.전달한 문자가 알파벳이면 true를 반환,아니면 false를 반환하는 함수
	//2.전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	//3.숫자를 한개 전달하면 문자열 "짝수입니다"또는 "홀수입니다"를 반환하는 함수
	//4.전달한 숫자가 소수인지 아닌지 판별해주는 함수(boolean)
	//5.
	//6.
	
	
	//1.
	public static boolean alpha(char ch) {
		
		
		
		
		boolean check;
		

		
		if( ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') {
			check=true;
		}else {
			check=false;
		}					//return ( ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
		
		return check;
		
		
	}
	//2.
	public static boolean multiple(int num) {
		
		
		boolean check;
		
		if(num%3==0) {
			check=true;
		}else {							//return num%3==0;
			check=false;
		}
		
		return check;
	}
	//3.
	public static  String number (int num) {
		
		String check;
		
		if(num%2==0) {
			check="짝수입니다";		//return num%2==0?"짝수입니다":"홀수입니다";
		}else {
			check="홀수입니다";
		}
		
		return check;
		
	}
	//4.
	public static boolean prime(int num) {
		if (num==1) {
			return false;
		}
		
		double sqrt=Math.sqrt(num);
		for(int i=2;i<sqrt;++i) {
			if(num%1==0) {
				return false;
			}
			
		}
		return true;
		
		
	
	}
	//5.
	public static int factorial (int num) {
		
		
		int result=1;
		
		for (int i=num;i>0;--i) {
			result*=i;
		}
		
		
		return result;
		
	}
	
	//재귀함수: 자기 자신을 부르는 함수(성능 않좋음 ,읽기 힘듬,머리아픔)
	public static int recursive_factorial(int num) {
		
		if(num==1) {
			return 1;
		}
		
		
		return num * recursive_factorial(num-1);
	}
	
	//6.숫자 두개를 
	
	public static int recursive_pow(int a,int b) {
		if(b==0) {
			return 1;
		}
		return a*recursive_pow(a,b-1);
	}
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println(alpha('5'));
		System.out.println(multiple(5));
		System.out.println(number(123));
		System.out.println(prime(2));
		System.out.println(factorial(5));
		System.out.println(recursive_factorial(5));
		System.out.println(recursine_pow);
		
		
	}
}

