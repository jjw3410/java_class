package practice_Class;

public class GetterSetter {

	public static void main(String[] args) {
		Data obj=new Data();
		
		obj.setNumber(1);
		obj.setName("정진우");
		
		System.out.println("obj의number:"+obj.getNumber());
		System.out.println("obj의name:"+obj.getName());
		
	}
}
