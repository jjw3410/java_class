package practice_Class;

public class StudentBean {
	
	//����ʵ� ����
	int kor;
	int eng;
	int mat;
	
	//�Ű������� ���� ������
	public StudentBean() {
		System.out.println("�⺻ ������");
	}
	
	//�Ű������� �����ϴ� ������ (�� ������ �޼ҵ� �����ε�)
	public StudentBean(int a, int b, int c) {
		
		//this(); �� ���� ���� �����ڸ���ʵ忡 ������ this.�� �Ƚᵵ �ȴ�. 
		this.kor=a;
		this.eng=b;
		this.mat=c;
	}

	//����� ��� �޼ҵ�
	public void disp() {
	
		System.out.println("���� ������ ��:"+kor);
		System.out.println("���� ������ ��:"+eng);
		System.out.println("���� ������ ��:"+mat);
	}
}
