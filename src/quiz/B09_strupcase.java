 package quiz;

import java.util.Scanner;

public class B09_strupcase {
	// �Է¹��� ���ڿ��� ��� ���ĺ��� �빮�ڷ� ��������.
	// ���� �Ѽյ��� �ʰ�, ���ο� ���ڿ��� �����Ǿ����
	public static void main(String[] args) {

		// ���� �빮�� 65~90
		// ���� �ҹ��� 97~122

//		StringBuilder msg = new StringBuilder("�޼��� : ");
//		msg.append("hello!");//+=�� �ǹ̰� ����
//		msg.append("!!!!?");
//		
//		System.out.println(msg);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���ڿ��� �Է�>");
//		String str = sc.nextLine();
//
//		StringBuilder ch = new StringBuilder();// ���� ���ڿ��� ���ο� ���ڿ��� �߰�, String�̱� ������ ���忭�� �ƴ� �������� ���ڿ��� �ٲ���ߵ�.
//		int a = str.length();
//
//		for (int i = 0; i <= a - 1; ++i) {
//			char chr = str.charAt(i);
//
//			if (chr >= 'a' && chr <= 'z') {
//
//				chr -= 32;
//
//			}
//			ch.append(chr);// ���ο� ���ڿ��� ch���ڿ��� �߰�.
//
//		}
//		System.out.println(str);
//
//		String T = ch.toString(); // String ���� StringBuilder �߰��ߴ����� ���ڿ��� �ٲ���.
//
//		System.out.println(ch);

		
		
		// �Է¹��� ���ڿ��� ��� ���ĺ��� �빮�ڷ� ��������.
		// ���� �Ѽյ��� �ʰ�, ���ο� ���ڿ��� �����Ǿ����
		
		Scanner sc=new Scanner(System.in);
		System.out.println("���ڿ� �Է�>");
		String str=sc.nextLine();
		
		
		StringBuilder ch = new StringBuilder();//ch�� ���ο� ���忭�� ����
		
		int len=str.length();
		
	
		for(int i=0;i<len;++i) {
			
			char a=str.charAt(i);
			
			if(a>='a'&&a<='z') {
				
				a-=32;
			}
			ch.append(a); //���ο� ���ڿ��� a ���ڿ��� �߰�
			
			
		}
		
		String T=ch.toString();//StringBuilder�ߴ����� ���忭�� ����
		System.out.printf("�Է¹��� ���ڿ�:%s\n�ٲ� ���ڿ� :%s",str,ch);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
