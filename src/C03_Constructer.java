




public class C03_Constructer {
	
	//# Ŭ������ ������(Constructor)
	
	//-	Ŭ������ �̸��� �Ȱ��� �̸��� �Լ�(new�� �Բ� ����Ѵ�)
	//- new�� �Բ� �����ڸ� ȣ���ϸ� �ν��Ͻ��� �����ȴ�.
	//- �����ڰ� ��� ����� �Ŀ��� ������ �ν��Ͻ��� �ּҰ� ��ȯ�ȴ�.
	//- �����ڸ� ���� �������� ������ �ƹ��͵� ���ǵ��� �ʴ� �⺻ �����ڰ� �ڵ����� �����ȴ�.
	//
	
	
	//�� �⺻ ������- �Ű������� ���� ������

	
	
	public static void main(String[] args) {
		Orange o1=new Orange();
		
		System.out.println(o1.color);
		System.out.println(o1.size);
		System.out.println(o1.sweet);
		
		Strawberry s1=new Strawberry();
		Grape g1= new Grape(30);
		Grape g2= new Grape(25);
		for(int i=0;i<31;++i) {
			g1.eat();
		}
	}
}

//���ǵ� �����ڰ� �ִٸ� �⺻ �����ڰ� �ڵ����� �������� �ʴ´�.
class Grape{
	int podo;
	int skin;
	
	public Grape(int podo) {
		this.podo=podo;
		this.skin=0;
	}
	
	//�ڵ����� �������� �����Ƿ�,�⺻ �����ڸ� ����ϰ� �ʹٸ� ���� �����ؾ� �Ѵ�.
	
	public Grape() {
		this(20); //�����ڿ��� this()�� ���� �ٸ� �����ڸ� ȣ���� �� �ִ�.
		
		//�����ڿ��� this()�� ���� �ٸ� �����ڸ� ȣ���� �� �ִ�
		//�ٸ� �����ڴ� �ݵ�� ������ �� ���ٿ��� ȣ���ؾ� �Ѵ�
	}
	
	public void eat() {
		
		if(podo==0) {
			System.out.println("�� ������ �� �Ծ����ϴ�.\n");
			System.out.printf("���� ���� ������ %d��, ���ش� %d���Դϴ�.\n",podo,skin);
			return;
		}
		
		podo--;
		skin++;
		System.out.printf("���� ���� ������ %d��, ���ش� %d���Դϴ�.\n",podo,skin);
	}
}




//�����ڸ� �������� ���ٸ� ������ �⺻ �����ڰ� �����Ѵ�.
class Strawberry{
	int seed;
	String color;
	
}



class Orange{
	
	int sweet;
	int size;
	String color;
	
	
	
	//#�������� Ư¡
	//	- �ν��Ͻ� �����ÿ� ���� ���� ȣ��ȴ�.
	// 	- �ַ� �ν��Ͻ� ���� ���� �ʱ�ȭ�ϴ� �뵵�� ����Ѵ�.
	public Orange() {
		//���ÿ��� Ŭ���� ���ο��� this�� �����ص� �ʵ忡 ������ �� �ִ�
		sweet=10;
		size=5;
		color="orange";
		
	}
	
	//#�����ڵ� �Լ�ó�� �����ε��� �����ϴ�
	//-�ϳ��� Ŭ������ �پ��� ������ �����ڸ� ������ ���� �� �ִ�
	public Orange(int sweet,int size,String color) {
		//#this
		//- Ŭ���� ���ο��� ���� �ν��Ͻ��� ������ �� ����ϴ� Ű����
		
		
		//�ʵ尪�� ������������ ��ġ�� ��� this�� ���� ����� �������� ��Ȯ�ϰ� ������ �� �ִ�
		
		
		//��this�� ���� ���� �ν��Ͻ� ������ �ȴ�
		this.sweet=sweet;
		this.size=size;
		this.color=color;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
