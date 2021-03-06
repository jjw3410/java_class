import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E04_StreamToPrimtive {

	public static void main(String[] args) {
		try {
			DataOutputStream dout=new DataOutputStream(new BufferedOutputStream(new FileOutputStream("D:\\java_io\\dataout.txt"),2048));
			
			
		//데이터를 int혹은 byte[]로 변환할 필요가없다	
		dout.writeInt(123);
		dout.writeBoolean(true);
		dout.writeFloat(123.123f);
		dout.writeDouble(432.4321);
		dout.writeLong(123457L);	
		dout.writeUTF("한글");
		dout.close();
		
		
		System.out.println("파일출력완료!");
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			DataInputStream din= new DataInputStream(new BufferedInputStream(new FileInputStream("D:\\java_io\\dataout.txt")));
			
			
			
			//썻던 순서를 잘 기억해서 순서대로 꺼내야 한다
			int data1=din.readInt();
			boolean data2=din.readBoolean();
			float data3=din.readFloat();
			double data4=din.readDouble();
			long data5=din.readLong();
			String data6=din.readUTF();
			
			System.out.println("data1:"+data1);
			System.out.println("data2:"+data2);
			System.out.println("data3:"+data3);
			System.out.println("data4:"+data4);
			System.out.println("data5:"+data5);
			System.out.println("data6:"+data6);
			
			din.close();	
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
