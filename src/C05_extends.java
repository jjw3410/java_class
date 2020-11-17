
public class C05_extends {
	
	//#클래스 상속 
	//	- 미리 만들어둔 클래스를 그대로 물려받아서 사용하는 것
	//	- 상속해주는 클래스를 부모 클래스 또는 super클래스라고 한다.	
	//	- 상속받는 클래스를 자식 클래스 또는 sub클래스라고 한다
	//	- 자식클래스는 부모클래스가 가진 모든 기능을 그대로 물려받는다
	//	- 자식 클래스는 부모에게 물려받은 기능을 마음대로 수정해서 쓸 수 있다(오버라이드,override)
	//	- 자식 클래스는 부모에게 없던 기능을 마음대로 추가해서 쓸 수도 있다.
	
	public static void main(String[] args) {
		
		Person minsu=new Person("민수",10);
		minsu.sayhi();
		
		Police police01= new Police();
		Doctor doctor01= new Doctor();
		Dentist dentist01=new Dentist();
		
		police01.sayhi();
		doctor01.sayhi();
		
		
		
		//#객체의 다형성
		// - 김경찰씨는 경찰이기도 하지만 사람이기도 한다.
		//	- Person을 요구하는 자리에 Police가 들어갈수있다
		//doctor01.scaling(minsu);
		//doctor01.scaling(minsu);
		
		
		//Police는 부모인 Person의 모든 정보를 가지고 있기 때문에 아무문제없이 Person이 될수있다(업캐스팅)
		//※부모타입으로 올라가는 업캐스팅은 아무문제가 없다    (Person person01=new Police();)
		//Person은 자식인Police에 모르는 기능이 존재할 수 있기 때문에 자식타입이 될수 없다.(다운캐스팅)
		//※다운캐스팅은 특별한 경우르 제외하고는 불가능 하다 		(Police police02=new Person();)
		Person person01=new Police();
		Person person02=new Dentist();
		
		
		//원래 Police였던 인스턴스는 다시 Police로 다운 캐스팅 될 수 있다.
		Police police = (Police)person01;
		Doctor doctor=(Doctor)person02;
		Dentist dentis=(Dentist)person02;
		
	}
}
class Person{
	String name;
	int age;
	
	public Person() {
		this("defalult name",0 );
	}
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void sayhi() {
		System.out.printf("안녕! 내 이름은 %s이고,나이는 %d살이야.\n",name,age);
	}
}

class Police extends Person{
	
	String name;
	//1.상속받은 객체는 생성자에서 
	// 	부모의 생성자를 가장 먼저 호출해야 한다
	
	//	※부모의 생성자가 매개변수를 요구하는 생성자밖에 없는 경우
	//	반드시 값을 채워서 부모의 생성자를 호출해야한다
	
	public Police() {
		super("김경찰",25);
		
		//this():현재 인스턴스의 생성자
		//super():현재 인스턴스의 부모 클래스 생성자
		
		System.out.println("super name:"+super.name);
		System.out.println("this name:"+this.name);
	}
	
}

class Doctor extends Person{
	//기본 생성자가 있는 부모클래스를 상속받는 경우 자동으로 부모의 기본 생성자를 호출한다
	
	
	//Person클래스의 sayhi()를 마음대로 고쳐서 사용하고 있다
	//원래의 sayhi()를 사용하고 싶다면 super.sayhi()를 사용할 수 있다
	@Override
	public void sayhi() {
		
		System.out.printf("안녕하세요.닥터%s입니다.\n",name);
	}
}

class Dentist extends Doctor{
	
	public void scaling(Person target) {
		System.out.printf("치과의사 %s가 %s에게 스케일링을 해줬습니다.\n",name,target.name);
	}
}






	

