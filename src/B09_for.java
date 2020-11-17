
public class B09_for {

	public static void main(String[]args) {
		
		//#반복문
		//-for,while,do-while,for each
		//-똑같은 코드를 여러번 반복하고 싶을 때 사용한다.
		
		
		//#for (초기값;조건;증감값){
		// 		가운데 조건이 true 동안 반복할 명령어들을 적는 곳
		// }
		
		
		
		//1. 가장 기본적인 형태
		//- 초기값을 0을 주고 조건에는 반복하고 싶은 횟수를 적는다. 증가는 1씩 한다.
//		for(int i =0;i<5000;++i) {
//		System.out.println("Hello, world!"+i);
//		}
		
		//2.초기값과 증감값의 수치는 마음대로 변경할 수 있다.
//		for(int i=0;i<33;i+=2) {
//			System.out.println("Hello"+i);
//		}
//		for (int i=9000;i>0;i-=100) {
//			System.out.println("Minus"+i);
//		}
		
		//3.초기값과 증감값의 위치를 마음대로 변경할 수 있다.
//		int num=0;
//		for(;num<100;) {
//			System.out.println("마음대로"+num);
//			++num;
//		}
		
		//4.내부에 다른 문법도 자유롭게 사용할 수 있다
//		for (int month=1;month<=12;++month) {
//			switch (month) {
//			case 1: case 2: case 3:
//				System.out.printf("%d월은 겨울입니다.\n",month);
//				break;
//				default:
//				System.out.printf("%d월은 아직 설정되지 않았습니다\n",month);
//				break;
//			}
//		}
		
		//5. 조건을 비워놓으면 무한반복한다 (조건에 true를 넣어도 무한 반복한다)
		//※break를 이용해 반복문을 탈출할 수 있다.
//		num=0;
//		for(;;) {
//			System.out.println(num+=9999);
//			if(num>200000)
//			break;
//		}
		
		//6.continue를 이용하면 반복문을 스킵할 수 있다
//		for(int i=0;i<100;++i) {
//			System.out.printf("%-3d",i);
//			if(i%10!=9) {
//				continue;
//			}
//			System.out.println();
//		}
//		
//		System.out.println("===========================");
//		
//		for (int i=0;i<10;++i) {
//			if(i%2==0)
//				continue;//반복 구문이 조건문에 해당하면 계속 반복 해당이 안되면 출력
//			
//			System.out.print(i+" ");
//		}
//		System.out.println();
		
		//7.반복문으로 총합 구하기
		//(1)총합을 저장할 변수를 선언하고 0 으로 초기화한다
		//(2)반복문을 통해 해당 변수에 값을 누적시킨다
//		int sum=0;
//		for (int i=80;i<=333;++i) {
//			if(i%3==0) {
//				sum+=i;
//			}
//			System.out.println(sum);
//		}
		
		
		for(int i=1; i<21 ;i++) {  //for문에서는 continue를만나면, 증감식으로 갑니다.
            
            if(i % 2 == 1) {
                continue;
            }           
             System.out.print(i+" ");           
        }
        System.out.println();
        
        
        
        
        for (int j=1;j<21;j++) {
        	
        	if(j%2==0) {
        		System.out.print(" "+j);
        	}
        
        }
//        System.out.println("===================");
//        
//        int i=0;
//        
//        
//        while(i<21) {  
//        	i++;
//        	  if(i%2 == 0) {
//
//        		  continue;
//        	  }           
//        	    System.out.print(i+" ");
//         }
        	    
		
		
		/*
		 흐름 제어문 
		 
		 1.break문
		 제어문의 제어를 벗어나기 위해 사용된다.
		 제어문에서 break문을 만나면 코드를 강제로 종료하거나 가까운 제어문으로 탈출
		 
		 2.continue문
		 continue문은 다음문장을 수행하지 않고 다시 제어문의 처음으로 돌아간다
		 조건이 True인 경우 코드를 수행
		 for문같은 경우에는 다시 조건을 실행하고 while문 같은 경우 마지막 조건문에서 종료된다.
		 continue문 다음에 나오는 문장을 건너뛰게 만드는 제어문이다.
		 
		 3.return문
		 return문은 값을 반환하며 메서드에서는 결과값을 돌려받을수도 있다.
		 
		 */
        
        //break 예제
//        int j=0;
//        while(j<=10) {
//        	System.out.println(j+"파이팅! ");
//        	j++;
//        	if(j==4) {//조건 j는 4까지만 실행
//        		break;//조건문에 일치하면 반복문이 멈춘다.
        		
        		
        		
        //continue 예제
  	
		
	}
}
