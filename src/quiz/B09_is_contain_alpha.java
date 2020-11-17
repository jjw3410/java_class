package quiz;

import java.util.Scanner;

public class B09_is_contain_alpha {
	public static void main(String[] args) {
		// 사용자가 입력한 문자열에 알파벳이 포함되어 있으면 true를 출력
		// 없으면 false 출력
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열입력하세요>");
		String sentence=sc.nextLine();
		
		int j= sentence.length();
		
		boolean ok = false;
		
		for(int i=0;i<=j-1;++i) {
			
			char a = sentence.charAt(i);
			if(a>='a'&&a<='z'||a>='A'&& a<='Z') {
				ok = true;
				break; // 만나면 반복문을 끝냄.
			}
				
			
		}
		
		System.out.println(ok);

		// 사용자가 입력한 문자열에 알파벳이 포함되어 있으면 true를 출력
		// 없으면 false 출력

//		Scanner sc = new Scanner(System.in);
//		System.out.println("문자열을 입력하세요>");
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







