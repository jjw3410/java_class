package quiz;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class B13_31games {
	
	//#31������ ��������.
	//1.��ǻ�Ϳ� ����� ������ ���鼭 ���ڸ� �����Ѵ�(1,2,3)
	//2.��ǻ�ʹ� �������� ���ڸ� �����Ѵ�.
	//3.�������� 31�� �θ��� ��� Ȥ�� ��ǻ�Ͱ� �й��Ѵ�.
	public static void main(String[] args) throws IOException{
	
		Scanner sc= new Scanner(System.in);
		int sum=0;
		String name;
		Random ran=new Random();
		
		
		boolean player=ran.nextBoolean();// �÷��̾ �������� ����
		
		System.out.printf("<%s>�� �����Դϴ�!\n",player?"���":"��ǻ��");
		
		while(true) { 
			
			int num=ran.nextInt(3)+1;//���ڴ� 1~3���� ���
			
			if(player==false) { //��ǻ���϶� 1~3 �������
				sum+=num;
				System.out.println("��ǻ��>"+num);
			}
			else {// ����϶�
				System.out.print("��� >");//����϶��� �����Է�
				int cnt_p=sc.nextInt();
				if(cnt_p>3||cnt_p<0) {//1�̸� 3�ʰ� �϶� �ٽ��Է�
					System.out.println("�߸��Է��߽��ϴ�.�ٽ� �Է��ϼ���");
					continue;//1~3�Է������� �ٽ� �ö󰡼� �Է¹ް� �����´�.
				}
				sum+=cnt_p;
			}
			if(sum>=31) {//���ڰ� 31�Ѿ����� ����
				break;
			}
				System.out.println("�������: "+sum);
				player=!(player);
			}
		
		name=player?"���":"��ǻ��";
		System.out.printf("%s��(��)%d�� �ҷ����ϴ�.%s���й�",name,sum,name);
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
