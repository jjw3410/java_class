package crypto;

public class CaesarCipher {

	// # ��ȣ��?
	// - ��и޼����� �ְ�ޱ� ���Ѱ�
	// - ��ȣȭ(Encryption): ��(�Ϲ� �޼���)�� ��ȣ��(��и޼���)�� �ٲٴ� ��
	// - ��ȣȭ(Decryption): ��ȣ���� ������ �ǵ����� ��
	// - Ű(Key)
	//	��ȣȭ�� ��ȣȭ�� ���Ǵ� ��� ��
	
	//# ����(ī�̻縣) ��ȣ
	//	- ���ĺ��� Ű(Key)�� ��ŭ ���������� �̵���Ű�� ��ȣ ���
	// 	- ��ȣȭ: ���� Ű �� ��ŭ ���������� �̵���Ų��.
	//	- ��ȣȭ: ��ȣ���� Ű �� ��ŭ �������� �̵���Ų��.
	
	
	//��ȣȭ ��ȣȭ ��
	//ABCDEFGHIJKLMNOPQRSTUWXYZ !@#$,abcfdfghijklmnopqrstuwxyz...
	// # key���� 3�� ��� ��ȣȭ(+3)
	// "Hello,World!"	=>	"";"Khoorc#Zruog$"
	// # key���� 3�� ��� ��ȣȭ(-3)
	//	"Khoorc#Zruog$"  =>  "Hello,World!"
	
	char[] charset=("ABCDEFGHIJKLMNOPQRSTUWXYZ !@#$,abcfdfghijklmnopqrstuwxyz").toCharArray();
	int key;
	
	public CaesarCipher(int key) {
		this.key=key%charset.length;
	}
	public int indexOf(char ch) {
		for(int i=0;i<charset.length;++i) {
			if(ch==charset[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public String encryption(String plain_text) {
		//�Ű������� ���� ���� ��ȣȭ �Ͽ� �����ϴ� �Լ��� �����غ�����
		StringBuilder crypto=new StringBuilder(plain_text);
		
		for(int i=0,len=plain_text.length();i<len;++i) {
			char ch=plain_text.charAt(i);
		
			int index=indexOf(ch);
		
			if (index!=-1) {
				//ã����� ch�� ��ȣȭ
				crypto.append(charset[(index+key)%len]);
			}else {
				//��ã�� ��� ch�� ����
				crypto.append(ch);
			}
		
		}
		return crypto.toString();
	}
	
	public String decryption(String crypto_text) {
		//�Ű������� ���� ���� ��ȣȭ �Ͽ� �����ϴ� �Լ��� �����غ�����
		return null;
	}
	
	
	public static void main(String[] args) {
		String crypto=new CaesarCipher(3).encryption("hello,world!");
		System.out.println(crypto);
		
	}
	
	
	
	
	
	
	
}

