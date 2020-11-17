
//주석(comment)
//-프로그래머가 하고 싶은 말을 메모하는것
//-주석은 프로그램 실행에 영향을 미치지 않는다.
//-한줄만 주석처리가능 
/*
  여러줄 주석처리 가능
 */
/**
 * 문서화 주석
 * (이클립스가 이 설명을 읽어준다)
 * 
 *
 */
//ctrl+Z: 방금 한일 취소하기
//ctrl+y: ctrl+Z을 다시 되돌리기
//ctrl+ (+,-) :글자크기 조절
//ctrl+m= 현재창 크기 조절

//#블록지정 관련 단축키
//Shift+home = 커서 위치부터 줄의 맨 앞까지 블록지정
//Ctrl+a= 파일 전체 블록지정
//Shift+end = 커서 위치부터 줄의 맨 뒤까지  블록 지정

//Shift+Tab= 거꾸로 들여쓰기


//public class의 이름은 반드시 파일명과 같아야한다.
public class A00_Hello {
//빨간줄이 생겼을 떄 그곳에 커서를 두고 F2를 누르면 해당에러에 
//대한 정보와 해결책을 볼수있다.	
	
	//#main()함수
	//-프로그램의 시작지점 
	//-프로그램을 시작하면 가장 먼저 main() 함수를 찾아서 실행시킨다.
	//-main() 함수의 범위는 중괄호로 결정된다.
	public static void main(String[]args) {
		//프로그램의 시작지점
		
		//#System.out.println() 함수 
		//-()안에 전달한 내용을 콘솔에 출력하는 함수
		
		//함수란 ?
		//-어떤 단어뒤에 ()가 붙어있으면  모두 함수라고 부른다.
		
		
		//콘솔이란 ?
		//-글자만 나오는 검은화면
		//-Eclipse에서는 테스트용으로 하얀 바탕의 콘솔을 제공하는 것 뿐이다.
		//-실제로 우리가 작성한 프로그램을 검은 화면에서 실행하면
		//검은화면에 출력된다.
		//검은색 콘솔화면 실행창에서 cmd 
		System.out.println("Hello, world!");
		System.out.println("┌──────────────────────────────┐");
		System.out.println();
		System.out.println("	1.Start game");
		System.out.println(" 	2.Exit");
		System.out.println();
		System.out.println("└──────────────────────────────┘");
		
		
		//#자바의 데이터들
		
		//1.""사이에 적는 것: 문자열(String)
		System.out.println("ABCDEFG");
		
		//2.그냥 숫자	: 정수(int,Integer)
		System.out.println(123);
		System.out.println(123456);
		System.out.println(123+2);
		System.out.println(123*2);
		
		
		
		
		//3.소수 : 실수(Double,Float)
		System.out.println(123.1234567);//안붙이면 double
		System.out.println(123.1234567f);//f를 붙이면 float
		
		//4.''사이에 적는 것: 문자(Character)
		//@@ 작은 따옴표에는 문자를 여러개 넣으면 에러가 발생 @@
		System.out.println('o');
		System.out.println('안');
		System.out.println('浩');
		System.out.println('$');
		System.out.println('2');
		
		//# 문자가 실제로 가지고 있는 숫자값 보기
		System.out.println("家의 코드값 : "+(int)'家');
		System.out.println("$의 코드값 : "+(int)'$');
		System.out.println(" '가' 의 코드값 : "+(int)'가');
		
		//# 코드값으로 문자 출력하기
		System.out.println((char)23478);
		System.out.println((char)36);
		System.out.println((char)44032);
		
		
		
		//@다른 타입 +정수가 가능하다
		//1.문자열 + 정수는 이어붙인다.
		System.out.println("123"+456);
		System.out.println("문자열: "+456);
		//2.실수+ 정수는 실수가 된다
		System.out.println(1234.56+30);
		//3.문자+정수는??
		System.out.println('한'+90);
		
		//;(세미콜론): 한 명령어가 끝났음을 알린다.
		
		

		//프로그램의 끝
	}
	
}












