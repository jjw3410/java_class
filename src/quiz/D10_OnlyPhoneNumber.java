package quiz;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class D10_OnlyPhoneNumber {

	//사용자로부터 전화번호만 입력받아보세요(전화번호 형태가 아닐 경우 에러메세지와 함께 다시 입력)
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.print("전화번호를 입력하세요<");
			String phone_n=sc.next();
			
			if(Pattern.matches("[0-1]{3}-[0-9]+-[0-9]+", phone_n)) {
				System.out.println("입력하신 전화번호:"+phone_n);
				break;
			}else {
				System.err.println("전화번호를 다시입력하세요>");
				
			}
			
		}
		
	}
}
