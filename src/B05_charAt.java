

import java.util.Scanner;
public class B05_charAt {
	public static void main(String[]args) {
		
		
		//"���ڿ�".charAt(index)
		//-���ڿ����� ���ϴ� ��°�� ���ڸ� ������ �Լ�
		//-�� �Լ��� ���� ����� char Ÿ���̴�(��ȯ Ÿ���� charŸ���̴�)
		//-ù ��° ���ڰ� 0�� �ε����̴�.
		
		//#"���ڿ�".length()
		//- ���ڿ��� �� ���ڷ� �̷�����ִ����� �˷��ش�
		//- ��ȯŸ�� int
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�ƹ��ų� �Է� �غ�����.>");
		
		String word=sc.nextLine();//nextLine(); �� ���� ������
		
		System.out.println(word);
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		
		if(word.length()>=5) {
			System.out.println(word.charAt(4));
		}else 
			System.out.println("�ش� �ܾ��� ���̰� 5���� ª���ϴ�");
		
	}
}
