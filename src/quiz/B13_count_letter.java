package quiz;


public class B13_count_letter {
	
	public static void main(String[] args) {
		
		//����ڷκ��� ������ �ϳ� �Է¹޾Ҵ� ġ�� �ش� ���忡 � ���ĺ��� ��� �����ߴ��� ��� ����غ�����.(��ҹ��� ���� x)
		
				//65~90   ,97~122
		
		String msg="hello,world!";
		
		char[]msgArr=msg.toUpperCase().toCharArray();//�Է¹��� ���� �빮�ڷ� ����
		
		int[]alpa_count=new int[26];// �Է¹��� ������ ���ĺ� ������ ���� ����  �迭 ����.
		
		for (int i=0;i<msgArr.length;++i) {
			
			int alpa_index=msgArr[i]-'A';//
			
			if(alpa_index>=0&&alpa_index<=25) {
				
				alpa_count[alpa_index]+=1;
				
			}
		}
		
		for (int i=0;i<alpa_count.length;++i) {
			System.out.printf((char)('A'+i)+":",alpa_count);
		}
		
		
		
		
		
		
//		String str="asdsadasdASDV1382";
//	
//		
//		int[] count_Lower=new int[26];
//		int[] count_UP=new int[26];
//		int[] count_num=new int[26];
//	
//		
//		
//		for (int i=0; i<str.length();++i) {
//			
//			char ch=str.charAt(i);
//			
//			if(ch>='a'&& ch<='z') {
//			
//				count_Lower[ch='a']+=1;
//			
//			}
//			else if (ch>='A'&& ch<='Z') {
//				count_UP[ch='A']+=1;
//			}
//			else if (ch>=0 && ch<=9) {
//				 count_num[ch=0]+=1;		
//			}
//			
//			
//		}
//		
//			for(int i=0; i<26;++i) {
//			if(count_Lower[i]>0) {
//				System.out.printf("%c�������� Ƚ���� %d���̴�.\n",i+'a',count_Lower[i]);
//				}
//				else if (count_UP[i]>0){
//				
//				System.out.printf("%c�� ������ Ƚ���� %d���̴�.\n",i+'A',count_UP[i]);
//				
//				}
//				else if (count_num[i]>0) {
//					System.out.printf("%c�� ������ Ƚ���� %d���̴�.\n",i+0,count_num[i]);
//				}
//		
//			}
		
		
		
		
		
		
		
		
	}

}
