package ExtendPratice.FildCar;

public class Car {

	Tire frontLeftTire=new Tire("�տ���",6);
	Tire frontRightTire=new Tire("�տ�����",2);
	Tire backLeftTire=new Tire("�ڿ���",3);
	Tire backRightTire=new Tire("�ڿ�����",4);
	
	
	int run() {
		
		System.out.println("�ڵ����� �޸��ϴ�");
		if(frontLeftTire.roll()==false) {
			stop();
			return 1;
		}else if(frontRightTire.roll()==false) {
			stop();
			return 2;
		}else if(backLeftTire.roll()==false) {
			stop();
			return 3;
		}else if(backRightTire.roll()==false) {
			stop();
			return 4;
		}
		return 0;
		
	}
	
	
	void stop() {
		System.out.println("Ÿ�̾ �������ϴ�");
	}
	
	
	
}
