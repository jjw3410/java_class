package quiz;

import java.util.Scanner;

public class B09_is_contain_alpha {
	public static void main(String[] args) {
		// ����ڰ� �Է��� ���ڿ��� ���ĺ��� ���ԵǾ� ������ true�� ���
		// ������ false ���
		Scanner sc=new Scanner(System.in);
		System.out.print("���ڿ��Է��ϼ���>");
		String sentence=sc.nextLine();
		
		int j= sentence.length();
		
		boolean ok = false;
		
		for(int i=0;i<=j-1;++i) {
			
			char a = sentence.charAt(i);
			if(a>='a'&&a<='z'||a>='A'&& a<='Z') {
				ok = true;
				break; // ������ �ݺ����� ����.
			}
				
			
		}
		
		System.out.println(ok);

		// ����ڰ� �Է��� ���ڿ��� ���ĺ��� ���ԵǾ� ������ true�� ���
		// ������ false ���

//		Scanner sc = new Scanner(System.in);
//		System.out.println("���ڿ��� �Է��ϼ���>");
//		String str = sc.nextLine();
//
//		// asd33
//		// 01233
//		int len = str.length();
//		boolean result = true;
//		for (int i = 0; i < len; i++) {
//
//			char a = str.charAt(i);
//
//			if (a >= 'a' && a <= 'z' || a >= 'A' && a <= 'Z') {
//
//			} else {
//				result = false;
//			}
//
//		}
//
//		System.out.println(result);

	}
}







