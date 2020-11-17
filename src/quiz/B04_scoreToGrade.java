package quiz;

import java.util.Scanner;

public class B04_scoreToGrade {
	
	//점수를 입력받으면 해당하는 등급을 출력해주는 프로그램을 만드시오.
	//90점이상 A등급
	//80점이상 B등급
	//70점이상 C등급
	//60점이상 D등급
	//그 외 F등급
	
	
	public static void main(String[]args) {
		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("점수를 입력하세요.>");
//		
//		int score=sc.nextInt();
//		
//		if(score<0) {
//			System.out.println("점수를 다시입력하세요.");
//		}else if (score>100) {
//			System.out.println("점수를 다시 입력하세요.");
//		}
//		// return,main()을 끝낸다.
//		// system.exit(0); //프로그램을 종료한다
//		else if(score>=90) {
//			System.out.printf("입력받은 점수:%d, A등급입니다.",score);
//		}else if(score>=80) {
//			System.out.printf("입력받은 점수:%d, B등급입니다.",score);
//		}else if(score>=70) {
//			System.out.printf("입력받은 점수:%d, C등급입니다.",score);
//		}else if(score>=60) {
//			System.out.printf("입력받은 점수:%d, D등급입니다.",score);
//		}else  {
//			System.out.printf("입력받은 점수:%d, F등급입니다.",score);
//		}
//		System.out.println();
//		System.out.println("프로그램을 종료합니다.");
		
		
		//점수를 입력받으면 해당하는 등급을 출력해주는 프로그램을 만드시오.
		//90점이상 A등급
		//80점이상 B등급
		//70점이상 C등급
		//60점이상 D등급
		//그 외 F등급
		
		Scanner sc=new Scanner(System.in);
		System.out.print("점수를 입력하세요>");
		int score = sc.nextInt();
		
		if(score<0) {
			System.out.println("점수를 다시 입력하세요");
		}else if(score>100) {
				System.out.println("점수를 다시 입력하세요.");
			}
		
		else if(score>=90) {
			System.out.printf("입력하신점수:%d,A등급입니다",score);
		}else if(score>=80) {
			System.out.printf("입력하신점수:%d,B등급입니다",score);
		}else if(score>=70) {
			System.out.printf("입력하신점수:%d,c등급입니다",score);
		}else if(score>=60) {
			System.out.printf("입력하신점수:%d,d등급입니다",score);
		}else 
			System.out.printf("입력하신점수:%d,f등급입니다",score);
		}
		
		
	
		
	}



