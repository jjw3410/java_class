package quiz;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class D10_OnlyPhoneNumber {

	//����ڷκ��� ��ȭ��ȣ�� �Է¹޾ƺ�����(��ȭ��ȣ ���°� �ƴ� ��� �����޼����� �Բ� �ٽ� �Է�)
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.print("��ȭ��ȣ�� �Է��ϼ���<");
			String phone_n=sc.next();
			
			if(Pattern.matches("[0-1]{3}-[0-9]+-[0-9]+", phone_n)) {
				System.out.println("�Է��Ͻ� ��ȭ��ȣ:"+phone_n);
				break;
			}else {
				System.err.println("��ȭ��ȣ�� �ٽ��Է��ϼ���>");
				
			}
			
		}
		
	}
}
