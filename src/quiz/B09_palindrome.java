package quiz;
import java.util.Scanner;
public class B09_palindrome {
	
	
	//����ڷκ��� �ܾ �ϳ� �Է¹ް� �ش� �ܾ ȸ���̶��"PALINDROME"�� ��� �ƴ϶�� "NOT PALINDROME"���
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("�ܾ �Է��ϼ���>");
		String word=sc.next();
		
		String result="PALINDROME";
	
		int a = word.length();
		
		for (int i=0;i<a/2;++i) {
			
			char ch1=word.charAt(i);
			char ch2=word.charAt(a-1-i);
			
			
			if(ch1!=ch2) {
				result= "NOT PALINDROMe";
					break;
			} 
		}System.out.println(result);
		
		//#StringBulider.reverse()
		//-���±��� ������ ���ڿ��� �Ųٷ� �������ش�.
		
		
	}

	
}
