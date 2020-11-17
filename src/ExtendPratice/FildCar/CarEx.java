package ExtendPratice.FildCar;

public class CarEx {

	public static void main(String[] args) {
		Car car=new Car();
		
		for(int i=0;i<10;++i) {
			
			int problemLocation=car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("�տ��� HankookŸ�̾�� ��ü");
				car.frontLeftTire=new HankookTire("�տ���",15);
				break;
			case 2:
				System.out.println("�տ����� kumhoŸ�̾�� ��ü");
				car.frontRightTire=new KumhoTire("�տ�����",13);
				break;
			case 3:
				System.out.println("�� ���� HankookŸ�̾�� ��ü");
				car.backLeftTire=new HankookTire("�� ����",14);
				break;
			case 4:
				System.out.println("�� ������ kumhoŸ�̾�� ��ü");
				car.backRightTire=new KumhoTire("�� ������",17);
				break;
			}
			System.out.println("---------------");
		}
		
		
		
		
		
		
		
		
	}
}
