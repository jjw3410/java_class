package quiz;

import java.util.Scanner;

public class C12_inputRightThing {

	//����ڷκ��� int Ÿ���� �����͸� �Է¹޾ƺ�����
	//�߸��� Ÿ���� �����Ͱ� �������� ���α׷��� ������� �ʾƾ� �մϴ�.
	//(�ùٸ��� int�� �Էµ� ��� ���α׷��� ����˴ϴ�)
	

	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���>");
		
		while(true) {
			try {
				
				int num= sc.nextInt();
				System.out.println("�Է��� ����:"+num);
				System.out.println("���α׷��� �����մϴ�");
				break;
			}catch(Exception e) {
				sc.nextLine();
				
				System.out.println("int �� �����Ͱ� �ƴմϴ�.");
				
			}
				
		
		}
		
		
		
		
		
		
		
	}
}
