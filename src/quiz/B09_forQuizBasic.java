package quiz;
import java.util.Scanner;
public class B09_forQuizBasic {

	//����ڰ� ���ڸ� �Է� ������
	//1.10���� �Է��� ���ڱ����� �� ���� ���Ͻÿ�.
	//2. 1���� �Է��� ���� ������ 3�� ����� ��� ����ϰ� �� ������� ����غ�����.
	
	public static void main(String[]args) {
		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("���ڸ� �Է��ϼ���>");
//		int user=sc.nextInt();
//		
//		int start=10;
//		int end =user;
//				
//		if (start>end) {
//			int temp=start;// start �� ���� ���� �����´�.
//			start=end;
//			end=temp;// �����Ҵ� start�� ���� end�ǰ��� �ִ´�.
//		}
//		
//		int sum=0;
//		for (int i=start;i<=end;++i) {
//			System.out.println(i);
//			sum+=i;
//		}System.out.println(sum);
//		
//		
//		int start2=1;
//		int end2=user;
//		
//		if(start2>end2) {
//			int temp=start2;
//			start2=end2;
//			end2=temp;
//		}
//		int count=0;
//		System.out.print("[");
//		for(int i=start2; i<=end2;++i) {
//			if(i%3==0) {
//				System.out.print(i+" ");
//				count+=1;
//			}
//			
//		}
//		System.out.print("\b]\n");
//		System.out.printf("3�� ��� ����:%d\n",count);
		
		
		
	

		//����ڰ� ���ڸ� �Է� ������
		//1.10���� �Է��� ���ڱ����� �� ���� ���Ͻÿ�.
		//2. 1���� �Է��� ���� ������ 3�� ����� ��� ����ϰ� �� ������� ����غ�����.
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���>");
		int num=sc.nextInt();
		
		int start=10;
		int end=num;
		int sum=0;
		
		if(start>end) {
			
			int temp=start;
			start=end;
			end=temp;
		}
		
		for(int i=start;i<=num;++i) {	
			System.out.println(i);
			sum+=i;
		} 
		System.out.printf("10���� %d����������:%d",num,sum);
		
		System.out.println();
		
		int start2=1;
		int count=0;
		
		for (int i=start2;i<end;++i) {
			
			if(num%3==0) {
				
				count+=1;
				System.out.println(i);	
			}
			
		}
		System.out.println("3�� ��� �Ѱ���:"+count);
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
