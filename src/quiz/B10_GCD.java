package quiz;
import java.util.Scanner;
public class B10_GCD {
	//�� ���ڸ� �Է¹����� �� ������ �ִ������� ���غ�����.
	public static void main(String[] args) {
//		System.out.print("���� 1�� �Է��ϼ���>");
//		int num=new Scanner(System.in).nextInt();
//		System.out.print("���� 2�� �Է��ϼ���>");
//		int num2=new Scanner(System.in).nextInt();
//		//20 (1,2,4,5,10,20)  30(1,2,3,5,10,15,30)   
//		
//		if(num<0) {
//			if(num2<0) {
//				System.out.println("����� �Է��ϼ���.");
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
		//�� ���ڸ� �Է¹����� �� ������ �ִ������� ���غ�����.
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("ù��° ���ڸ� �Է��ϼ���>");
		 int num=sc.nextInt();
		 System.out.println("�ι�° ���ڸ� �Է��ϼ���>");
		 int num2=sc.nextInt();
		 
		 if(num<=0) {
			 System.out.print("���ڸ� �ٽ� �Է��ϼ���");
		 }
		 
		 for (int i=num;i>=1;--i) {
			 if(num%i==0) {//�Է��� ���ڸ�  �Է��� ���ں��� ���� ���ڷ� ������ �������� ���
				 if(num2%i==0) {//�Է��� ���ڸ�  �Է��� ���ں��� ���� ���ڷ� ������ �������� ���
					 System.out.println(i);
					 break;
				 }
			 }
			 
		 }
		
		 
		 
		
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
