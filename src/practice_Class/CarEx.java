package practice_Class;

public class CarEx {

	public static void main(String[] args) {
		
		Car myCar=new Car();
		
		
		myCar.keyTurnOn();
		
		myCar.run();
		
		int speed=myCar.getSpeed();		
		
		
		System.out.println("����ӵ�(�ü�:"+speed+"km/h)");
	}
	
	
}
