package practice_Class;

public class Car {

	int speed;
	
	
	
	int getSpeed() {
		
		return speed;
	}
	
	void keyTurnOn() {
		
		System.out.println("Ű�� �����ϴ�");
		
	}
	
	void run() {
		
		for(int i=0;i<=50;i+=10) {
			
			speed=i;
			System.out.println("�޸��ϴ�(�ü�:"+speed+"km/h)");
			
		}
		
		
	}
	
	
	
	
}