package ExtendPratice.FildCar;

public class KumhoTire extends Tire{

	
	public KumhoTire(String location,int maxRotation) {
		
		super(location,maxRotation);//�θ� ������ ȣ��
		
	}
	
	
	@Override
	
	public boolean roll() {
		++accumlateRotation;
		
		if(accumlateRotation<maxRotation) {
			System.out.println(location+"Tire ����"+
					(maxRotation-accumlateRotation)+"ȸ");
			return true;
		}else {
			System.out.println(location+"KumhoTire�� �������ϴ�.");
			return false;
		}
		
		
		
		
	}
	
}
