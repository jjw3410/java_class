package quiz;

import java.util.Arrays;
import java.util.Scanner;
public class C01_functionQuiz02 {
	//1.�ּҰ��� �ִ� ���� �Ű������� ������ �� ������ ��簪�� �����ϴ� int�迭�� �����Ͽ� ��ȯ�ϴ� range�Լ��� ����� ������.(�ּҰ��̻�,�ִ밪 �̸�)
	//2.�ִ밪�� �Ű������� ���� ������,0���� �ִ밪 �̸��� ���� �����ϴ� range2 �Լ��� ��������.
	//3.���ڿ� �迭�� ���� ������,�ش� �迭�� ��� "/" ���̾���̴� �Լ��� ��������.
	//ex:"apple","banana","orange"
	//	->apple/banana/orange
	//4.���ڿ� Ÿ���� ����,���� ����(base_from),�ٲٷ��� ����(base_to)�� ���� ������ base_from�� �����̾��� �ش� num�� base_to������ ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �Լ��� ����� ������
	//����,������ �߸��Ȱ�� null�� ��ȯ�մϴ�.
	
						







	//01234	16~20
	//1.			4~8	=4567 4 
 				//1~3		1,2
		public static int[] range(int num1,int num2) {
		
			if(num1>num2) {
		
				int temp=num1;
				num1=num2;
				num2=temp;
			}
			//			8		4	
			int num_length=num2-num1;
			int range[]=new int [num_length];//4
			
			for(int i=0;i<num_length;i++) {
			//0,1,2,3
			range[i]=num1;
			num1+=1;
			}
			return range;
		}	
	
	//2.
		public static int[] range2(int num3) {
		
			int start=0;
			int num_length=num3;
			int range2[]=new int[num_length]; 
		

			for (int i= start;i<num_length;++i) {
			range2[i]=start;
			start++;
			}
			return range2;
		}
	

	//3.
			public static String join(String[]str) {
				
				StringBuilder str2=new StringBuilder();
			
				
				int length=str.length;					
				
			
				for (int i=0;i<length;i++) {
				
					str2.append(str[i]);
					
					//str2.append("/");
					if(i!=(length-1)) {//
						str2.append("/");
					}
				}
				
				return str2.toString();  //str2�� ���ڿ��� �ƴϱ� ������ ���ڿ��� �����ؾ��Ѵ�.
				
			
			}
			
			public static int getValue (char digit) {
				
				char [] digits ="0123456789ABCDEFGHIJKLNOPQRSTUWXYZ".toCharArray();
				
				for (int i=0;i<digits.length;++i) {
					if(digits[i]==digit) {
						return i;
					}
				}
				return -1;
			}
			
			
			
			
			
			
	//4.
			public static String convert_base(String num,int base_from,int base_to) {
				
				
				if(base_from<2||base_from>36||base_to<2||base_to>36) {
					System.err.println("��밡���� ������ 2���� 36�Դϴ�.");
					return null;
				}
				
				int pow=num.length() -1;
				long real_value=0;
				for(int i=pow;i>-1;--i) {
					char digit=num.charAt(pow-i);
					int value=getValue(digit);
				
					System.out.println(digit);
					System.out.println("\t������:"+value);
					System.out.println("\t"+Math.pow(base_from, i)+"�� �ڸ�");
				
					real_value+=value*Math.pow(base_from,i);
				}
				
				System.out.println(base_from+"���� ���ڿ�\""+num+"/"+"�ǰ��� ������+real"+ real_value +"�Դϴ�");
	
				return null;
			}
	
	
	
	
	
	public static void main(String[] args) {
		//#�Լ��� �����ε�
		//-�����Լ� �̸����� �پ��� ������ �Լ��������Ѵ�.
		//-�ٸ������� �Լ��� �����ޱ� ���ؼ��� �Ű������� ���� Ȥ�� Ÿ���� �޶���Ѵ�.
		
		
		//println�� �پ��� �Ű����� Ÿ���� ���� �� �ֵ��� �����ε� �Ǿ��ִ�.
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("ù��°���ڸ� �Է��ϼ���>");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���<");
		int num2= sc.nextInt();		
		//1.
		System.out.println(Arrays.toString(range(num1,num2)));// �迭�� ����Ҷ��� Arrays.toString�� �̿� !
		//2.
		System.out.print("���ڸ� �Է��ϼ���>");
		int num3=sc.nextInt();
		System.out.println(Arrays.toString(range2(num3)));
		//3.
		String []fruit= {"apple","banana","orange"};
		System.out.println("������:"+Arrays.toString(fruit));
		System.out.println("������:"+join(fruit));
		//4.
		System.out.println("-------------------------------------");
		
		System.out.println(convert_base("100",10,2));
		//System.out.println(convert_base("100",1,2));
		System.out.println(convert_base("abcdef",10,2));
		
		
		
		
		
		
		
		
		
	}
}
