package quiz;
import java.util.Scanner;
public class B10_prime {

	//����ڷκ��� ���ڸ� �Է¹����� 1���� �Է��� ���� ���̿� �����ϴ� �Ҽ��� ��� ����Ͻÿ�
	//�Ҽ�- ����� 1�� �ڱ� �ڽ� �ۿ� ���� ����
	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���");
		
		int num=sc.nextInt();
		
		if(num<1) {
			System.out.println("���ڸ� �ٽ��Է��ϼ���.");
		}
		
		//i= �Ҽ����� �׽�Ʈ �غ�����
		for (int i=2;i<=num;++i) {
			boolean measure= false;
		//j= i�� ������� �׽�Ʈ �غ�����
			for(int j=2;j<i;++j) {
				
				if(i%j==0) {
					
					measure=true;
					
					break;
				}
				
			
			}
			if(measure==false) {
				System.out.println(i);
			}
		
        }
		
		
		//����ڷκ��� ���ڸ� �Է¹����� 1���� �Է��� ���� ���̿� �����ϴ� �Ҽ��� ��� ����Ͻÿ�
		
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("���ڸ� �Է��ϼ���>");
//		int num=sc.nextInt();
//		
//		if(num<1) {
//			System.out.print("���ڸ� �ٽ� �Է��ϼ���>");
//		}
//		
//		for(int i=2;i<=num;i++) 	{
//			boolean result=false;
//			
//			for(int j=2;j<i;j++) {
//				if (i%j==0) {
//					result=true;
//					break;	
//				}
//			}
//			if (result=false) {
//				System.out.print(i);
//			}
//				
//			
//		}
	}
		
}	


