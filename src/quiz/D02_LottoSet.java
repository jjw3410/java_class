package quiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class D02_LottoSet {

	//1���� 45�� ���ڷ� �̷���� 6���� �̷���� HashSet�� �����غ�����
	
	public static void main(String[] args) {
		
		
		
		Set<Integer>lotto =new HashSet<>();
		for(int i=0;i<6;++i) {
			Random ran=new Random();
			int num=ran.nextInt(45)+1;
			lotto.add(num);
		}
//		
//		for(int j=0;j<6;++j) {
//			
//			if(lotto.size()<6) {
//			Random ran=new Random();
//			int num=ran.nextInt(45)+1;
//			lotto.add(num);
//			}
//		}
//		
//		System.out.println(lotto);
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
	}
}


//public static Set<Integer> generate(){
//	Random ran=new Random();
//	
//	Set<Integer> lotto=new HashSet<>();
//	
//	
//	while(lotto.size()<6) {
//		lotto.add(ran.nextInt(45)+1);
//	}
//	return lotto;
//}

