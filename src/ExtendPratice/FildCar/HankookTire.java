package ExtendPratice.FildCar;

public class HankookTire extends Tire{

	
	
	public HankookTire(String location,int maxRotation) {
	
		super(location,maxRotation);//�θ� ������ ȣ��
		
	}
	
	
	@Override
	public boolean roll() {
		
		++accumlateRotation;
		
		if(accumlateRotation<maxRotation) {
			System.out.println(location+"HankookTire�� ����:"+
		(maxRotation-accumlateRotation)+"ȸ");
			
			return true;
		}else {
			System.out.println(location+"HankookTire�� �������ϴ�");
			return false;
		}
		
		
	}
	
}
