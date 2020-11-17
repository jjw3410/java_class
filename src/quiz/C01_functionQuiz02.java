package quiz;

import java.util.Arrays;
import java.util.Scanner;
public class C01_functionQuiz02 {
	//1.최소값과 최대 값을 매개변수로 받으면 그 사이의 모든값을 포함하는 int배열을 생성하여 반환하는 range함수를 만들어 보세요.(최소값이상,최대값 미만)
	//2.최대값을 매개변수로 전달 받으면,0부터 최대값 미만의 값을 포함하는 range2 함수를 만들어보세요.
	//3.문자열 배열을 전달 받으면,해당 배열을 모두 "/" 를이어붙이는 함수를 만들어보세요.
	//ex:"apple","banana","orange"
	//	->apple/banana/orange
	//4.문자열 타입의 숫자,원래 진법(base_from),바꾸려는 진법(base_to)를 전달 받으면 base_from의 진법이었던 해당 num을 base_to진법의 문자열로 변환하여 반환하는 함수를 만들어 보세요
	//만약,진법이 잘못된경우 null을 반환합니다.
	
						







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
				
				return str2.toString();  //str2는 문자열이 아니기 때문에 문자열로 변경해야한다.
				
			
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
					System.err.println("사용가능한 진법은 2부터 36입니다.");
					return null;
				}
				
				int pow=num.length() -1;
				long real_value=0;
				for(int i=pow;i>-1;--i) {
					char digit=num.charAt(pow-i);
					int value=getValue(digit);
				
					System.out.println(digit);
					System.out.println("\t실제값:"+value);
					System.out.println("\t"+Math.pow(base_from, i)+"의 자리");
				
					real_value+=value*Math.pow(base_from,i);
				}
				
				System.out.println(base_from+"진법 문자열\""+num+"/"+"의값은 실제로+real"+ real_value +"입니다");
	
				return null;
			}
	
	
	
	
	
	public static void main(String[] args) {
		//#함수의 오버로딩
		//-같은함수 이름으로 다양한 형태의 함수를정의한다.
		//-다른형태의 함수로 인정받기 위해서는 매개변수의 개수 혹은 타입이 달라야한다.
		
		
		//println은 다양한 매개변수 타입을 받을 수 있도록 오버로딩 되어있다.
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째숫자를 입력하세요>");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요<");
		int num2= sc.nextInt();		
		//1.
		System.out.println(Arrays.toString(range(num1,num2)));// 배열을 출력할때는 Arrays.toString를 이용 !
		//2.
		System.out.print("숫자를 입력하세요>");
		int num3=sc.nextInt();
		System.out.println(Arrays.toString(range2(num3)));
		//3.
		String []fruit= {"apple","banana","orange"};
		System.out.println("변경전:"+Arrays.toString(fruit));
		System.out.println("변경후:"+join(fruit));
		//4.
		System.out.println("-------------------------------------");
		
		System.out.println(convert_base("100",10,2));
		//System.out.println(convert_base("100",1,2));
		System.out.println(convert_base("abcdef",10,2));
		
		
		
		
		
		
		
		
		
	}
}
