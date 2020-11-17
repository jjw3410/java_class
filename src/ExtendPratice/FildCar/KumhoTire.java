package ExtendPratice.FildCar;

public class KumhoTire extends Tire{

	
	public KumhoTire(String location,int maxRotation) {
		
		super(location,maxRotation);//부모 생성자 호출
		
	}
	
	
	@Override
	
	public boolean roll() {
		++accumlateRotation;
		
		if(accumlateRotation<maxRotation) {
			System.out.println(location+"Tire 수명"+
					(maxRotation-accumlateRotation)+"회");
			return true;
		}else {
			System.out.println(location+"KumhoTire가 터졌습니다.");
			return false;
		}
		
		
		
		
	}
	
}
