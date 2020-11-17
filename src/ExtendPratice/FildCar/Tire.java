package ExtendPratice.FildCar;

public class Tire {

	public int maxRotation;//최대회전수(타이어 수명)
	public int accumlateRotation;//누적 회전수
	public String location;//타이어의 위치
	
	
	public Tire(String location,int maxRotation) {
		
		this.location=location;
		this.maxRotation=maxRotation;
	}
	
	public boolean roll() {
		
		++accumlateRotation;//누적횟수 1증가
		if(accumlateRotation<maxRotation) {
			System.out.println(location+"Tire 수명:"+(maxRotation-accumlateRotation)+"회");
			return true;
		}else {
			System.out.println(location+"타이어가 터졌습니다.");
			return false;
		}
	}
	
}
