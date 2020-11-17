
public class C04_static {
	
	//	#static(���� ����,Ŭ���� ����<=>�ν��Ͻ� ����)
	//- ���� Ŭ������ ��� �ν��Ͻ��� �������� ����ϴ� �����̴�.
	//- static ������ Ŭ���� �� �ϳ��̱� ������ Ŭ���� �̸���.�� ��� ����ϴ°��� ����ȴ�(�ν��Ͻ��� .����� ����ص� ������ �� ���� ���� ���� ������)
	//- static������ �ڿ��� �ν��Ͻ��� ����� ������ ȣ���� �� �ִ�
	//- �ν��Ͻ��� �������� ���� ���� static�� ���� ��ɼ��� �ֱ� ������
	// 	static �޼��忡���� instance�ڿ��� ����� �� ����
	//	(�ν��Ͻ����� ����ƽ������ ������ ����Ѵ�)
	public static void main(String[] args) {
	
//		System.out.println(Card.width);
//		System.out.println(Card.height);
		Card s1= new Card("Spade",1);
		Card s2= new Card("Spade",2);
		Card s3= new Card("Spade",3);
		
		
//		Card s1=new Card("Spade",1);
//		//Card h1=new Card("Heart",1);
//		Card s2=new Card("Spade",2);
//		Card s3=new Card("Spade",3);
//		Card s4=new Card("Spade",4);
//		Card s5=new Card("Spade",5);
//		
//		Card.width=333;
//		
//		
//		System.out.println(Card.width);
//		System.out.println(s1.width);
//		System.out.println(s2.width);
//		System.out.println(s3.width);
		
		//����
		//myobj ��Ű�� ���ο� static ������ �޼��带 ���� Ŭ������ �ϳ� ���� �غ�����.
		//(������,�����ڵ� ����,width/heigth ����)
	}

}


class Card {
	//�� ī�帶�� �ٸ� ���� ������ �־���ϴ� ����(�ν��Ͻ�)
	//->�ν��Ͻ� ������ ����ϱ⿡ ������
	String shape;
	int number;
	
	//ī���� ũ��� ��� ī�忡�� �ݵ�� ���ƾ� �Ѵ�
	//->�ν��Ͻ� ������ ����ϸ� ������ �Ʊ��� ->���� ������ ���
		static int width;
		static int height;  	
	
	//������ ��� static block���� �ʱ�ȭ�� �����ϴ� ���� ����
	static {
		width=100;
		height=200;
		System.out.println("static block called");
	}
	
	//static method
	//-�Ű������� ����ϰų� static ������ ��� ���� 
	//-�ν��Ͻ��� �����ϰ� �׻� ������ ����� ������ �� ����Ѵ�.
	
	public static void changeCardSize(int width,int height){
		
		//static �޼��忡���� this�� �������� �ʴ´�
		//(���� �ν��Ͻ��� �������� �ʾ������� �����Ƿ�
		Card.width=width;
		Card.height=width;
		
		
	}
	
	public static int[] getCardSize(){
		return new int [] {width,height};
	}
	
	
	
	
	//instance block
	{
		System.out.println("instance block called");
	}
	
	public Card(String shae,int number) {
		this.shape=shape;
		this.number=number;
		
		
		//�����ڿ��� static�� �ʱ�ȭ �ϴ� ���
		//�ʱ�ȭ ���� ���� static �ʵ带 ����� ������ ũ��.
		width=100;
		height=200;
		System.out.println("constructor block called");
		
	}
}


class coffee{
	
	int from;//�������� ��ȣ�� ǥ���ϱ����
	
	//������ ��ȣ�� ��� Ŀ�ǵ��� ���� ��ȣ�� ����ؾ���
	//->���� ������ ����ϴ°��� �ո����̴�.
	final static int SOUTH_KOREA=0;
	final static int COLUMNBIA=1;
	final static int BRAZIL=2;
	
}























