package quiz;
import java.util.Arrays;
import java.util.Scanner;

public class B09_printReverse {

	private static char[] ch;

	//����ڰ� ������ �Է��ϸ� �� ������ �Ųٷ� ����غ�����
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("������ �Է��ϼ���>");
		String sentence =sc.nextLine();

		
		//#������������ ���ڿ��� ���� �ϼ���ų���ִ�(������)
		//String str ="hello";
		//str+=",World!"
		
		//StringBuilder�� +=��� append() �Լ��� ���� ���ڿ��� �����.
		StringBuilder str= new StringBuilder("hello");
		str.append(",world!");
		
		System.out.println(str);
		
		//�� ����� �� �ڿ� String���� ��ȯ�ؼ� ����ϸ� �ȴ�.
		String build_result=str.toString();
		System.out.println(build_result);
		
		//�Ųٷ� ���� ���ڿ��� ������ ����
		String reverse="";
		
		for(int i=sentence.length() -1;i>=0;--i) {
			System.out.print(sentence.charAt(i));
		}
		System.out.println(reverse);
		
		//����ڰ� ������ �Է��ϸ� �� ������ �Ųٷ� ����غ�����
		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("������ �Է��ϼ���>");
//		String str=sc.nextLine();
//		
//		int len=str.length();
//		StringBuilder str2=new StringBuilder();
//		String reverse="";
//		
//		for (int i=len-1;i>=0;i--) {
//			
//			char ch = str.charAt(i);
//			
//			str2.append(ch);
//			
		
//						
//		}
//		System.out.println(Arrays.toString(str2));	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
