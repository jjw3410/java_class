
package quiz;

import java.util.Scanner;

public class B01_wonToDollar {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�ѱ����� �Է��ϼ���.>");
		
		int won= sc.nextInt();
		double dollar=won/1138.96;
		
		System.out.printf("�ѱ��� �Է��ѵ�:%d��, �޷�ȯ���ݾ�:%.2f$�Դϴ�.",won,dollar-(dollar*0.0175));
		
		
		
	}

}
