

package quiz;

import java.util.Scanner;

public class B01_celToFahr {

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�����µ��� �Է��ϼ���>");
		
		float s=sc.nextFloat();
		
		System.out.printf("�����µ�:%.1f��, �����µ���ȭ���µ���:%.1f��\n",s,(s*1.8)+32);
		
	}
}
