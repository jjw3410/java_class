package quiz;
import java.util.Scanner;
public class B09_is_numeric_str {
	
	//입력받은 문자열에 숫자만 포함되어 있으면 결과에 1을 저장 다른문자가 포함되어 있다면 0을 저장
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("문자열을 입력하세요>");
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
		
		
		
	     
		
		
		//입력받은 문자열에 숫자만 포함되어 있으면 결과에 1을 저장 다른문자가 포함되어 있다면 0을 저장
		//문자열 없으면 결과를 2를 저장
	     
	     
		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("문자열을 입력하세요>");
//		String str=sc.nextLine();
//		
//		int len=str.length();//len 입력받은 문자열의 길이
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


