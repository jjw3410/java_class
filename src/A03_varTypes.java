
public class A03_varTypes {

	
	public static void main(String[]args) {
		//#������ ����
		//-Ÿ�� ������:
		
		
		/*
		 #����Ÿ��(''���� Ÿ�� ���� ���� ����� �޴´�)
		 @Ÿ�Ը��� �����͸� ������ �� �ִ� ũ�Ⱑ �ٸ���.
		 -byte (1byte)  // 		0~256���� ũ�⸦ ��Ÿ�������� (���� -128~ +127)
		 -char (2byte)  //		0~65535 (����� ǥ��,���ڿ� ����ȭ)
		 -short (2byte)	//		-32768~+32767
		 -int (4byte)	// 		-22�� ~+22�� (2^32��)
		 -long(8byte)	//		��ûū ����
		 
		 */
		byte _byte=127;//ǥ���� �� �ִ� ���ڰ� ���� ��� ������ ������ �� �ִ�.
		char _char=0;
		short _short=-32768;
		int _int=10;
		long _long=90000000000000L; // int�� ������ ����� ���ڸ� ������ �ڿ� L�� �ٿ��� �Ѵ�.
		
		/*
		 # �Ǽ�Ÿ�� ( ���� �׷��� ��꿡�� ���ȴ�)
		 �غε��Ҽ��� ����� ����Ѵ�
		 
		 -float		(4byte)
		 -double	(8byte)
		 */
		
		float _float = 123.123f;//float ���� ������ �ڿ� f�� ���δ�
		double _double=123.123;
		
	
		//#���ͷ� (literal)
		//-�׳� ���� ��
		//-"",'',�Ҽ�,�Ҽ�f,����,����L....
		//-0����(8),0x����(16),0b����(2)
		//-true , false
		System.out.println("111(10): "+111);
		System.out.println("111(8): "+0111);
		
		//2����: 0 1 10 11 100 101 110 111 1000 ..
		//8���� : 0 1 2 3 4 5 6 7 10..16 17 20...27 30 ...
		//16���� : 0 1 2 3 4 5 6 7 8 9 A B C D E F 10
		
		
		System.out.println("111(16): "+0x111);
		System.out.println("111(2):"+0b111);
		
		/*
		 	#��/���� Ÿ��
		 	-boolean= true, false �ΰ����� ���� ������ �� �ִ� ���� Ÿ��
		 */
		
		boolean _boolean=false;
		boolean goonpil=false;
		boolean passExam=true;
		boolean complete=true;
		
		/*
		 	#������ Ÿ��(Ŭ���� Ÿ��)
		 		-String : ���ڿ�
		 		-�� �� ��� Ŭ������..
		 		�� �빮�ڷ� �����ϴ� ��� Ÿ�Ե��� ������ Ÿ���̴�.
		 
		 */
		String himsg="Hi, nice to meet you!";
		String byemsg="Good Bye";
		
		System.out.println(himsg);
		System.out.println(byemsg);
		
		
		int a=10;
		double b=5.5;
		double result=a+b;
		System.out.println(result);
		
		
		
		
		
	}
}
