package quiz;


public class B13_count_letter {
	
	public static void main(String[] args) {
		
		//사용자로부터 문장을 하나 입력받았다 치고 해당 문장에 어떤 알파벳이 몇번 등장했는지 세어서 출력해보세요.(대소문자 구분 x)
		
				//65~90   ,97~122
		
		String msg="hello,world!";
		
		char[]msgArr=msg.toUpperCase().toCharArray();//입력받은 문자 대문자로 변경
		
		int[]alpa_count=new int[26];// 입력받은 문자의 알파벳 개수를 세기 위한  배열 만듬.
		
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
//				System.out.printf("%c가등장한 횟수는 %d번이다.\n",i+'a',count_Lower[i]);
//				}
//				else if (count_UP[i]>0){
//				
//				System.out.printf("%c가 등장한 횟수는 %d번이다.\n",i+'A',count_UP[i]);
//				
//				}
//				else if (count_num[i]>0) {
//					System.out.printf("%c가 등장한 횟수는 %d번이다.\n",i+0,count_num[i]);
//				}
//		
//			}
		
		
		
		
		
		
		
		
	}

}
