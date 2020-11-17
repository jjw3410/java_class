package practice_Class;

public class Overloading {

	
}



class Student{
	
	int kor_s;
	int mat_s;
	int eng_s;
	
	public void set(int a,int b, int c){
		
		this.kor_s=a;
		this.mat_s=b;
		this.eng_s=c;
	}
	public void set(int a,int b){
		
		this.kor_s=a;
		this.mat_s=b;
		this.eng_s=0;
	}
	
	public double calc() {
		
		double avg;
		avg=(kor_s+mat_s+eng_s)/3.0;
		return avg;
	}
	
	void result() {
		
		System.out.println("평균은"+calc()+"입니다");
		
	}
	
	
}


