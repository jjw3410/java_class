package quiz;

import java.util.Scanner;
public class b04_appleQuiz {

	//����� 10���� ���� �� �ִ� �ٱ��ϰ� �ִ�.
	//����ڰ� ����� ������ �Է��ϸ� �ʿ��� �ٱ����� ������ ����غ�����
	public static void main(String[]args) {
		
		//Scanner sc=new Scanner(System.in);
		
//		System.out.print("��������� �Է��ϼ���>");
//		//�����տ� final : ������ �Ұ����� ������ �ȴ�.
//		final int BASKET_SIZE =10;
//		
//		int appleCount=sc.nextInt();
//		
//		if(appleCount<0) {
//			System.out.println("0�̻��� ���ڸ� �Է��ϼž� �˴ϴ�");
//		} else {
//			int needBasket = (int) Math.ceil(appleCount/BASKET_SIZE);
//			System.out.printf("�ʿ��� �ٱ�����%d���Դϴ�.\n",needBasket);
//		}
//		
//		System.out.println("���α׷��� �����մϴ�.");
		
		
		
		//����� 10���� ���� �� �ִ� �ٱ��ϰ� �ִ�.
		//����ڰ� ����� ������ �Է��ϸ� �ʿ��� �ٱ����� ������ ����غ�����
		
		
		
		
		
		
		
		Scanner sc=new Scanner(System.in);//��� ���� �Է¹ޱ�
		System.out.print("��� ������ �Է��ϼ���>");
		int num = sc.nextInt();
		
	
		
		int apple_box=10;
		
		
		if(num%apple_box==0) {
			
			System.out.println(num/apple_box);
			
		}else {
			System.out.println((num/apple_box)+1);//����� 10����� �������� �ٱ��� 1���� �� ��ƾ� �Ǵ� +1
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
