package quiz;


import java.util.Scanner;

public class B02_conditionQuiz01 {
	
	
	/*
	 * 1.int�� ���� a�� 10���� ũ�� 20���� ������ true
	 * 2.int�� ���� b�� ¦���϶� true
	 * 3.int�� ���� c�� 7�� ����϶� true
	 * 4.int�� ���� hour�� 0�̻� 24�̻��� �ƴϰ�, 12�̻��� �� true
	 * 5.int�� ����  year�� 400���� ������ �������ų� 
	 * �Ǵ� 4�� ������ �������� 100���� ����������� ���� �� true
	 * 6.�μ��� ö������ 2�� ������ true
	 * 7.�μ��� ö������ ������ 3�� ������ true
	 * 8.boolean�� ���� powerOn�� false�϶� true
	 * 9.���ڿ� �������� str�� "Yes"�� �� true
	 * 10.�ﰢ�� A�� �����ﰢ���̸� true
	 * 11.int�� ���� d��e�� ���̰� 30�϶� true
	 */
	
	
	
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		
			System.out.print("a�� ���� �Է��ϼ���>");
		//1
		int a =sc.nextInt(); 
		System.out.println((a>10)&&(a<20));
		//2
		
		System.out.print("b�� ���� �Է��ϼ��� >");
		int b= sc.nextInt();
		System.out.println(b%2==0);
		//3
		System.out.print("c�� ���� �Է��ϼ���>");
		int c=sc.nextInt();
		System.out.println(c%7==0);
		//4
		System.out.print("�ð��� �Է��ϼ���>");
		int hour=sc.nextInt();
		System.out.println(hour<0||hour<24&&hour>=12);
		//5.
		System.out.print("d�� e�� ���� �Է��ϼ���>");
		int d=sc.nextInt();
		int e=sc.nextInt();	
		
		System.out.println(Math.abs(d-e)==30);
		//6
		System.out.print("���� �Է�>");
		double year=sc.nextInt();
		System.out.println(year%400==0 || year%4==0&&year%100==1);
		//7
		System.out.print("�μ����̿� ö������ �Է�>");
		int minage=sc.nextInt();
		int chrage=sc.nextInt();
		
		System.out.println(minage>chrage+2);
		//8.
		System.out.print("�μ�����,ö������ �Է�>");
		int minbir=sc.nextInt();
		int chrbir=sc.nextInt();
		
		System.out.println(minbir>chrbir+3);
		
		//9.
		boolean powerOn=false;
		System.out.print(!powerOn);
		System.out.println();
		//10.
		//�ҹ��ڷ� �����ϴ� Ÿ�� = ���� �����Ѵ�
		//�빮�ڷ� �����ϴ� Ÿ�� - �ּҸ� �����Ѵ�
		String str="Yes";
		String str2="Yes";
		String str3=new String("Yes");
		String str4=str;
		
	
		System.out.println(str==str2);//�ּҸ� ���� ��1
		System.out.println(str==str3);//�ּҸ� ���� �� 2
		System.out.print(str.equals(str3));//���� ���Ѻ�
		
		
		//11.
		int a1=30, a2=40, a3=90;
		
		System.out.println(a1+a2+a3==180&&(a1==90||a2==90||a3==90)&&(a1!=0 &&a2!=0&&a3!=0));
		
		int b1=3,b2=4,b3=5;
		
		System.out.println(b1*b1+b2*b2==b3*b3||b1*b1+b3*b3==b2*b2||b3*b3+b2*b2==b1*b1);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
