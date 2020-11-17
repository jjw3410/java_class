package quiz;
import java.util.Arrays;
import java.util.Scanner;

public class B09_printReverse {

	private static char[] ch;

	//사용자가 문장을 입력하면 그 문장을 거꾸로 출력해보세요
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("문장을 입력하세요>");
		String sentence =sc.nextLine();

		
		//#누적연산으로 문자열을 점차 완성시킬수있다(느리다)
		//String str ="hello";
		//str+=",World!"
		
		//StringBuilder는 +=대신 append() 함수를 통해 문자열을 만든다.
		StringBuilder str= new StringBuilder("hello");
		str.append(",world!");
		
		System.out.println(str);
		
		//다 만들고 난 뒤에 String으로 변환해서 사용하면 된다.
		String build_result=str.toString();
		System.out.println(build_result);
		
		//거꾸로 만든 문자열을 저장할 변수
		String reverse="";
		
		for(int i=sentence.length() -1;i>=0;--i) {
			System.out.print(sentence.charAt(i));
		}
		System.out.println(reverse);
		
		//사용자가 문장을 입력하면 그 문장을 거꾸로 출력해보세요
		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("문장을 입력하세요>");
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
