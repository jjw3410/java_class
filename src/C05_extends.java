
public class C05_extends {
	
	//#Ŭ���� ��� 
	//	- �̸� ������ Ŭ������ �״�� �����޾Ƽ� ����ϴ� ��
	//	- ������ִ� Ŭ������ �θ� Ŭ���� �Ǵ� superŬ������� �Ѵ�.	
	//	- ��ӹ޴� Ŭ������ �ڽ� Ŭ���� �Ǵ� subŬ������� �Ѵ�
	//	- �ڽ�Ŭ������ �θ�Ŭ������ ���� ��� ����� �״�� �����޴´�
	//	- �ڽ� Ŭ������ �θ𿡰� �������� ����� ������� �����ؼ� �� �� �ִ�(�������̵�,override)
	//	- �ڽ� Ŭ������ �θ𿡰� ���� ����� ������� �߰��ؼ� �� ���� �ִ�.
	
	public static void main(String[] args) {
		
		Person minsu=new Person("�μ�",10);
		minsu.sayhi();
		
		Police police01= new Police();
		Doctor doctor01= new Doctor();
		Dentist dentist01=new Dentist();
		
		police01.sayhi();
		doctor01.sayhi();
		
		
		
		//#��ü�� ������
		// - ��������� �����̱⵵ ������ ����̱⵵ �Ѵ�.
		//	- Person�� �䱸�ϴ� �ڸ��� Police�� �����ִ�
		//doctor01.scaling(minsu);
		//doctor01.scaling(minsu);
		
		
		//Police�� �θ��� Person�� ��� ������ ������ �ֱ� ������ �ƹ��������� Person�� �ɼ��ִ�(��ĳ����)
		//�غθ�Ÿ������ �ö󰡴� ��ĳ������ �ƹ������� ����    (Person person01=new Police();)
		//Person�� �ڽ���Police�� �𸣴� ����� ������ �� �ֱ� ������ �ڽ�Ÿ���� �ɼ� ����.(�ٿ�ĳ����)
		//�شٿ�ĳ������ Ư���� ��츣 �����ϰ�� �Ұ��� �ϴ� 		(Police police02=new Person();)
		Person person01=new Police();
		Person person02=new Dentist();
		
		
		//���� Police���� �ν��Ͻ��� �ٽ� Police�� �ٿ� ĳ���� �� �� �ִ�.
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
		System.out.printf("�ȳ�! �� �̸��� %s�̰�,���̴� %d���̾�.\n",name,age);
	}
}

class Police extends Person{
	
	String name;
	//1.��ӹ��� ��ü�� �����ڿ��� 
	// 	�θ��� �����ڸ� ���� ���� ȣ���ؾ� �Ѵ�
	
	//	�غθ��� �����ڰ� �Ű������� �䱸�ϴ� �����ڹۿ� ���� ���
	//	�ݵ�� ���� ä���� �θ��� �����ڸ� ȣ���ؾ��Ѵ�
	
	public Police() {
		super("�����",25);
		
		//this():���� �ν��Ͻ��� ������
		//super():���� �ν��Ͻ��� �θ� Ŭ���� ������
		
		System.out.println("super name:"+super.name);
		System.out.println("this name:"+this.name);
	}
	
}

class Doctor extends Person{
	//�⺻ �����ڰ� �ִ� �θ�Ŭ������ ��ӹ޴� ��� �ڵ����� �θ��� �⺻ �����ڸ� ȣ���Ѵ�
	
	
	//PersonŬ������ sayhi()�� ������� ���ļ� ����ϰ� �ִ�
	//������ sayhi()�� ����ϰ� �ʹٸ� super.sayhi()�� ����� �� �ִ�
	@Override
	public void sayhi() {
		
		System.out.printf("�ȳ��ϼ���.����%s�Դϴ�.\n",name);
	}
}

class Dentist extends Doctor{
	
	public void scaling(Person target) {
		System.out.printf("ġ���ǻ� %s�� %s���� �����ϸ��� ������ϴ�.\n",name,target.name);
	}
}






	

