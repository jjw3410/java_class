package quiz;

import java.util.Scanner;

public class B11_reverse_number {
	//����ڷκ��� ������ �ϳ� �Է¹ް� �� ������ ���� �ڸ����� ������� ����غ�����    //������  10�� ����������   
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("���ڸ� �Է��ϼ���<");
	
//	String num= sc.nextLine();
//	
//	int a=num.length();
//	
//	int i=a;
//
//	
//	
//		while(i>0) {
//		--i;
//		System.out.print(num.charAt(i));
//		
//		
//		}
	
	int num= sc.nextInt(); // �Է¹��� ���ڸ� int�� ��ȯ
	

	if(num<0) {      // ���ڸ� 0�̻� ����� �Է� 
		System.out.println("����� �Է��ϼ���.");
	}
	
	long result=0;
	
	while (num!=0) { 
		
		result=num%10; //�Է¹��� ���ڸ� 10���� ���� ������ 
		
		System.out.print(result); //���
		
		num=num/10; //��µ� ���ڸ� ������ ������ ���� 
		
		
		
	}
	
	
	
	
	
	
	
	}
}
