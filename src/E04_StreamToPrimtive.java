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
			
			
		//�����͸� intȤ�� byte[]�� ��ȯ�� �ʿ䰡����	
		dout.writeInt(123);
		dout.writeBoolean(true);
		dout.writeFloat(123.123f);
		dout.writeDouble(432.4321);
		dout.writeLong(123457L);	
		dout.writeUTF("�ѱ�");
		dout.close();
		
		
		System.out.println("������¿Ϸ�!");
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			DataInputStream din= new DataInputStream(new BufferedInputStream(new FileInputStream("D:\\java_io\\dataout.txt")));
			
			
			
			//���� ������ �� ����ؼ� ������� ������ �Ѵ�
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
