package quiz;
import java.util.Scanner;
public class C01_functionQuiz {
	private static char[] recursine_pow;





	//#���� �Լ��� ������ ������.
	//1.������ ���ڰ� ���ĺ��̸� true�� ��ȯ,�ƴϸ� false�� ��ȯ�ϴ� �Լ�
	//2.������ ���ڰ� 3�� ����̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	//3.���ڸ� �Ѱ� �����ϸ� ���ڿ� "¦���Դϴ�"�Ǵ� "Ȧ���Դϴ�"�� ��ȯ�ϴ� �Լ�
	//4.������ ���ڰ� �Ҽ����� �ƴ��� �Ǻ����ִ� �Լ�(boolean)
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
			check="¦���Դϴ�";		//return num%2==0?"¦���Դϴ�":"Ȧ���Դϴ�";
		}else {
			check="Ȧ���Դϴ�";
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
	
	//����Լ�: �ڱ� �ڽ��� �θ��� �Լ�(���� ������ ,�б� ����,�Ӹ�����)
	public static int recursive_factorial(int num) {
		
		if(num==1) {
			return 1;
		}
		
		
		return num * recursive_factorial(num-1);
	}
	
	//6.���� �ΰ��� 
	
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

