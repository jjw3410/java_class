package quiz;

import java.util.Arrays;

public class B14_Array2Quiz {
	public static void main(String[] args) {
		
		
		int[][] numArr= {
				{10,10,10,10},//numArr[0][0],01,02,03
				{90,50,30,70},//10,11,12,13
				{800,500},//20,21
				{300,300,300}//30,31,32
		};
		
//		//1.numArr�� ���հ� ���(�Ҽ��� ��°�ڸ�����)�� ���ؼ� ���
//		//2.numArr�� �� ���� �հ� ���� ���� ��� ���ؼ� ���
//		//0���� ��:10+10+10+10
//		//0���� ��:10+90+800+300
//		double sum=0;
//		int count=0;
//		int sum2=0;
//		int col0=0;
//		int col1=0;
//		int col2=0;
//		int col3=0;
//		for (int i=0;i<numArr.length;++i) {
//			
//			for (int j=0;j<numArr[i].length;++j) {
//				
//				sum+=numArr[i][j];
//				count++;
//				sum2+=numArr[i][j];		
//				
//				if (j==0) {
//					col0+=numArr[i][j];	
//				}else if (j==1) {
//					col1+=numArr[i][j];	
//				}else if (j==2) {
//					col2+=numArr[i][j];	
//				}else {
//					col3+=numArr[i][j];	
//				}
//			
//			}
//			
//			System.out.println(i+"���� ��:"+sum2);
//			sum2=0;
//			
//		
//			
//		} 
//		
//		System.out.println("0������:"+col0);
//		System.out.println("1������:"+col1);
//		System.out.println("2������:"+col2);
//		System.out.println("3������:"+col3);
//		
//		System.out.println("numArr����:"+sum);
//		System.out.printf("numArr���:%.2f" ,(sum/count));
//		
		int[]rowsum=new int[numArr.length];
		int[]colsum=new int[4];
		for(int i=0;i<numArr.length;++i) {
			
			for(int j=0;j<numArr[i].length;++j) {
				rowsum[i]+=numArr[i][j];
				colsum[j]+= numArr[i][j];
				
				}
			}
		
			System.out.println("���� ��:"+Arrays.toString(rowsum));
			System.out.println("���� ��:"+Arrays.toString(colsum));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
