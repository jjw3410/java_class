package myobj.machine;

public interface Electronics {

	// ���� ������ �����Ͽ� ���� ��� �������̽��� �ۼ��غ����� 
	
	// 1. ��� ���ڱ��� ���� ������ ���� �� �ִ�
		
	// 2. ��� ���ڱ��� �ֿܼ� �ѹ� ����Ҷ�����  
	//    ���� �Һ񷮸�ŭ�� ������ �Һ��Ѵ�	
	
	// 3. ��� ���ڱ��� �����ϰ� �ִ� ������ �ֿܼ� ����Ѵ�	
	
	// �� ���߿� ������ �� �� �ʿ��� �޼������ �����Ѵ� 
	void setConnect(ElectricSource src);	
			
	String execute();
	
	
	// Generator getConnectedGenerator();
}
