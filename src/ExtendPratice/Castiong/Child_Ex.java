package ExtendPratice.Castiong;

public class Child_Ex {

	public static void main(String[] args) {
		
		Parent parent=new Child();//�ڵ� Ÿ�Ժ�ȯ
		
		parent.field1="data1";
		
		parent.method1();
		parent.method2();
		
		//parent.field2="data2";	
		//parent.method3();
		
		Child child=(Child) parent;//����Ÿ�Ժ�ȯ
		child.field2="data2";
		child.method3();
		
	}
	
}