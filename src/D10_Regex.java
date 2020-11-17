import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D10_Regex {

//	String str="abc@naver.com";
//	
//	if(str.contains("@")&&str.contains(".")) {
//		System.out.println("�̸����Դϴ�");
//	}else {
//		System.out.println("�̸����� �ƴմϴ�.");
//	}
	
	
	
	
	
	//#����ǥ����(Regular Expression)
	//-���ڿ��� ������ ǥ���ϴ� ���
	//-�ش� ���ϰ� ��ġ�ϴ� ���ڿ��� �˻��� �� �ִ�.
	
	
	//#PatternŬ����
	//-����ǥ������ �ٷ�� Ŭ����
	
	
	//#MatcherŬ����
	// - ������ �̿��Ͽ� ��� ���ڿ��� �˻��� �� ����ϴ� Ŭ����
	
	public static void main(String[] args) {
		
		
		String str="sleep";
										  // ���� ǥ����/input
		System.out.println(Pattern.matches("sleep", "sleep"));

		
		//[a-zA-Z] �ҹ��� �빮�� �Ѵ�
		
		//[]:�ش� ��ġ�� �ѱ��ڿ� � ���ڵ��� �ü��ִ��� �����Ѵ�.
		
		
		//[]���ο� ������ �� �ִ� �͵�
		//1.	abc: abc�� ���
		//2.	^abc: abc�� ������ ��θ� ���
		//3.	a-z:a���� z������ ���
		//4.	&&:������		
		
		System.out.println(Pattern.matches("s[a-zA-Z]eep", "sceep"));	
		System.out.println(Pattern.matches("s[^1-9]eep", "sceep"));		
		System.out.println(Pattern.matches("s[aeiou]eep", "sceep"));		
		System.out.println(Pattern.matches("s[a-zA-Z]eep", "sceep"));
		System.out.println(Pattern.matches("s[a-d&&c-f]eep", "sceep"));
		
		
		//# ���� ���ڸ� �����ϰ� ǥ���ϴ� �͵�
		// 1.   .: �ش� �ڸ��� ��繮�ڸ� ��� ��[]�ۿ� ����� 	
		
		// 2.  \d: �ش� �ڸ��� ���ڵ��� ���
		// 3.  \D: �ش� �ڸ��� ���ڸ� ������ ������ ���
		// 4.  \s: �ش� �ڸ��� ������ ���[\t,\n,\r....���� ��� �����]
		// 5.  \S: �ش� �ڸ��� ������ ������ ������ ���
		// 6.  \w: �Ϲ����� ���ڵ��� ���[a-zA-Z_0-9]
		// 7.  \W: �Ϲ����� ���ڵ��� ������ ������ ���
		System.out.println(Pattern.matches("s.eep", "sceep"));
		System.out.println(Pattern.matches("s\\deep", "s2eep"));
		System.out.println(Pattern.matches("s\\Deep", "s$eep"));
		System.out.println(Pattern.matches("s\\seep", "sleep"));
		System.out.println(Pattern.matches("s\\Seep", "saeep"));
		
		
		//# �ش� ������ ����� ������ ������ �����ϴ� ���(�ذ����� �������)
		//	1. Exp{n}: �տ� �ִ� ������ n���� ����ȴ�
		//	2. Ex{n,m}: �տ� �ִ� ������ �ּ� n�����̻� m���� ����Ǿ����
		//  3. Ex{n,}: �տ� �ִ� ������ �ּ� n���� �̻� ���� ��ġ�ؾ� �Ѵ�
		//  4. Ex? : 0�� Ȥ�� �ѹ�
		//  5. Ex+:	�ּ� �ѹ� �̻� 
		//  6. Ex*: 0�� Ȥ�� ������
		System.out.println(Pattern.matches("....[\\d]{4}", "abas1234"));
		System.out.println("��ȿ�� ���̵�:"+Pattern.matches("[\\w��-�R]{2,12}", "a��s1234"));
		
		//?
		System.out.println(Pattern.matches("[@]?.*", "abc"));
		
		String email="jjw3410@naver.com";
		System.out.println("�̸��� ����:"
				+ Pattern.matches("[\\w]+@[a-zA-Z0-9]+[.][a-zA-Z.]+",email ));
		
		
		//# Pattern.matches(regex,str)
		// - ������ ���ڿ��� ����ǥ���� ��ġ�ϸ� true
		
		//# Pattern.compile(regex)
		// - ������ ����ǥ������ �̿��� ������ �ν��Ͻ��� ��ȯ�Ѵ�
		
		Pattern email_regex=
				Pattern.compile("/");
		
		String[] fruits=email_regex.split("apple/banana/orange/kiwi");
		System.out.println(Arrays.toString(fruits));
		
		//#������ Pattern �ν��Ͻ��� matcher �����ϱ�
		
		
		
		//java.util.regex.Matcher;
		// - ���ڿ��� ó������ ������ �˻��ϸ鼭 �ش� ����ǥ���İ� ��ġ�ϴ� �ε����� ã�����
		
		Pattern fruit_regex=Pattern.compile("[a-zA-Z[^/]]+");
		
		Matcher matcher=fruit_regex.matcher("apple/banana/orange/kiwi");
		
		//find: ����ǥ������ ���� ã�� ���� ������ true
		
		while (matcher.find()) {
			System.out.println("ã�� �� :"+matcher.group());
			System.out.println(matcher.start()+" to "+matcher.end());
		}
		
		
	
	}
}
