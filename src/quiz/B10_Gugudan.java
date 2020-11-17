package quiz;

public class B10_Gugudan {
	public static void main(String[] args) {
		//1.구구단을 가로로 출력
		//2.구구단을 세로로 출력
		
		
//		for(int dan=2;dan<=9;++dan) {
//			System.out.printf("%d단 : ",dan);
//			for (int gop=1;gop<=9;++gop) {
//				System.out.printf(" %dx%d=%d",dan,gop,dan*gop);
//			}System.out.println();
//		}
//		System.out.println();
//		
//		
//		for (int gop=0;gop<=9;++gop) {
//			//줄의시작
//			System.out.println();
//			for (int dan=2;dan<=9;++dan) {
//				if(gop==0) {
//					System.out.printf("%d단\t",dan);
//				}else {
//					System.out.printf("%dx%d:%d\t",dan,gop,dan*gop);
//				}
//					
//				
//			}
//		
//		}
		
				//1.구구단을 가로로 출력
				//2.구구단을 세로로 출력
		
		
		for(int dan=2;dan<10;dan++) {
			
			System.out.printf("%d단:",dan);
			
			for(int gop=1;gop<=9;++gop) {
				System.out.printf(" %dx%d=%d",dan,gop,dan*gop);
			}
			System.out.println();// 숫자를 9까지 곱하고 다음 단으로 넘어갈때 한줄 띄어준다.
		}
		
		System.out.println();
		
		for (int gop=0;gop<=9;gop++) {
			System.out.println();
			for (int dan=2;dan<=9;++dan) {
				if(gop==0) {
					System.out.printf("%d단\t",dan);
				}else {
					System.out.printf("%dx%d=%d\t",dan,gop,dan*gop);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
