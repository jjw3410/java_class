import java.util.Random;

public class B12_random {

	public static void main(String[] args) {
	//#JAVA에서 무작위 숫자 생성하기
		
		
		//1.Math.random()
		//-double타입의 0<=x<1인 랜덤 소수를 생성한다
		//-이 소수를 이용하여 원하는 숫자를 만들어서 사용할 수 있다
		
		//# 원하는 숫자를 만드는 절차
		//-(1)원하는 숫자의 개수를 곱한다.(ex80~100)
			//0<=x<21
		//-(2)원하는 숫자 중 가장 작은 숫자를 더한다.
			//0+80<=x<21+80
		//-(3)소수점 아래를 삭제한다.
		for(int i=0;i<100;++i) {
		System.out.println((int)(Math.random()*21+80));
		}
		
		
		
		//2.random클래스를 이용
		//-생성할 때 원하는 시드번호를 선택할 수 있다
		//-같은 시드 번호로 생성하면 같은값이 나온다.
		//-시드번호를 전달하지 않으면 무작위로 시드가 선택된다.
		
		//#새로운 랜덤 시드 생성
		
		//Random ran=new Random();
		
		
		
		
		Random ran=new Random();
		
		ran.nextInt();
		//#Random.nextInt(bound)   1~10
		//-0~bound미만의 정수를 반환한다
		//-bound를 전달하지 않으면 int범위 전체에서 랜덤 정수가 선택된다.
		//
	
		System.out.println("ran:"+ran.nextInt(30));//0~29
		System.out.println(ran.nextInt());//int 전체범위
		System.out.println(ran.nextInt(21)+80);//80~100 
		
		
		
		
		
		
		//연습: 3000이상 5000이하의 랜덤 정수를 100번 생성하고 그동안 나왔던 가장 큰 수와 가장 작은 수를 출력해보세요
		
		
		
//		
//		int max=0,min=0;
//		
//		
//		
//		for(int i=0;i<100;++i) {
//			System.out.println((int)(Math.random()*2001+3000));
//			int a=(int)(Math.random()*2001+3000);
//			//처음에는 비교 대상이 없으므로 그냥저장
//			if(i==0) {
//				max=a;
//				min=a;
//			} else {
//				
//				//현재 저장된 값보다 더 크면 max값을 갱신
//				//max=max<a?a:max;
//		        //min=min>a?a:min;
//			max=Math.max(max, a);
//			min=Math.min(min, a);
//			}
//		
//		}
//		System.out.println("최대값:"+max);
//		System.out.println("최소값:"+min);
//		
//		
		
		
		
		
		
		
		
	}
	
}
