

package quiz;
import java.util.Scanner;

public class B05_palindrome {
	
	//����ڷκ��� �ܾ �ϳ� �Է¹ް�
	//�ش� �ܾ ȸ���̶�� "PALINDROME"�� ���
	//ȸ���� �ƴ϶�� "NOT PALINDROME"�� ���
	
	
	///asdsa
	public static void main(String[]args) {
		
		
	Scanner sc=new Scanner(System.in);
	System.out.print("�ܾ �Է��ϼ���>");
	String word=sc.next();
	
	String check = "PALINDROME";
	
	int a=word.length();
	

	
	for(int i=0;i<a/2;++i) {
		
		if(word.charAt(i)==word.charAt(a-i-1)) {
			
		}else {
			check="NOT PALINDROME";
		}
		
	}
	System.out.println(check);
	
	
	
	
	
	
	
	}

}
