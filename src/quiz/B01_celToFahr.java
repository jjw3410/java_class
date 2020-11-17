

package quiz;

import java.util.Scanner;

public class B01_celToFahr {

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("¼·¾¾¿Âµµ¸¦ ÀÔ·ÂÇÏ¼¼¿ä>");
		
		float s=sc.nextFloat();
		
		System.out.printf("¼·¾¾¿Âµµ:%.1f¡É, ¼·¾¾¿Âµµ¸¦È­¾¾¿Âµµ·Î:%.1f¢µ\n",s,(s*1.8)+32);
		
	}
}
