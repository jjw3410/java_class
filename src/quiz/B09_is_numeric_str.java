package quiz;
import java.util.Scanner;
public class B09_is_numeric_str {
	
	//�Է¹��� ���ڿ��� ���ڸ� ���ԵǾ� ������ ����� 1�� ���� �ٸ����ڰ� ���ԵǾ� �ִٸ� 0�� ����
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ���>");
		String str= sc.nextLine();
		
		
		
		int j=str.length();
		
		int result=1;
		
		
		
		if (j==0){
			result=2;
		}
		
		for(int i=0;i<=j-1;++i) {
			char a= str.charAt(i);
			
			if  (!(a>='0'&&a<='9')) {
				result=0;
				
				break;
			}
		
	     }
		System.out.println(result);
		
		
		
	     
		
		
		//�Է¹��� ���ڿ��� ���ڸ� ���ԵǾ� ������ ����� 1�� ���� �ٸ����ڰ� ���ԵǾ� �ִٸ� 0�� ����
		//���ڿ� ������ ����� 2�� ����
	     
	     
		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("���ڿ��� �Է��ϼ���>");
//		String str=sc.nextLine();
//		
//		int len=str.length();//len �Է¹��� ���ڿ��� ����
//		
//		int result=1;  
//		
//		
//			if(len==0) {
//				result=2;
//			}
//		
//		
//		
//		for (int i=0;i<len;++i) {
//			
//			char a=str.charAt(i);
//			
//			 
//			
//			
//			 if(a>='0'&&a<='9') {
//				
//			}else {
//				result=0;
//			}
//			
//			
//		}
//		System.out.println(result);
//		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	     
	}
	
		
		
		
		
		
}


