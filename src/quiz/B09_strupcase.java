 package quiz;

import java.util.Scanner;

public class B09_strupcase {
	// 입력받은 문자열의 모든 알파벳을 대문자로 만들어보세요.
	// 원본 훼손되지 않고, 새로운 문자열이 생성되어야함
	public static void main(String[] args) {

		// 영어 대문자 65~90
		// 영어 소문자 97~122

//		StringBuilder msg = new StringBuilder("메세지 : ");
//		msg.append("hello!");//+=와 의미가 같음
//		msg.append("!!!!?");
//		
//		System.out.println(msg);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("문자열을 입력>");
//		String str = sc.nextLine();
//
//		StringBuilder ch = new StringBuilder();// 기존 문자열에 새로운 문자열을 추가, String이긴 하지만 문장열은 아님 마지막에 문자열로 바꿔줘야됨.
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
//			ch.append(chr);// 새로운 문자열을 ch문자열에 추가.
//
//		}
//		System.out.println(str);
//
//		String T = ch.toString(); // String 위에 StringBuilder 추가했던것을 문자열로 바꿔줌.
//
//		System.out.println(ch);

		
		
		// 입력받은 문자열의 모든 알파벳을 대문자로 만들어보세요.
		// 원본 훼손되지 않고, 새로운 문자열이 생성되어야함
		
		Scanner sc=new Scanner(System.in);
		System.out.println("문자열 입력>");
		String str=sc.nextLine();
		
		
		StringBuilder ch = new StringBuilder();//ch에 새로운 문장열을 저장
		
		int len=str.length();
		
	
		for(int i=0;i<len;++i) {
			
			char a=str.charAt(i);
			
			if(a>='a'&&a<='z') {
				
				a-=32;
			}
			ch.append(a); //새로운 문자열을 a 문자열에 추가
			
			
		}
		
		String T=ch.toString();//StringBuilder했던것을 문장열로 변경
		System.out.printf("입력받은 문자열:%s\n바뀐 문자열 :%s",str,ch);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
