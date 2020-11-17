package quiz;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Dice {

	public static void main(String[] args) throws InterruptedException {
		FiveDice dice= new FiveDice();
		
		Scanner sc=new Scanner(System.in);
		
		while (true) {
			System.out.println("바꾸기 테스트>");
			Set<Integer> rerolls=new HashSet<>();
			
			int i=-1;
			
			while((i= sc.nextInt())!=-1) {
				rerolls.add(i);
			}
			
			System.out.println("다시 굴려야하는 인덱스:"+rerolls);
			dice.reroll(rerolls);
			
			
			Thread.sleep(2000);
		}
	}
	
}
