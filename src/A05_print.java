
public class A05_print {

	public static void main(String[]args) {
		
		//#콘솔에 출력하기 위한 여러가지 함수들
		
		//1.print()
		//-줄을 자동으로 바꾸지 않으며 출력하는 함수
		System.out.print("Hello, world!");
		System.out.print("Hello, world!");
		System.out.print("Hello, world!");
		
		//2.println(_)
		//-줄을 자동으로 바꾸며 출력하는 함수
		//-()에 전달한 데이터 맨 뒤에 '\n'을 추가하여 출력한다
		//-()에 아무것도 전달하지 않으면 '\n'만 출력한다.
		System.out.println("Hello, world!");
		
		//3.printf()
		//- 서식문자를 이용해 출력할 수 있는 함수
		//- 서식을 이용하는게 편리한 경우가 많다.
		
		//2020년 10월 20일 오전 9:20:30
		int year= 2020;
		int month=10;
		int day=20;
		
		//System.out.println(year+"년"+month+"월"+day+"일");
		System.out.printf("%d년 %d월 %d일\n",year,month,day);
		
		//# printf에 사용하는 서식문자들
		// %d : 10진수 정수(decimal)
		// %x,X : 16진수 정수(hexa decimal)  대소문자 구분 가능
		System.out.printf("%x %X\n",10,10);
		// %o : 8진수 정수 (octal)
		// %s : 문자열(String)
		// %c : 문자(character)
		// %f : 실수
		System.out.printf("당신의 신용등급은 '%s'입니다\n","1등급");
		System.out.printf("%d[%c],%x(16),%o(8)\n",65,65,65,65);
		
		//# 서식문자 옵션
		//- d만 너허야하는것은 아님
		
		//%숫자d: 숫자만큼 칸을 확보하여 출력한다.
		System.out.printf("이름: %20s\n","Hong gildong");
		System.out.printf("나이: %20d\n",15);
		
		//%-숫자d: 숫자만큼 칸을 확보한 뒤 왼쪽 정렬 하여 출력한다.
		System.out.printf("%-10s:Hong gildong\n","Full name");
		System.out.printf("%-10s:15\n","Age");
		//%0숫자d:숫자만큼 칸을 확보한 뒤 빈 칸에 0을 채워 출력한다.
		System.out.printf("%010d\n",123);
		System.out.printf("%010f\n",123.123);
		
		//%+숫자d: 양수 앞에도 부호를 붙이게 된다.
		System.out.printf("오늘은 섭씨 %+d℃입니다.\n",20);
		
		//%.숫자f:소수 자릿수를 설정한다
		System.out.printf("%.3f\n",123.123);
		System.out.printf("%f\n",123.123);
		System.out.printf("%.10f\n",123.123);
		System.out.printf("%.20f\n",123.123);
		System.out.printf("%.255f\n",123.123);
		
		
		
	}
}
