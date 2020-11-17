package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class C01_Blackjack {
	
	
	
	//�ٸ� �Լ������� ������ ����� �� �ֵ��� �Լ� �ۿ� ������ ������ �� �ִ�
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
		for(int i=0;i<200;++i) {     //�� ����
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
		
		System.out.print("������ī��\n");
		for(int i=0;i<game_index[0];++i) {
			if(i==0) {
				System.out.println("X");
			}else {
				System.out.print(dealer[i]);
			}
		}
		System.out.println();
		
		System.out.print("�÷��̾��� ī��\n");
		for(int i=0;i<game_index[1];++i) {
			System.out.println(player[i]);
			}
		}
		
		
		
	

	
	
	
	
	
	
	public static int game_start() {
		
		//1.������ ������ ���� �ϳ� �����Ѵ�.
		deck=shuffle();
		
		player=new int[20];
		dealer=new int[20];
		
		//���࿡ �ʿ��� �������� �ʱ�ȭ�Ѵ�
		player=new int [20];
		dealer=new int [20];
		game_index=new int [3];
		
	
		
		//2.������� ������ ������ �����Ѵ�.
		
		
		//(1)ī�� �̱�(���� 2�� �÷��̾� 2��)
		
		draw(0);
		draw(0);
		draw(1);
		draw(1);
		
		System.out.println("����:"+Arrays.toString(dealer));
		System.out.println("�÷��̾�:"+Arrays.toString(player));
		
		
		Scanner console=new Scanner(System.in);
		//#�÷��̾��� ���� 
		while(true) {
			//#���� ���� ���
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
		
		StringBuilder msg=new StringBuilder("���� ���: ");
		
	
		
		switch(game_result) {
		
		case 1:
			player_money+=betting*2;
			msg.append("�¸�\n");
			break;
		case 2:
			player_money+=(int)(betting*2.5);
			msg.append("21�ν¸�\n");
			break;
		case 0:
			player_money+=betting;
			msg.append("���º�\n");
			break;
		default :
			msg.append("�й�");
			break;
				
			
			
		}
		msg.append("�����ܾ�:"+player_money+"��\n");
		
		System.out.println(msg);
		
		
		
	}
}
