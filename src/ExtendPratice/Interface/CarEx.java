package ExtendPratice.Interface;

public class CarEx {

	
	public static void main(String[] args) {
		
		Car car=new Car();
		
		car.run();
		
		car.tires[0]=new KumhoTire();
		car.tires[1]=new KumhoTire();
		
		car.run();
		
		int array[]= {10,20,30,40,50};
		
		
		for(int number:array) {
			System.out.println(number);
		}
		
		/*
		 for each문 형식
		 
		 for(변수타입 변수이름:배열이름){
		 	실행부분;
		 }
		 -배열의 항목수 만큼 실행부분 반복
		 배열의 항목을 순서대로 꺼내어 변수에 대입
		 ※오직 배열의 값을 가져다 사용할수 있고 수정할수 없다.
		 
		 */
		
		
		
		
		
	}
}
