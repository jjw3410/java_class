import java.util.Random;

public class B12_random {

	public static void main(String[] args) {
	//#JAVA���� ������ ���� �����ϱ�
		
		
		//1.Math.random()
		//-doubleŸ���� 0<=x<1�� ���� �Ҽ��� �����Ѵ�
		//-�� �Ҽ��� �̿��Ͽ� ���ϴ� ���ڸ� ���� ����� �� �ִ�
		
		//# ���ϴ� ���ڸ� ����� ����
		//-(1)���ϴ� ������ ������ ���Ѵ�.(ex80~100)
			//0<=x<21
		//-(2)���ϴ� ���� �� ���� ���� ���ڸ� ���Ѵ�.
			//0+80<=x<21+80
		//-(3)�Ҽ��� �Ʒ��� �����Ѵ�.
		for(int i=0;i<100;++i) {
		System.out.println((int)(Math.random()*21+80));
		}
		
		
		
		//2.randomŬ������ �̿�
		//-������ �� ���ϴ� �õ��ȣ�� ������ �� �ִ�
		//-���� �õ� ��ȣ�� �����ϸ� �������� ���´�.
		//-�õ��ȣ�� �������� ������ �������� �õ尡 ���õȴ�.
		
		//#���ο� ���� �õ� ����
		
		//Random ran=new Random();
		
		
		
		
		Random ran=new Random();
		
		ran.nextInt();
		//#Random.nextInt(bound)   1~10
		//-0~bound�̸��� ������ ��ȯ�Ѵ�
		//-bound�� �������� ������ int���� ��ü���� ���� ������ ���õȴ�.
		//
	
		System.out.println("ran:"+ran.nextInt(30));//0~29
		System.out.println(ran.nextInt());//int ��ü����
		System.out.println(ran.nextInt(21)+80);//80~100 
		
		
		
		
		
		
		//����: 3000�̻� 5000������ ���� ������ 100�� �����ϰ� �׵��� ���Դ� ���� ū ���� ���� ���� ���� ����غ�����
		
		
		
//		
//		int max=0,min=0;
//		
//		
//		
//		for(int i=0;i<100;++i) {
//			System.out.println((int)(Math.random()*2001+3000));
//			int a=(int)(Math.random()*2001+3000);
//			//ó������ �� ����� �����Ƿ� �׳�����
//			if(i==0) {
//				max=a;
//				min=a;
//			} else {
//				
//				//���� ����� ������ �� ũ�� max���� ����
//				//max=max<a?a:max;
//		        //min=min>a?a:min;
//			max=Math.max(max, a);
//			min=Math.min(min, a);
//			}
//		
//		}
//		System.out.println("�ִ밪:"+max);
//		System.out.println("�ּҰ�:"+min);
//		
//		
		
		
		
		
		
		
		
	}
	
}
