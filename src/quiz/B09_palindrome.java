package quiz;
import java.util.Scanner;
public class B09_palindrome {
	
	
	//사용자로부터 단어를 하나 입력받고 해당 단어가 회문이라면"PALINDROME"를 출력 아니라면 "NOT PALINDROME"출력
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("단어를 입력하세요>");
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
		//-여태까지 빌드한 문자열을 거꾸로 뒤집어준다.
		
		
	}

	
}
