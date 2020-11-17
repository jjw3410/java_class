

package quiz;
import java.util.Scanner;

public class B05_palindrome {
	
	//사용자로부터 단어를 하나 입력받고
	//해당 단어가 회문이라면 "PALINDROME"을 출력
	//회문이 아니라면 "NOT PALINDROME"을 출력
	
	
	///asdsa
	public static void main(String[]args) {
		
		
	Scanner sc=new Scanner(System.in);
	System.out.print("단어를 입력하세요>");
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
