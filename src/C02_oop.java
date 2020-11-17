import java.util.Scanner;

public class C02_oop {
	//#객체지향 프로그래밍(OOP:Object Oriented Programming)
	//-세상에 존재하는 모든 것들을 변수와 함수로 표현하려는 프로그래밍 방법
	//-변수와 함수를 무분별하게 사용하기 보다는 현실에 존재하는 객체처럼 보이도록 하여 가독성을 올린다.
	//-객체(Object): 세상에 존재하는 모든 개념을 말한다(사물,개념,알고리즘등등)
	
	
	//강의실->인원 수(변수) ,최대 수용인원(상수)
	//		사람이 들어옴
	//		사람이 나감
	
	//ex:학생
	//-학생의 변수 : 성적,성별,키,나이...
	//-학생의 메서드 : 
	//	->시험을 친다(최신성적 업데이트)
	//	->1년이 지난다 (학년이 올라감)
	//	->유급한다(나이만 오르고 학년은 그대로)
	//	->재시험을 친다(현재 성적에 따라 가능 여부가 다름)
	
	//ex:사과
	//- 사과의 변수: 크기,색깔.수확날짜,당도,칼로리,데미지....
	//-	사과의 메서드: 
	//	->먹는다(크기가 줄어들고 ,칼로리변화)
	//	->갈변(색깔,당도 변화)
	//	->던진다(보유한 데미지에 따라 아픈정도가 달라진다)
	
	//※메서드: 객체의 변수에 영향을 미치는 함수를 메서드라고 부른다.
	
	//#클래스 (Class)
	//-객체를 프로그래밍 언어로 표현한 것
	//-클래스는 객체의 설계도(만든 시점에서는 실체가 없음)
	//-클래스를 통해 생성하는 실제 객체를 '인스턴스'라고 부른다
	//-클래스는 참조형 변수 타입이다.
	//(만약 사과 클래스를 만든다면 사과 타입을 사용할 수 있게 된다)

	
	public static void main(String[] args) {
	
		
		//Scaaner 설계도로 실체(Scanner 인스턴스)를 만들어 변수  sc에 저장
		Scanner sc=new Scanner(System.in);
		
		//Apple 설계도로 실체(인스턴스)를 만들고 그 실체의 주소를 변수 apple01에 저장
		Apple apple01=new Apple();
		Apple apple02=new Apple(); //인스턴스
		Apple apple03=new Apple();
		
		
		String[] fruits=new String[10];
		
		
		//클래스 타입 배열을 만든 시점에서는 인스턴스가 생성되지 않았다
		//(배열의 실체만 생성됨)
		Apple[]apple_box=new Apple[10];
		
		for(int i=0; i<apple_box.length;i++) {
		
			apple_box[i]=new Apple();
		
		}
		
		
		apple02.sweet=10;
		apple03.sweet=8;
		
		//실체가 생겼으므로 미리 만들어둔 설계도대로 사용할 수 있다
		apple01.birthday="2020/10/29";
		apple01.size=10;
		apple01.calorie=apple01.size*10;
		apple01.color="red";
		apple01.sweet=7;
		
		
		for (int i=0;i<3;++i) {
		apple01.eat();
		apple02.eat();
		apple03.eat();
		}
		
	}
	
}
//중괄호만 보고도 클래스 바깥인것을 짐작(들여쓰기를 잘 맞춰놨다면)



//1.myobj.fruit 패키지에 클래스를 하나 정의하고 인스턴스를 생성해보세요
//2.myobj.vehicle 패키지에 클래스를 하나 정의하고 인스턴스를 생성해보세요
//※각 클래스는 변수 3개이상 메서드 1개 이상







//ex:사과
//- 사과의 변수: 크기,색깔.수확날짜,당도,칼로리,데미지....
//-	사과의 메서드: 
//	->먹는다(크기가 줄어들고 ,칼로리변화)
//	->갈변(색깔,당도 변화)
//	->던진다(보유한 데미지에 따라 아픈정도가 달라진다)





class Apple{
	
	//#인스턴스 변수
	//-모든 인스턴스마다 각자 다른 값을 가지고 있는 변수
	//-필드,멤버변수,인스턴스 변수,상태..
	
	int size;
	int sweet;
	int calorie;	 
	int damage;
	String color;
	String birthday;
	
	//#인스턴스 메서드
	//- 인스턴스 변수를 활용하는 메서드
	//- 기능,메서드
	void eat() {
		System.out.println("사과를먹었습니다.");
		System.out.println(this.sweet+"만큼 기분이 좋아졌습니다.");//설계도 내부에 있는 변수를 가리킬때는 this를 붙인다.
		this.size-=1;
		this.calorie-=10;	// Class의 자체의 메서드
		System.out.printf("크기: %d, 보유 칼로리: %d\n",this.size,this.calorie);
	}
	
	
}
















