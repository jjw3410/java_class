package crypto;

public class CaesarCipher {

	// # 암호란?
	// - 비밀메세지를 주고받기 위한것
	// - 암호화(Encryption): 평문(일반 메세지)를 암호문(비밀메세지)로 바꾸는 것
	// - 복호화(Decryption): 암호문을 평문으로 되돌리는 것
	// - 키(Key)
	//	암호화와 복호화에 사용되는 비밀 값
	
	//# 시저(카이사르) 암호
	//	- 알파벳을 키(Key)값 만큼 오른쪽으로 이동시키는 암호 방식
	// 	- 암호화: 평문을 키 값 만큼 오른쪽으로 이동시킨다.
	//	- 복호화: 암호문을 키 값 만큼 왼쪽으로 이동시킨다.
	
	
	//암호화 복호화 예
	//ABCDEFGHIJKLMNOPQRSTUWXYZ !@#$,abcfdfghijklmnopqrstuwxyz...
	// # key값이 3인 경우 암호화(+3)
	// "Hello,World!"	=>	"";"Khoorc#Zruog$"
	// # key값이 3인 경우 복호화(-3)
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
		//매개변수로 받은 평문을 암호화 하여 리턴하는 함수를 구현해보세요
		StringBuilder crypto=new StringBuilder(plain_text);
		
		for(int i=0,len=plain_text.length();i<len;++i) {
			char ch=plain_text.charAt(i);
		
			int index=indexOf(ch);
		
			if (index!=-1) {
				//찾은경우 ch를 암호화
				crypto.append(charset[(index+key)%len]);
			}else {
				//못찾은 경우 ch를 유지
				crypto.append(ch);
			}
		
		}
		return crypto.toString();
	}
	
	public String decryption(String crypto_text) {
		//매개변수로 받은 평문을 복호화 하여 리턴하는 함수를 구현해보세요
		return null;
	}
	
	
	public static void main(String[] args) {
		String crypto=new CaesarCipher(3).encryption("hello,world!");
		System.out.println(crypto);
		
	}
	
	
	
	
	
	
	
}

