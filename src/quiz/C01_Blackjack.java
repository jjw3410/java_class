package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class C01_Blackjack {
	
	
	
	//다른 함수에서도 변수를 사용할 수 있도록 함수 밖에 변수를 선언할 수 있다
	public static int[] deck;
	public static int[] player;
	public static int[] dealer;
	
	public static int[] game_index;//{0,0,0}
//	public static int DEALER=0;
//	public static int PLAYER=1;
//	public static int DECK=2;
	
	
	
	public static int[] shuffle() {
		int[] deck=new int[52];
		
		for(int i=0;i<deck.length;++i) {
			deck[i]=i;
		}
		for(int i=0;i<200;++i) {     //덱 섞기
			int ran=(int)(Math.random()*51+1);
			
			int temp=deck[0];
			deck[0]=deck[ran];
			deck[ran]=temp;
		}
		
		
		
		
		return deck;
	}
	
	
	public static void draw(int drawer){
		switch(drawer) {
		case 0:
			dealer[game_index[0]++]=deck[game_index[2]++];
			break;
		case 1:
			player[game_index[1]++]=deck[game_index[2]++];
			break;
		}

	}
	
	
	
	public static void prettyCard(int card) {
		
		int shape= card / 13;
		int value= card % 13;
		
	}
	
	
	
	public static void print_game(int mode) {
		
		System.out.print("딜러의카드\n");
		for(int i=0;i<game_index[0];++i) {
			if(i==0) {
				System.out.println("X");
			}else {
				System.out.print(dealer[i]);
			}
		}
		System.out.println();
		
		System.out.print("플레이어의 카드\n");
		for(int i=0;i<game_index[1];++i) {
			System.out.println(player[i]);
			}
		}
		
		
		
	

	
	
	
	
	
	
	public static int game_start() {
		
		//1.무작위 순서의 덱을 하나 생성한다.
		deck=shuffle();
		
		player=new int[20];
		dealer=new int[20];
		
		//진행에 필요한 변수들을 초기화한다
		player=new int [20];
		dealer=new int [20];
		game_index=new int [3];
		
	
		
		//2.만들어진 덱으로 게임을 진행한다.
		
		
		//(1)카드 뽑기(딜러 2번 플레이어 2번)
		
		draw(0);
		draw(0);
		draw(1);
		draw(1);
		
		System.out.println("딜러:"+Arrays.toString(dealer));
		System.out.println("플레이어:"+Arrays.toString(player));
		
		
		Scanner console=new Scanner(System.in);
		//#플레이어의 선택 
		while(true) {
			//#게임 정보 출력
			print_game(0);
			
			System.out.print("1.hit\t2.stand\n>>");
			int select= console.nextInt();
			
			break;
		}
		

		
		
		return 0;
	}
	
	
	
	
	public static void main(String[] args) {
		
		int player_money=9500;
		
		int betting=500;
		
		int game_result=game_start();
		
		StringBuilder msg=new StringBuilder("게임 결과: ");
		
	
		
		switch(game_result) {
		
		case 1:
			player_money+=betting*2;
			msg.append("승리\n");
			break;
		case 2:
			player_money+=(int)(betting*2.5);
			msg.append("21로승리\n");
			break;
		case 0:
			player_money+=betting;
			msg.append("무승부\n");
			break;
		default :
			msg.append("패배");
			break;
				
			
			
		}
		msg.append("현재잔액:"+player_money+"원\n");
		
		System.out.println(msg);
		
		
		
	}
}
