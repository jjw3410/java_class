package quiz;
import java.util.Scanner;
public class B05_CheckWord {
	
	//사용자로부터 단어를 하나 입력받고 첫 번째 단어와 마지막 단어가 일치하면 "OK"를 출력 아니라면 "NOT OK"를 출력해보시오
	
	public static void main(String[]args) {
		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("단어를 입력하세요>");
//		String word=sc.next();
//		
//		//null: 아무값도 없는 상태
//		if (word==null||word=="") {
//			System.out.println("단어가 올바르지 않습니다.");
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
		
		
		
		
		//사용자로부터 단어를 하나 입력받고 첫 번째 단어와 마지막 단어가 일치하면 "OK"를 출력 아니라면 "NOT OK"를 출력해보시오
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("문자를 입력하세요>");
		String ch=sc.next(); 
		
		
		if(ch==null||ch=="") {
			System.out.println("단어를 입력하세요");
		}
		
		//길이
		
		
		else if(ch.charAt(0)==ch.charAt(ch.length()-1)) {
			System.out.println("OK");
		}else {
			System.out.println("Not ok");
		}
		

		
		
		
	}
	
}
	
