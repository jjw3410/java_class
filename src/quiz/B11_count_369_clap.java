package quiz;
import java.util.Scanner;

public class B11_count_369_clap {
	
	//����ڷκ��� ���� �ϳ��� �Է¹ް� �ش� ���ڱ��� 369������ ����ȴٸ� �ڼ��� �� ��� �ľ� �ϴ��� �������.
	
	
	public static void main(String[] args) {
		
		
		//���α׷� ����ð� ���� ���
	
//		Scanner sc= new Scanner(System.in);
//		System.out.print("���ڸ� �Է��ϼ���>");
//		int num=sc.nextInt();
//		
//		if (num<0) { 
//			System.out.println("���ڸ� �ٽ� �Է��ϼ���>");
//		}
//		
//		
//		int start=1;
//		int count=0;
//		
//		while(start<=num) { // start ������ �Է��Ѽ������� ���� ����
//			int check=start; // while ������ ���ڰ� ���ϸ� �ȵǴϱ�  ���Ƿ� check�� �������ش�.
//		
//			while(check!=0) { 
//				
//				if(check%10==3||check%10==6||check%10==9) {//check���� 10���� ���� ��������3,6,9
//				
//					count++;// ī��Ʈ���� �÷��ְ�
//				
//	
//				}	
//				check/=10;//�����ڸ� ���԰� �����ڸ� �ٽ� ���� if�� �׽�Ʈ
//					
//			}
//			start++; //�˻��� ���� 1�� ������
//				
//		}
//		System.out.println(count);
//			
		
		
		//����ڷκ��� ���� �ϳ��� �Է¹ް� �ش� ���ڱ��� 369������ ����ȴٸ� �ڼ��� �� ��� �ľ� �ϴ��� �������.
		
		Scanner sc= new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���>");
		int num=sc.nextInt();
		
		
		int start=1;
		int count=0;
		
		for(int i=start;i<=num;i++) {
			
			if(num%10==3||num%10==6||num%10==9) {
				
				count++;
				
				
				
				
				
				
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
