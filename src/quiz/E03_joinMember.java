package quiz;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class E03_joinMember {

	//1.사용자가 자신의 개인정보를 입력하면 그정보를 사용자의 이름으로 된 파일에 저장해보세요
	//2.사용자의 이름을 전달받으면 해당 사용자가 
	// 가입된 회원이라면 파일에서 정보를 읽어 출력해주고
	// 아직 가입되지 않은 사람이라면 가입되지 않았다고 출력하는 메서드를 작성해보세요
	// ※java_io/member/디렉토리에 저장할것
	
	
	static class Member{
		String name;
		int age;
		String blood_type;
		String tel;
		
		public Member(String name,int age,String blood_type,String tel) {
			this.name=name;
			this.age=age;
			this.blood_type=blood_type;
			this.tel=tel;
		}
	
	public Member update(Member to_update) {
		
		return new Member(
				to_update.name==null?this.name:to_update.name,
				to_update.age==-1?this.age:to_update.age,
				to_update.blood_type==null?this.blood_type:to_update.blood_type,
				to_update.tel==null?this.tel:to_update.tel		
				
		);
				
	}
	
		@Override
		public String toString() {
			return String.format("%s/%d/%s/%s",name,age,blood_type,tel);
		}
	}
		
		public static boolean checkNotMember(String name) throws IOException {
			String dir="D:\\java_io\\member\\";
			String fillename=name+".txt";
			BufferedReader br=null;
			try {
			 br=new BufferedReader(
						new FileReader(
								dir+fillename,
								Charset.forName("UTF-8")
						)
				);
				
			 	
			 	String[] data=br.readLine().split("/");		
			 	System.out.printf("<<%s님의 정보>>",data[0]);
			 	System.out.println("이름:"+data[0]);
			 	System.out.println("나이:"+data[1]);
			 	System.out.println("혈액형:"+data[2]);
			 	System.out.println("Tel:"+data[3]);
			 	
			 	
				return false;
				
			} catch (FileNotFoundException e) {
				System.out.println("[System]-회원가입을 진행합니다");
				return true;
			}finally {
				if(br!=null)br.close();
			}	
		}
		
	public static void modify(Member to_update) throws IOException {
		
		//to_update에 혈액형만 오면 나머지는 유지되고 혈액형만 수정되도록 만들기
		
		String dir="D:\\java_io\\member\\";
		String fillename=to_update.name+".txt";
		
		// 우선 기존데이터를 읽어들인다
		BufferedReader br=null;
		PrintWriter pw=null;
		try {
		 br=new BufferedReader(new FileReader(
				dir+fillename,Charset.forName("UTF-8")));
		String[]data=br.readLine().split("/");
		
		Member before=new Member(
				data[0],
				Integer.parseInt(data[1]),
				data[2],
				data[3]);
		
		//기본데이터를 새로운 데이터로 덮어쓴다
		Member after= before.update(to_update);
		
		//완성된 데이터를 파일에 덮어쓴다
		
		pw=new PrintWriter(
				new BufferedWriter(
						new FileWriter(dir+fillename,
								Charset.forName("UTF-8")
						)
				)
		);
				
		
		//Member클래스의 toString을 이용한다
		pw.print(after);
		
		}finally {
			if(br!=null)br.close(); 
			if(pw!=null)pw.close();	
			
		}
		
	}
		
	
	public static void save(Member info) throws IOException {
		
		String dir="D:\\java_io\\member\\";
		String fillename=info.name+".txt";
		
	
		PrintWriter pw=new PrintWriter(
				new BufferedWriter(
						new FileWriter(
								dir+fillename,
								Charset.forName("UTF-8")
								)
						)
				);
		pw.print(info);
		pw.close();
		
		
	}

	
	public static void main(String[] args) throws IOException {
		//String str=br.readLine();
		
		Member to_update=new Member("김길동",-1,"B",null);
		modify(to_update);
		
		
		
//		try {
//			//InputStreamReader: InputStream을 문자로 변환(byte->char)
//			BufferedReader br=new BufferedReader(
//					new InputStreamReader(System.in));
//			
//			System.out.print("이름>");
//			String name=br.readLine();
//			
//			if(checkNotMember(name)) {
//				System.out.print("나이>");
//				int age=Integer.parseInt(br.readLine());
//				
//				System.out.println("혈액형>");
//				String blood_type=br.readLine();
//				
//				
//				System.out.println("전화번호>");
//				String tel=br.readLine();
//				
//				
//				
//				save(new Member(name,age,blood_type,tel));
//				br.close();
//				
//			}
//			
//			
//			
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	
	}

	
	
}
