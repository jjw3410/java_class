package ExtendPratice.Extend;

public class DmbCellPhoneEX {

	public static void main(String[] args) {
		
		//DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone=new DmbCellPhone("아이폰","파랑",10);
		
		
		//CellPhone로부터 상속받은 필드
		System.out.println("모델:"+dmbCellPhone.model);
		System.out.println("색상:"+dmbCellPhone.color);
		
		
		//dmbCellPhone의 필드
		System.out.println("채널:"+dmbCellPhone.channel);
		
		
		//CellPhone로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요?");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 xxx입니다.");
		dmbCellPhone.sendVoice("아 네 반갑습니다.");
		dmbCellPhone.hangUp();
		
		
		//DmbCellPhone의 메소드 호출
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(4);
		dmbCellPhone.turnOffDmb();
		
		
		
		
		
	}
	
	
}
