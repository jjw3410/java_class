package quiz;

import java.util.Arrays;
import java.util.Random;

public class B13_count_random_fruit {

	public static void main(String[] args) {
		//1.ũ�� 100�� �迭�� ���� ���� ���ڿ��� �����ϱ�
		//�������: apple,banana,orange,peach,kiwi
		//2.�� ������ �� �� �����ߴ��� ��� ����ϰ� ����ϱ�
		
		
		
		
	
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
				System.out.println(fruit[i]+" "+count[i]+"��");
			}
		}	
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
