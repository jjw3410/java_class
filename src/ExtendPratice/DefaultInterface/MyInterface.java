package ExtendPratice.DefaultInterface;

public interface MyInterface {

	public void mehtod1();
	
	
	public default void method2() {
		
		System.out.println("MyInterface-method2() ����");//����Ʈ�޼ҵ�
		
	}
	
}
