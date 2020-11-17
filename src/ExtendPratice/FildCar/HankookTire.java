package ExtendPratice.FildCar;

public class HankookTire extends Tire{

	
	
	public HankookTire(String location,int maxRotation) {
	
		super(location,maxRotation);//부모 생성자 호출
		
	}
	
	
	@Override
	public boolean roll() {
		
		++accumlateRotation;
		
		if(accumlateRotation<maxRotation) {
			System.out.println(location+"HankookTire의 수명:"+
		(maxRotation-accumlateRotation)+"회");
			
			return true;
		}else {
			System.out.println(location+"HankookTire가 터졌습니다");
			return false;
		}
		
		
	}
	
}
