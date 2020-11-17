package quiz;

public class B13_count_letter_case {
	
	public static void main(String[] args) {

		
		
		String msg="hello,world!";
		
		//입력받은 문자 대문자로 변경
		
		int[]count_upper=new int[26];
		int[]count_lower=new int[26];
		int[]count_num=new int[10];// 입력받은 문자의 알파벳 개수를 세기 위한  배열 만듬.
		
	for (int i=0,len=msg.length(); i <len;++i) {
			
			char ch=msg.charAt(i);
			
		if(ch>='A' && ch<='Z') {
			count_upper[ch-'A']+=1;
		} else if (ch>='a' && ch<='z') {
			count_lower[ch-'a']+=1;
		}else if (ch>='1' && ch<='9') {
			count_lower[ch-'1']+=1;
		}
		
	}
	for (int i=0; i<count_upper.length;++i) {
		if (count_upper[i]>0) {
			System.out.printf("%c:%d회\n",i+'A',count_upper[i]);
		}
	}
	for (int i=0; i<count_lower.length;++i) {
		if (count_lower[i]>0) {
			System.out.printf("%c:%d회\n",i+'a',count_upper[i]);
		}
	}
	for (int i=0; i<count_num.length;++i) {
		if (count_upper[i]>0) {
			System.out.printf("%c:%d회\n",i+'1',count_num[i]);
		}
	}

	}
}
