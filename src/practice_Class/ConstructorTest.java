package practice_Class;

public class ConstructorTest {

	public static void main(String[] args) {
		//�����ε� �� ������ ȣ��
		StudentBean student01=new StudentBean(100,60,80);
		//�Ű������� ���� ������ ȣ��
		StudentBean student02=new StudentBean();
		
		//��� �� ����ϴ� �޼ҵ� ȣ��
			student01.disp();
			student02.disp();
			
	}
	
	
}
