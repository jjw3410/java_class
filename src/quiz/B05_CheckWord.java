package quiz;
import java.util.Scanner;
public class B05_CheckWord {
	
	//����ڷκ��� �ܾ �ϳ� �Է¹ް� ù ��° �ܾ�� ������ �ܾ ��ġ�ϸ� "OK"�� ��� �ƴ϶�� "NOT OK"�� ����غ��ÿ�
	
	public static void main(String[]args) {
		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("�ܾ �Է��ϼ���>");
//		String word=sc.next();
//		
//		//null: �ƹ����� ���� ����
//		if (word==null||word=="") {
//			System.out.println("�ܾ �ùٸ��� �ʽ��ϴ�.");
//			return;
//		}
//		
//		
//		
//		
//		char first_letter = word.charAt(0);
//		char last_letter = word.charAt(word.length()-1);
//			
//			if(first_letter==last_letter) {
//				System.out.println("OK");
//			}else
//				System.out.println("NOT OK");
		
		
		
		
		//����ڷκ��� �ܾ �ϳ� �Է¹ް� ù ��° �ܾ�� ������ �ܾ ��ġ�ϸ� "OK"�� ��� �ƴ϶�� "NOT OK"�� ����غ��ÿ�
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���>");
		String ch=sc.next(); 
		
		
		if(ch==null||ch=="") {
			System.out.println("�ܾ �Է��ϼ���");
		}
		
		//����
		
		
		else if(ch.charAt(0)==ch.charAt(ch.length()-1)) {
			System.out.println("OK");
		}else {
			System.out.println("Not ok");
		}
		

		
		
		
	}
	
}
	
