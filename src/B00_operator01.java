
public class B00_operator01 {

	public static void main(String[]args) {
		
		//연산자 (operator)
		//-계산할 때 사용하는것
		
		//# 산술 연산자
		int a=10,b=7;
		double c=7.0;
		System.out.printf("a=%d,b=%d\n",10,7);
		//※연산의 우선순위는 사칙연산의 우선순위를 따른다
		System.out.println("+:"+(a+b));//더하기
		System.out.println("-:"+(a-b));//빼기
		System.out.println("x:"+a*b);//곱하기
		
		
		//※ 정수끼리 나누면 몫만 나온다. 
		System.out.println(a/b);//나누기
		//※정수와 실수를  나누면 정확한 계산을 한다.
		System.out.println(a/c);
		System.out.println(a/(double)b);
		
		System.out.println(a%b);//나머지연산
		
		System.out.println(a^b);//제곱이 아니다(비트연산) 각 숫자의 2진법으로
								// 표기후 같은숫자면 0 다르면 1로 표시후 다시 
								// 10진수로 표시
		
		System.out.println("제곱:"+Math.pow(a, b));//제곱(결과 double 타입)
		System.out.println("제곱근:"+Math.sqrt(2));//제곱근
		System.out.println("절대값 :"+Math.abs(-20));//절대값
		System.out.println("반올림 : "+Math.round(1.234));//반올림
		System.out.println("올림 : "+Math.ceil(1.234));//올림
		System.out.println("내림 : "+Math.floor(1.234));//내림
		System.out.println("더 큰숫자  : "+Math.max(a,b));//더큰숫자
		System.out.println("더 작은숫자 : "+Math.min(a,b));//더작은숫자
		
	}
	
	
}
