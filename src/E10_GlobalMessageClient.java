import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;



public class E10_GlobalMessageClient {
	public static void main(String[] args) {
		
		try {
			Socket s = new Socket("118.130.22.163",3455);
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			while (true) {
				// �������� ������ �޼����� ��ٸ�
				System.out.println(br.readLine());
			}
		} catch(Exception e) {
			System.err.println("err");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
