package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class D01_StudentList {

	private static String total;

	//�л� Ŭ������ ��ҷ� �޴� ArrayList��(group) �����ϰ�
	//�л��� 30�� �߰��غ�����
	
	//1.30���� ������ �ڵ����� �����ǵ��� ����� ������
	
	//2.��� �л��� �� ������ ��������� ���غ�����.
	
	//3.�� ����� ���غ�����
	
	
	public static void main(String[] args) {
		
		int sum=0;
		int stu_num=30;
		
		ArrayList<Student>group01=new ArrayList<>();
		
		
		for(int i=0;i<30;++i) {
			group01.add(new Student());
			sum+=group01.get(i).avg;
		}
		
		//println �Լ��� ��� �ش� ��ü�� toString()�޼��带 ȣ���Ѵ�
		
		
		
		for(int i=0;i<30;++i) {
		System.out.println(group01.get(i));
		}
		
		System.out.println("�����: "+sum/stu_num);
		
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
		this.name=String.format("�׽�Ʈ�л�%04d",stu_count++);
		
		total=kor+eng+math;
		avg=total/(double) HOW_MANY_SUBBJECTS;
		
	}
	
	
	
	
	//�� toStrig()�� Object Ŭ������ �޼����̱� ������ ��� ��ü�� �������ִ�
	@Override
	public String toString() {
		// �� ��ü�� ���ڿ��� ǥ���Ѵٸ� �����ϱ�? �� ���� ���Ǹ� �ϴ� �޼���
		
		//String.format()
		//printfó�� ������ �̿��Ͽ� ���ϴ� ���ڿ��� �����ϴ� �޼���
		//return "["+name+"/"+total+"/"+avg+"]";
		
		return String.format("[%s/%d/%.2f]",name,total,avg);   //Ŭ���� �̸��� .��� ���� static
		
		
	}

	
	
	
	
	
	
	
}
