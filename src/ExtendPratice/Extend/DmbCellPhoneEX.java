package ExtendPratice.Extend;

public class DmbCellPhoneEX {

	public static void main(String[] args) {
		
		//DmbCellPhone ��ü ����
		DmbCellPhone dmbCellPhone=new DmbCellPhone("������","�Ķ�",10);
		
		
		//CellPhone�κ��� ��ӹ��� �ʵ�
		System.out.println("��:"+dmbCellPhone.model);
		System.out.println("����:"+dmbCellPhone.color);
		
		
		//dmbCellPhone�� �ʵ�
		System.out.println("ä��:"+dmbCellPhone.channel);
		
		
		//CellPhone�κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������?");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� xxx�Դϴ�.");
		dmbCellPhone.sendVoice("�� �� �ݰ����ϴ�.");
		dmbCellPhone.hangUp();
		
		
		//DmbCellPhone�� �޼ҵ� ȣ��
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(4);
		dmbCellPhone.turnOffDmb();
		
		
		
		
		
	}
	
	
}
