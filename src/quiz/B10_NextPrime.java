package quiz;
import java.util.Scanner;
public class B10_NextPrime {
	//����ڷκ��� ���ڸ� �Է¹����� �Է¹��� ������ ��ũ�ų� ���� ���� �Ҽ��� ã�Ƽ� ����غ�����
	public static void main(String[] args) {
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("���ڸ� �Է��ϼ���");
//		
//		int num=sc.nextInt();
//		
//		if(num<0) {
//			System.out.println("���ڸ� �ٽ� �Է��ϼ���");
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
		
		//1.������ �� �ڿ��� a, b�� �־����� �� ���� ū���� a��� �����غ��ڽ��ϴ�.
		//2.a�� b�� ���� �������� n�̶�� �ϸ�(A%B=n)
		//n�� 0�϶� b�� �ִ����� (GCD)�Դϴ�.
		//3.���� n�� 0�� �ƴ϶��.,a��b���� �ٽ� �ְ� b��n�� �������� �ٽ� 2/.�� ������ �ݺ�
		
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
//		System.out.println("�ִ� �������"+a+"�Դϴ�");
//		
		
		
		
		//����ڷκ��� ���ڸ� �Է¹����� �Է¹��� ������ ��ũ�ų� ���� ���� �Ҽ��� ã�Ƽ� ����غ�����
		
		Scanner sc=new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���>");
		int num=sc.nextInt();
		
		for(int i=num;i>=num;++i) {//�Է¹��� ������ ũ�ų� ���� �� �̴� �ݺ���
			boolean result=false;
			for (int j=2;j<i;++j) {//���� for������ ���� ���ڸ� ���� ���� �ݺ���
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
