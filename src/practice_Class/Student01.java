package practice_Class;

public class Student01 {
	
	int kor_s;
	int eng_s;
	int mat_s;
	
	static int total;
	static int avg;
	
		
		//static

	public Student01(int kor_s,int eng_s,int mat_s) {
		
		this.kor_s=kor_s;
		this.eng_s=eng_s;
		this.mat_s=mat_s;
		
		total=kor_s+eng_s+mat_s;
		avg=total/3;
		
	}
		
	
		
	
	
	public Student01() {
			// TODO Auto-generated constructor stub
		}





	public static void main(String[] args) {
		
		Student01 st=new Student01();
		
		st.kor_s=80;
		st.eng_s=100;
		st.mat_s=90;
		
		System.out.println(total);
		System.out.println(avg);
				
		
	}
	
	
}




	