package quiz;

public class B11_whileQuiz {
	//while문을 이용하여
	//1.1부터 100까지의 3의 배수의 총합을 구해보세요.
	//2.200부터 1까지 출력해보세요
	//3.1부터 200까지의 숫자중 2의 배수도 아니고 3의배수도 아닌 숫자들의 총합을 구해보세요.
	
	public static void main(String[] args) {
		
		int i=0;
		int sum=0;
		while(i<100) { 
			i++;
			if(i%3==0) {
				sum+=i;
			}
			
		}
		System.out.printf("3의배수 총합:%d\n" ,sum);
		
		
		int j=200;
		while(j>0) {
			System.out.println(j--);
		}
		
		int k=0;
		int sum2=0;
		while(k<200) {
			k++;
			if(k%2!=0 && k%3!=0) {
				
				sum2+=k;
				
			}
		}
		System.out.printf("2의배수 3의 배수 아닌 총합:%d",sum2);
		
	}
}
