package practice_Class;

public class Student02 {
	
	//멤버변수
	int m_nKor;
	int m_nEng;
	int m_nMat;
	
	//멤버 변수의 값을 정해주는 set 메소드
	public void set(int a,int b,int c) {
		
		m_nKor=a;
		m_nEng=b;
		m_nMat=c;
	}
	
	//접근지정자가 public이고
	//반환값이 double형인
	//국,영,수의 평균을 구하는 함수
	public double calc() {
		double avg;
		avg=(m_nKor+m_nEng+m_nMat)/3.0;
		
		return avg;
	}
	
	//평균출력
	public void disp() {
		System.out.println("평균은"+calc()+"입니다");
	}
	
	
	
}
