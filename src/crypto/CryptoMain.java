package crypto;

public class CryptoMain {

	public static void main(String[] args) {
		
		//����ڰ� �޼����� Ű���� �����Ͽ� ���ϴ� ��ȣ �˰�������
		//��ȣȭ/��ȣȭ �۾��� �� �� �ִ� ���α׷��� ��������.
		
		String user_input="Caesar";
		int user_input_key=8;
		
		//����� ���� Ŭ������ �Ϲ�ȭ(��ĳ����) ��Ű�� �뵵�� �ַ� ���� ����Ѵ�.
		Cipher cipher=null;
		
		
		
		if(user_input.equals("Caesar")) {
			cipher=new CaesarCipher(user_input_key);
		}else if(user_input.equals("Transposition")) {
			cipher=new TranspositionCipher(user_input_key);
		}
			
		
	}
}
