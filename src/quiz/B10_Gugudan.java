package quiz;

public class B10_Gugudan {
	public static void main(String[] args) {
		//1.�������� ���η� ���
		//2.�������� ���η� ���
		
		
//		for(int dan=2;dan<=9;++dan) {
//			System.out.printf("%d�� : ",dan);
//			for (int gop=1;gop<=9;++gop) {
//				System.out.printf(" %dx%d=%d",dan,gop,dan*gop);
//			}System.out.println();
//		}
//		System.out.println();
//		
//		
//		for (int gop=0;gop<=9;++gop) {
//			//���ǽ���
//			System.out.println();
//			for (int dan=2;dan<=9;++dan) {
//				if(gop==0) {
//					System.out.printf("%d��\t",dan);
//				}else {
//					System.out.printf("%dx%d:%d\t",dan,gop,dan*gop);
//				}
//					
//				
//			}
//		
//		}
		
				//1.�������� ���η� ���
				//2.�������� ���η� ���
		
		
		for(int dan=2;dan<10;dan++) {
			
			System.out.printf("%d��:",dan);
			
			for(int gop=1;gop<=9;++gop) {
				System.out.printf(" %dx%d=%d",dan,gop,dan*gop);
			}
			System.out.println();// ���ڸ� 9���� ���ϰ� ���� ������ �Ѿ�� ���� ����ش�.
		}
		
		System.out.println();
		
		for (int gop=0;gop<=9;gop++) {
			System.out.println();
			for (int dan=2;dan<=9;++dan) {
				if(gop==0) {
					System.out.printf("%d��\t",dan);
				}else {
					System.out.printf("%dx%d=%d\t",dan,gop,dan*gop);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
