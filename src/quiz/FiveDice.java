package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;



	//�������� 5���� �ֻ����� ����������(�ֻ����� ���� 1~6)
	
	//Ǯ�Ͽ콺(���� ���ڰ� 2��/3��)
	//���� ��Ʈ����Ʈ(1234/2345/3456)
	//���� ��Ʈ����Ʈ(12345/23456)
	//4���̽�(���� ���� 4��)
	//5���̽� (���� ���� 5��)
	// �� �����ϴ� Ŭ������ �ۼ��ϰ� �׽�Ʈ �غ�����
	public class FiveDice{
		private Random ran;
		private List<Integer> dices;//5���� �ֻ��� ���� ����� ������
		private List<Integer> counts;//�� ���ڰ� ����� �����ߴ��� ���� �� ����Ʈ
		
		private String made;
	
		private  static int NUM_OF_FACET=5;
		private static int DICE_FACET=6;
		
		private final static Set<Set<Integer>> LARGE_CASE;
		private final static Set<Set<Integer>> SMALL_CASE;
	
		
		static {
			
			LARGE_CASE=new HashSet<>(2);
			
			for (int i=1;i<=2;++i) {
				
				Set<Integer>small=new HashSet<>(5);
				
				Collections.addAll(small,i,i+1,i+2,i+3,i+4);
				LARGE_CASE.add(small);
			}
			
			
			
			SMALL_CASE=new HashSet<>();
			
			for (int i=1;i<=3;++i) {
				
				Set<Integer>small=new HashSet<>(4);
				
				Collections.addAll(small,i,i+1,i+2,i+3);
				SMALL_CASE.add(small);
			}
			
		}
		
		
		
		public FiveDice(){
			ran=new Random();
			made="UNCHECKED";
			
			//�ֻ����� 5�� �̻����� �þ�� �ʱ� ������ �÷��� �뷮�� 5�� �����Ѵ�
			//�� ArrayList�� �ʱ� �뷮�� �������ԵǸ� �뷮�� 1.5�辿 ������Ų��
			dices= new ArrayList<>(NUM_OF_FACET);
			counts= new ArrayList<>(DICE_FACET);
			Collections.addAll(dices,0,0,0,0,0);
			Collections.addAll(counts,0,0,0,0,0);
			
		}
		
		private void count() {
			for(int i=0;i<DICE_FACET;++i) {
				int dice_num=i+1;
				
				counts.set(i, Collections.frequency(dices, dice_num));
			}
		}
		
		private String check() {
			//
			if(counts.contains(5)) {
				return "FIVE DICES";
			}else if(counts.contains(4)) {
				return "FOUR DICES";
			}else if (counts.contains(2)) {
				return "Full House";
			}
			
			//check by dices
			for (Set<Integer>ls: LARGE_CASE) {
				
				if(dices.containsAll(ls)) {
					return "LARGE STRAIGHT!!!";		
				}
				
			}
			
			
			
			for(Set<Integer>ss:SMALL_CASE) {
				if(dices.containsAll(ss)) {
					return "SMALL STRAIGHT!!!";
				}
			}
			
			return "NO MATCHES";
			
		}
		
		public void print() {
			System.out.print(dices+":");
			
			if(made.equals("UNCHECKED")) {
				made=check();
			}
			
			System.out.println(made);
		}
		
		
		
		public void reroll(Set<Integer>rerolls) {
			
			if(rerolls.size()==0) {
				System.out.println("NOTHING CHANGES");
				return;
			}
			
			made="UNCHECKED";
			
			
			for(int i:rerolls) {
				int to_change=ran.nextInt(DICE_FACET)+1;
				dices.set(i -1,ran.nextInt(DICE_FACET)+1);
				System.out.printf("DICE%d HASCHAGED:%d\n",i,to_change);
			}
	
			count();
			print();
			
		}
		
		
		
		public void roll() {
			made="UNCHECKED";
			
			Random ran=new Random();
			for(int i=0;i<NUM_OF_FACET;++i) {
			dices.set(i, ran.nextInt(DICE_FACET)+1);
			}
		}
		
		
		
		
	
	
	public static void main(String[] args) {
		
		 FiveDice dice01=new FiveDice();
		
		for(int i=0;i<100;++i) {
		dice01.roll();
		}
	}

}
			
		






	
	
	

