package practice_Class;

public class ConstructorTest {

	public static void main(String[] args) {
		//오버로딩 된 생성자 호출
		StudentBean student01=new StudentBean(100,60,80);
		//매개변수가 없는 생성자 호출
		StudentBean student02=new StudentBean();
		
		//결과 값 출력하는 메소드 호출
			student01.disp();
			student02.disp();
			
	}
	
	
}
