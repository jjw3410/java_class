package myobj.machine;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Main���� �������̽��� Ȱ���� �ڵ带 �ۼ��Ѵٸ� 
		// ����ϴ� Ŭ������ �ٸ� Ŭ������ �����ϰ� ��ü�� �� �ִ�
		ElectricSource test_battery = new ElectricSource() {			
			@Override
			public void consum(int power) {
				System.out.printf("���͸����� %d��ŭ�� ������ �Һ��߽��ϴ�\n"
						, power);				
			}
		};
		
		Scanner str_sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.print("<< ����Ϸ��� ���ڱ�� ���� >>\n> "); 
			
			String selected = str_sc.nextLine();
			
			Electronics e = null; 
			if (selected.toLowerCase().equals("cleaner")) {
				e = new Cleaner();
			} else {
				e = new MicroWave("�Ｚ ���ڷ���", 70);
			}			
		
			e.setConnect(test_battery);
			e.execute();
		}
	}
	
}








