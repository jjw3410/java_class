package ExtendPratice.FildCar;

public class Tire {

	public int maxRotation;//�ִ�ȸ����(Ÿ�̾� ����)
	public int accumlateRotation;//���� ȸ����
	public String location;//Ÿ�̾��� ��ġ
	
	
	public Tire(String location,int maxRotation) {
		
		this.location=location;
		this.maxRotation=maxRotation;
	}
	
	public boolean roll() {
		
		++accumlateRotation;//����Ƚ�� 1����
		if(accumlateRotation<maxRotation) {
			System.out.println(location+"Tire ����:"+(maxRotation-accumlateRotation)+"ȸ");
			return true;
		}else {
			System.out.println(location+"Ÿ�̾ �������ϴ�.");
			return false;
		}
	}
	
}
