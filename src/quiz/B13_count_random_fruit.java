package quiz;

import java.util.Arrays;
import java.util.Random;

public class B13_count_random_fruit {

	public static void main(String[] args) {
		//1.크기 100의 배열에 랜덤 과일 문자열을 저장하기
		//등장과일: apple,banana,orange,peach,kiwi
		//2.각 과일이 몇 번 등장했는지 모두 기록하고 출력하기
		
		
		
		
	
		String[] fruit= {"apple","banana","orange","kiwi"};
		
		String [] random_fruit=new String[100];
		
		
		Random ran=new Random();
		
		
		
		for(int i=0;i<100;++i) {
			
			int random=ran.nextInt(fruit.length);
			
			String temp=fruit[0];
			fruit[0]=fruit[random];
			fruit[random]=temp;
			
			random_fruit[i]=fruit[0];
			
		}
		System.out.println(Arrays.toString(random_fruit));
		
		System.out.println();
		
		int [] count=new int[4];
		for (int i=0;i<100;i++){
			for (int j=0;j<4;j++){
				if (random_fruit[i]==fruit[j]) {
					count[j]++;
				}
			}
		}
		
		for (int i=0;i<fruit.length;i++) {
			if(count[1]>0) {
				System.out.println(fruit[i]+" "+count[i]+"개");
			}
		}	
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
