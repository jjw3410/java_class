package quiz;

public class B11_whileQuiz {
	//while���� �̿��Ͽ�
	//1.1���� 100������ 3�� ����� ������ ���غ�����.
	//2.200���� 1���� ����غ�����
	//3.1���� 200������ ������ 2�� ����� �ƴϰ� 3�ǹ���� �ƴ� ���ڵ��� ������ ���غ�����.
	
	public static void main(String[] args) {
		
		int i=0;
		int sum=0;
		while(i<100) { 
			i++;
			if(i%3==0) {
				sum+=i;
			}
			
		}
		System.out.printf("3�ǹ�� ����:%d\n" ,sum);
		
		
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
		System.out.printf("2�ǹ�� 3�� ��� �ƴ� ����:%d",sum2);
		
	}
}
