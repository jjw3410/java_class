package ExtendPratice.InterfaceCasting;

public class Bus implements Vehicle{

	@Override
	public void run() {	//vehicle �޼ҵ带 ������
		System.out.println("������ �޸��ϴ�.");
		
	}
	
	public void checkFare() {//Bus��ü �޼ҵ�
		System.out.println("��������� üũ�մϴ�.");
	}
	
	
}
