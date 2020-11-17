
public class B02_operator02 {
	
	public static void main(String[]args) {
		
		//#비교연산
		//- 비교 연산의 결과는 참 또는 거짓이다.(boolean타입)
		//- 산술 연산과 비교 연산이 함께 있으면 산술 연산을 먼저 계산한다.
		
		int a=7, b=9;
		
		
		System.out.println("a>b:"+(a>b));
		System.out.println("a<b:"+(a<b));
		System.out.println("a>=b:"+(a>=b));
		System.out.println("a<=b:"+(a<=b)); //부등호 표시가 먼저 나오면 안됨 
		
		System.out.println("a==b:"+(a==b));//같을때  true
		System.out.println("a!=b:"+(a!=b));//다르면  true
		
		//#논리연산
		//-boolean 값 두개로 하는 연산
		//-&&: 두 값이 모두 true 일때만 (and)
		//-||: 두 값이 하나만 true 여도 true(or)
		//-! : true면 false, false이면 true (not)
		
		System.out.println("####AND####");
		System.out.println(true && true);
		System.out.println(true && true);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("####or####");
		System.out.println(true || true);
		System.out.println(true || true);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("####not####");
		System.out.println(!true);
		System.out.println(!false);
		
		
		
		
	}

}
