package ExtendPratice.Extend;

public class DmbCellPhone extends CellPhone{

	int channel;
	
	
	public DmbCellPhone(String model,String color,int channel) {
		
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
		
		void turnOnDmb() {
			
			System.out.println("채널"+channel+"번 방송을 수신합니다");
		}
		
		void changeChannelDmb(int channel) {
			
			this.channel=channel;
			System.out.println("채널"+channel+"번으로 바꿉니다");
			
		}
		
		void turnOffDmb() {
			
			System.out.println("DMB방송 수신을 멈춥니다");
			
		
		
		
	}
	
}
