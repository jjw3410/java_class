package ExtendPratice.DefaultInterface;

public class MyClassB implements MyInterface {

	@Override
	public void mehtod1() {
		System.out.println("MyClassB-method1() 실행");
		
	}
	
	@Override
	
	public void method2() {
		System.out.println("MyclassB-method2() 실행");	//default 메소드 재정의
								
		
	}
	
}
