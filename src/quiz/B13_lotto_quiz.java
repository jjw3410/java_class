package quiz;

import java.util.Arrays;
import java.util.Random;

public class B13_lotto_quiz {

	public static void main(String[] args) {
		
		//1~45사이의 중복없는 랜덤 숫자 6개로 이루어진 배열을 생성해보세요.
		
		Random ran=new Random();
		
		int lotto[]=new int[6];
	
		
		for (int i=0;i<6;++i) {							//1~45
			lotto[i]=(int)(ran.nextInt(45)+1);
			for (int j=0;j<i;++j) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}	
		}
		System.out.println("로또");
		for(int i=0;i<6;++i) {
			System.out.print(lotto[i]+" ");
		}
	}
}
