package practice_Class;

public class Student02 {
	
	//�������
	int m_nKor;
	int m_nEng;
	int m_nMat;
	
	//��� ������ ���� �����ִ� set �޼ҵ�
	public void set(int a,int b,int c) {
		
		m_nKor=a;
		m_nEng=b;
		m_nMat=c;
	}
	
	//���������ڰ� public�̰�
	//��ȯ���� double����
	//��,��,���� ����� ���ϴ� �Լ�
	public double calc() {
		double avg;
		avg=(m_nKor+m_nEng+m_nMat)/3.0;
		
		return avg;
	}
	
	//������
	public void disp() {
		System.out.println("�����"+calc()+"�Դϴ�");
	}
	
	
	
}
