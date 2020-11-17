
public class B08_operator04 {

	public static void main(String[]args) {
		
		//#대입연산
		//=:왼쪽의 변수에 오른쪽의 값을 대입
		int num=10;
		num=num+5;
		System.out.println(num);
		
		
		//#복합 대입연산
		//-변수에 원래 들어있던 값에 누적시키는 연산
		
		
		
		num=10;
		num+=5;//num=num+5
		num-=2;//num=num-2
		num*=2;//num=num*2
		num/=4;//num=num/4
		num%=3;//num=num%3
		System.out.println(num);
		
		
		//#단항연산
		
		num=10;
		
		num++;//num=num+1
		System.out.println(num);
		++num;//num=num+1
		System.out.println(num);
		num--;//num=num-1
		System.out.println(num);
		--num;//num=num-1
		System.out.println(num);
		
		//#++,--의 위치에 따라 실행 결과가 달라지기도 한다.
		int a =10,b=3;
		int result = a*b;//++뒤에 있으면 세미콜론 끝난 다음 더한다.
							//++앞에 있으면 더한뒤 값계산
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
