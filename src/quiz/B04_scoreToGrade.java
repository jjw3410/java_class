package quiz;

import java.util.Scanner;

public class B04_scoreToGrade {
	
	//������ �Է¹����� �ش��ϴ� ����� ������ִ� ���α׷��� ����ÿ�.
	//90���̻� A���
	//80���̻� B���
	//70���̻� C���
	//60���̻� D���
	//�� �� F���
	
	
	public static void main(String[]args) {
		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("������ �Է��ϼ���.>");
//		
//		int score=sc.nextInt();
//		
//		if(score<0) {
//			System.out.println("������ �ٽ��Է��ϼ���.");
//		}else if (score>100) {
//			System.out.println("������ �ٽ� �Է��ϼ���.");
//		}
//		// return,main()�� ������.
//		// system.exit(0); //���α׷��� �����Ѵ�
//		else if(score>=90) {
//			System.out.printf("�Է¹��� ����:%d, A����Դϴ�.",score);
//		}else if(score>=80) {
//			System.out.printf("�Է¹��� ����:%d, B����Դϴ�.",score);
//		}else if(score>=70) {
//			System.out.printf("�Է¹��� ����:%d, C����Դϴ�.",score);
//		}else if(score>=60) {
//			System.out.printf("�Է¹��� ����:%d, D����Դϴ�.",score);
//		}else  {
//			System.out.printf("�Է¹��� ����:%d, F����Դϴ�.",score);
//		}
//		System.out.println();
//		System.out.println("���α׷��� �����մϴ�.");
		
		
		//������ �Է¹����� �ش��ϴ� ����� ������ִ� ���α׷��� ����ÿ�.
		//90���̻� A���
		//80���̻� B���
		//70���̻� C���
		//60���̻� D���
		//�� �� F���
		
		Scanner sc=new Scanner(System.in);
		System.out.print("������ �Է��ϼ���>");
		int score = sc.nextInt();
		
		if(score<0) {
			System.out.println("������ �ٽ� �Է��ϼ���");
		}else if(score>100) {
				System.out.println("������ �ٽ� �Է��ϼ���.");
			}
		
		else if(score>=90) {
			System.out.printf("�Է��Ͻ�����:%d,A����Դϴ�",score);
		}else if(score>=80) {
			System.out.printf("�Է��Ͻ�����:%d,B����Դϴ�",score);
		}else if(score>=70) {
			System.out.printf("�Է��Ͻ�����:%d,c����Դϴ�",score);
		}else if(score>=60) {
			System.out.printf("�Է��Ͻ�����:%d,d����Դϴ�",score);
		}else 
			System.out.printf("�Է��Ͻ�����:%d,f����Դϴ�",score);
		}
		
		
	
		
	}



