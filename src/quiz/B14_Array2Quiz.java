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
		
//		//1.numArr의 총합과 평균(소수점 둘째자리까지)을 구해서 출력
//		//2.numArr의 각 행의 합과 열의 합을 모두 구해서 출력
//		//0행의 합:10+10+10+10
//		//0열의 합:10+90+800+300
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
//			System.out.println(i+"행의 합:"+sum2);
//			sum2=0;
//			
//		
//			
//		} 
//		
//		System.out.println("0열의합:"+col0);
//		System.out.println("1열의합:"+col1);
//		System.out.println("2열의합:"+col2);
//		System.out.println("3열의합:"+col3);
//		
//		System.out.println("numArr총합:"+sum);
//		System.out.printf("numArr평균:%.2f" ,(sum/count));
//		
		int[]rowsum=new int[numArr.length];
		int[]colsum=new int[4];
		for(int i=0;i<numArr.length;++i) {
			
			for(int j=0;j<numArr[i].length;++j) {
				rowsum[i]+=numArr[i][j];
				colsum[j]+= numArr[i][j];
				
				}
			}
		
			System.out.println("행의 합:"+Arrays.toString(rowsum));
			System.out.println("열의 합:"+Arrays.toString(colsum));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
