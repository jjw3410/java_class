
public class C09_localInnerClass {

	//#���� ���� Ŭ����
	//- �޼��� ���ο����� Ŭ���� ����� �����ϴ�
	//- �޼��� ������ ��� �� ����
	void method() {
		
		class Apple{
			int size;
			String color;
		}
		
		Apple a= new Apple();
		
		System.out.println(a.size);
		System.out.println(a.color);
	}
	
	public static void main(String[] args) {
		
		String a="�뱸";
		String b="������";
		
		
		
		//�������� Ŭ���� (�޼��尡 ������ Ŭ������ ������� �ȴ�)
		class Apple{
			String addr;
			String color;
			
			public Apple() {
				addr=a;
				color=b;
			}
			
		}
		
		Apple c=new Apple();
		System.out.println(c.addr);
		System.out.println(c.color);
	}
	
	
	
}
