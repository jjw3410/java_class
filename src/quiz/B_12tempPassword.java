package quiz;

import java.util.Random;

public class B_12tempPassword {
	//���� 4�ڸ��� �ӽ� ��й�ȣ ���ڿ��� �����ϴ� ���α׷��� ��������
	//(��й�ȣ�� �����ϴ� ����- ���ĺ� �빮��,����,Ư������)

	
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		//ran.nextInt();
		
		StringBuilder temp_password=new StringBuilder();
		
		//String str="ABCDEFGHIJKLNOPQRSTUVWXYZ0123456789";
		
		
		for (int i=0;i<4;++i) {
			char ch;
			
			//int category=ran.nextInt();
			//true�϶� ��� �߰�,�ƴϸ� ���� �߰�
			if(ran.nextBoolean()) {
				ch=(char)(ran.nextInt(26)+'A');
			}else{
				ch=(char)(ran.nextInt(10)+'0');
				
			}
			temp_password.append(ch);
			
			
			
			
			
		}
		System.out.println(temp_password);
		
	
	}
}




