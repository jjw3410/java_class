package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class D01_StudentList {

	private static String total;

	//학생 클래스를 요소로 받는 ArrayList를(group) 생성하고
	//학생을 30명 추가해보세요
	
	//1.30명의 점수가 자동으로 설정되도록 만들어 보세요
	
	//2.모든 학생의 총 점수와 평균점수를 구해보세요.
	
	//3.반 평균을 구해보세요
	
	
	public static void main(String[] args) {
		
		int sum=0;
		int stu_num=30;
		
		ArrayList<Student>group01=new ArrayList<>();
		
		
		for(int i=0;i<30;++i) {
			group01.add(new Student());
			sum+=group01.get(i).avg;
		}
		
		//println 함수는 사실 해당 객체의 toString()메서드를 호출한다
		
		
		
		for(int i=0;i<30;++i) {
		System.out.println(group01.get(i));
		}
		
		System.out.println("반평균: "+sum/stu_num);
		
	}
	
}
	   

 class Student{

	private int kor,eng,math;
	private int total;
	private String name;
	double avg;
	
	
	
	
	static int stu_count=0;
	final static int HOW_MANY_SUBBJECTS=3;
	
	
	public Student(){
	
		Random ran=new Random();
		
		this.kor=ran.nextInt(51)+50;
		this.eng=ran.nextInt(51)+50;
		this.math=ran.nextInt(51)+50;
		this.name=String.format("테스트학생%04d",stu_count++);
		
		total=kor+eng+math;
		avg=total/(double) HOW_MANY_SUBBJECTS;
		
	}
	
	
	
	
	//※ toStrig()은 Object 클래스의 메서드이기 때문에 모든 객체가 가지고있다
	@Override
	public String toString() {
		// 이 객체를 문자열로 표현한다면 무엇일까? 에 대한 정의를 하는 메서드
		
		//String.format()
		//printf처럼 서식을 이용하여 원하는 문자열을 생성하는 메서드
		//return "["+name+"/"+total+"/"+avg+"]";
		
		return String.format("[%s/%d/%.2f]",name,total,avg);   //클래스 이름에 .찍고 쓰면 static
		
		
	}

	
	
	
	
	
	
	
}
