package quiz;


import java.util.Scanner;

public class B02_conditionQuiz01 {
	
	
	/*
	 * 1.int형 변수 a가 10보다 크고 20보다 작을때 true
	 * 2.int형 변수 b가 짝수일때 true
	 * 3.int형 변수 c가 7의 배수일때 true
	 * 4.int형 변수 hour가 0이상 24이상이 아니고, 12이상일 때 true
	 * 5.int형 변수  year가 400으로 나누어 떨어지거나 
	 * 또는 4로 나누어 떨어지고 100으로 나누어떨어지지 않을 때 true
	 * 6.민수가 철수보다 2살 많으면 true
	 * 7.민수가 철수보다 생일이 3달 빠르면 true
	 * 8.boolean형 변수 powerOn이 false일때 true
	 * 9.문자열 참조변수 str이 "Yes"일 때 true
	 * 10.삼각형 A가 직각삼각형이면 true
	 * 11.int형 변수 d와e의 차이가 30일때 true
	 */
	
	
	
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		
			System.out.print("a의 값을 입력하세요>");
		//1
		int a =sc.nextInt(); 
		System.out.println((a>10)&&(a<20));
		//2
		
		System.out.print("b의 값을 입력하세요 >");
		int b= sc.nextInt();
		System.out.println(b%2==0);
		//3
		System.out.print("c의 값을 입력하세요>");
		int c=sc.nextInt();
		System.out.println(c%7==0);
		//4
		System.out.print("시간을 입력하세요>");
		int hour=sc.nextInt();
		System.out.println(hour<0||hour<24&&hour>=12);
		//5.
		System.out.print("d와 e의 값을 입력하세요>");
		int d=sc.nextInt();
		int e=sc.nextInt();	
		
		System.out.println(Math.abs(d-e)==30);
		//6
		System.out.print("연도 입력>");
		double year=sc.nextInt();
		System.out.println(year%400==0 || year%4==0&&year%100==1);
		//7
		System.out.print("민수나이와 철수나이 입력>");
		int minage=sc.nextInt();
		int chrage=sc.nextInt();
		
		System.out.println(minage>chrage+2);
		//8.
		System.out.print("민수생일,철수생일 입력>");
		int minbir=sc.nextInt();
		int chrbir=sc.nextInt();
		
		System.out.println(minbir>chrbir+3);
		
		//9.
		boolean powerOn=false;
		System.out.print(!powerOn);
		System.out.println();
		//10.
		//소문자로 시작하는 타입 = 값을 저장한다
		//대문자로 시작하는 타입 - 주소를 저장한다
		String str="Yes";
		String str2="Yes";
		String str3=new String("Yes");
		String str4=str;
		
	
		System.out.println(str==str2);//주소를 통한 비교1
		System.out.println(str==str3);//주소를 통한 비교 2
		System.out.print(str.equals(str3));//값을 통한비교
		
		
		//11.
		int a1=30, a2=40, a3=90;
		
		System.out.println(a1+a2+a3==180&&(a1==90||a2==90||a3==90)&&(a1!=0 &&a2!=0&&a3!=0));
		
		int b1=3,b2=4,b3=5;
		
		System.out.println(b1*b1+b2*b2==b3*b3||b1*b1+b3*b3==b2*b2||b3*b3+b2*b2==b1*b1);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
