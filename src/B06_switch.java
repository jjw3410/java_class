
public class B06_switch {

	public static void main(String[]args) {
		
		//#switch-case ��
		// -()���� ���� ����� ���� ������ �ڵ带 �����Ѵ�
		// - if������ �Ϻ��ϰ� ��ü �����ϴ�
		// - break�� �Ⱦ��� break�� ���������� ��� case�� �����Ѵ�.
		int a=10;
		
		switch (a%2) {
		case 0:
			System.out.println("¦���Դϴ�.");
			break;
		case 1:	
			System.out.println("Ȧ���Դϴ�.");
			break;
		}
		
		String word="acar";
		switch (word.charAt(0)) {
		case 'a':
			System.out.println("a�� �����ϴ� �ܾ��Դϴ�");
			break;
		case 'b':
			System.out.println("b�� �����ϴ� �ܾ��Դϴ�");
			break;
		case 'c':
			System.out.println("c�� �����ϴ� �ܾ��Դϴ�");
			break;
		default:
			System.out.println("���� case�� �ƴմϴ�.");
			break;
		}
		
		
		
		
	}
}