package ExtendPratice.InterfaceCasting;

public class Bus implements Vehicle{

	@Override
	public void run() {	//vehicle 메소드를 가져옴
		System.out.println("버스가 달립니다.");
		
	}
	
	public void checkFare() {//Bus자체 메소드
		System.out.println("승차요금을 체크합니다.");
	}
	
	
}
