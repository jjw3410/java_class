package practice_Class;

public class StudentBean {
	
	//멤버필드 선언
	int kor;
	int eng;
	int mat;
	
	//매개변수가 없는 생성자
	public StudentBean() {
		System.out.println("기본 생성자");
	}
	
	//매개변수가 존재하는 생성자 (위 생성자 메소드 오버로딩)
	public StudentBean(int a, int b, int c) {
		
		//this(); 를 쓰면 위의 생성자멤버필드에 일일이 this.을 안써도 된다. 
		this.kor=a;
		this.eng=b;
		this.mat=c;
	}

	//결과값 출력 메소드
	public void disp() {
	
		System.out.println("국어 점수의 값:"+kor);
		System.out.println("영어 점수의 값:"+eng);
		System.out.println("수학 점수의 값:"+mat);
	}
}
