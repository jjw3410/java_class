package quiz;

import java.util.Arrays;
import java.util.Random;

public class B13_lotto_quiz {

	public static void main(String[] args) {
		
		//1~45������ �ߺ����� ���� ���� 6���� �̷���� �迭�� �����غ�����.
		
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
		System.out.println("�ζ�");
		for(int i=0;i<6;++i) {
			System.out.print(lotto[i]+" ");
		}
	}
}
