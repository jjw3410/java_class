package quiz;

import java.util.Scanner;
public class B01_GuessAge {
	
	//����ڷκ��� ������ �⵵�� ���̸� �Է¹����� �ѱ����̸� ����Ͽ� �������
	//�˷��ִ� ���α׷��� ��������
	
	public static void main(String[]args) {
		
	Scanner sc=new Scanner(System.in);
	
	System.out.print("�����ǳ⵵�� �¾�⵵�� �Է��ϼ���>");
	
	int year=sc.nextInt();
	int birth=sc.nextInt();
	
	System.out.printf("����� ���̴�: %d�̴�.",(year-birth+1));
		
		
	}
}
