
public class B09_for {

	public static void main(String[]args) {
		
		//#�ݺ���
		//-for,while,do-while,for each
		//-�Ȱ��� �ڵ带 ������ �ݺ��ϰ� ���� �� ����Ѵ�.
		
		
		//#for (�ʱⰪ;����;������){
		// 		��� ������ true ���� �ݺ��� ��ɾ���� ���� ��
		// }
		
		
		
		//1. ���� �⺻���� ����
		//- �ʱⰪ�� 0�� �ְ� ���ǿ��� �ݺ��ϰ� ���� Ƚ���� ���´�. ������ 1�� �Ѵ�.
//		for(int i =0;i<5000;++i) {
//		System.out.println("Hello, world!"+i);
//		}
		
		//2.�ʱⰪ�� �������� ��ġ�� ������� ������ �� �ִ�.
//		for(int i=0;i<33;i+=2) {
//			System.out.println("Hello"+i);
//		}
//		for (int i=9000;i>0;i-=100) {
//			System.out.println("Minus"+i);
//		}
		
		//3.�ʱⰪ�� �������� ��ġ�� ������� ������ �� �ִ�.
//		int num=0;
//		for(;num<100;) {
//			System.out.println("�������"+num);
//			++num;
//		}
		
		//4.���ο� �ٸ� ������ �����Ӱ� ����� �� �ִ�
//		for (int month=1;month<=12;++month) {
//			switch (month) {
//			case 1: case 2: case 3:
//				System.out.printf("%d���� �ܿ��Դϴ�.\n",month);
//				break;
//				default:
//				System.out.printf("%d���� ���� �������� �ʾҽ��ϴ�\n",month);
//				break;
//			}
//		}
		
		//5. ������ ��������� ���ѹݺ��Ѵ� (���ǿ� true�� �־ ���� �ݺ��Ѵ�)
		//��break�� �̿��� �ݺ����� Ż���� �� �ִ�.
//		num=0;
//		for(;;) {
//			System.out.println(num+=9999);
//			if(num>200000)
//			break;
//		}
		
		//6.continue�� �̿��ϸ� �ݺ����� ��ŵ�� �� �ִ�
//		for(int i=0;i<100;++i) {
//			System.out.printf("%-3d",i);
//			if(i%10!=9) {
//				continue;
//			}
//			System.out.println();
//		}
//		
//		System.out.println("===========================");
//		
//		for (int i=0;i<10;++i) {
//			if(i%2==0)
//				continue;//�ݺ� ������ ���ǹ��� �ش��ϸ� ��� �ݺ� �ش��� �ȵǸ� ���
//			
//			System.out.print(i+" ");
//		}
//		System.out.println();
		
		//7.�ݺ������� ���� ���ϱ�
		//(1)������ ������ ������ �����ϰ� 0 ���� �ʱ�ȭ�Ѵ�
		//(2)�ݺ����� ���� �ش� ������ ���� ������Ų��
//		int sum=0;
//		for (int i=80;i<=333;++i) {
//			if(i%3==0) {
//				sum+=i;
//			}
//			System.out.println(sum);
//		}
		
		
		for(int i=1; i<21 ;i++) {  //for�������� continue��������, ���������� ���ϴ�.
            
            if(i % 2 == 1) {
                continue;
            }           
             System.out.print(i+" ");           
        }
        System.out.println();
        
        
        
        
        for (int j=1;j<21;j++) {
        	
        	if(j%2==0) {
        		System.out.print(" "+j);
        	}
        
        }
//        System.out.println("===================");
//        
//        int i=0;
//        
//        
//        while(i<21) {  
//        	i++;
//        	  if(i%2 == 0) {
//
//        		  continue;
//        	  }           
//        	    System.out.print(i+" ");
//         }
        	    
		
		
		/*
		 �帧 ��� 
		 
		 1.break��
		 ����� ��� ����� ���� ���ȴ�.
		 ������� break���� ������ �ڵ带 ������ �����ϰų� ����� ������� Ż��
		 
		 2.continue��
		 continue���� ���������� �������� �ʰ� �ٽ� ����� ó������ ���ư���
		 ������ True�� ��� �ڵ带 ����
		 for������ ��쿡�� �ٽ� ������ �����ϰ� while�� ���� ��� ������ ���ǹ����� ����ȴ�.
		 continue�� ������ ������ ������ �ǳʶٰ� ����� ����̴�.
		 
		 3.return��
		 return���� ���� ��ȯ�ϸ� �޼��忡���� ������� ������������ �ִ�.
		 
		 */
        
        //break ����
//        int j=0;
//        while(j<=10) {
//        	System.out.println(j+"������! ");
//        	j++;
//        	if(j==4) {//���� j�� 4������ ����
//        		break;//���ǹ��� ��ġ�ϸ� �ݺ����� �����.
        		
        		
        		
        //continue ����
  	
		
	}
}
