package quiz;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class B13_31games {
	
	//#31게임을 만들어보세요.
	//1.컴퓨터와 사람이 번갈아 가면서 숫자를 선택한다(1,2,3)
	//2.컴퓨터는 랜덤으로 숫자를 선택한다.
	//3.마지막에 31을 부르는 사람 혹은 컴퓨터가 패배한다.
	public static void main(String[] args) throws IOException{
	
		Scanner sc= new Scanner(System.in);
		int sum=0;
		String name;
		Random ran=new Random();
		
		
		boolean player=ran.nextBoolean();// 플레이어를 랜덤으로 지정
		
		System.out.printf("<%s>의 선공입니다!\n",player?"사람":"컴퓨터");
		
		while(true) { 
			
			int num=ran.nextInt(3)+1;//숫자는 1~3까지 출력
			
			if(player==false) { //컴퓨터일때 1~3 랜덤출력
				sum+=num;
				System.out.println("컴퓨터>"+num);
			}
			else {// 사람일때
				System.out.print("사람 >");//사람일때는 숫자입력
				int cnt_p=sc.nextInt();
				if(cnt_p>3||cnt_p<0) {//1미만 3초과 일때 다시입력
					System.out.println("잘못입력했습니다.다시 입력하세요");
					continue;//1~3입력했을때 다시 올라가서 입력받고 내려온다.
				}
				sum+=cnt_p;
			}
			if(sum>=31) {//숫자가 31넘었을때 멈춤
				break;
			}
				System.out.println("현재숫자: "+sum);
				player=!(player);
			}
		
		name=player?"사람":"컴퓨터";
		System.out.printf("%s이(가)%d를 불렀습니다.%s의패배",name,sum,name);
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
