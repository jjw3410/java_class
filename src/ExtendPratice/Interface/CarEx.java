package ExtendPratice.Interface;

public class CarEx {

	
	public static void main(String[] args) {
		
		Car car=new Car();
		
		car.run();
		
		car.tires[0]=new KumhoTire();
		car.tires[1]=new KumhoTire();
		
		car.run();
		
		int array[]= {10,20,30,40,50};
		
		
		for(int number:array) {
			System.out.println(number);
		}
		
		/*
		 for each�� ����
		 
		 for(����Ÿ�� �����̸�:�迭�̸�){
		 	����κ�;
		 }
		 -�迭�� �׸�� ��ŭ ����κ� �ݺ�
		 �迭�� �׸��� ������� ������ ������ ����
		 �ؿ��� �迭�� ���� ������ ����Ҽ� �ְ� �����Ҽ� ����.
		 
		 */
		
		
		
		
		
	}
}
