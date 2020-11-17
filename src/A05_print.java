
public class A05_print {

	public static void main(String[]args) {
		
		//#�ֿܼ� ����ϱ� ���� �������� �Լ���
		
		//1.print()
		//-���� �ڵ����� �ٲ��� ������ ����ϴ� �Լ�
		System.out.print("Hello, world!");
		System.out.print("Hello, world!");
		System.out.print("Hello, world!");
		
		//2.println(_)
		//-���� �ڵ����� �ٲٸ� ����ϴ� �Լ�
		//-()�� ������ ������ �� �ڿ� '\n'�� �߰��Ͽ� ����Ѵ�
		//-()�� �ƹ��͵� �������� ������ '\n'�� ����Ѵ�.
		System.out.println("Hello, world!");
		
		//3.printf()
		//- ���Ĺ��ڸ� �̿��� ����� �� �ִ� �Լ�
		//- ������ �̿��ϴ°� ���� ��찡 ����.
		
		//2020�� 10�� 20�� ���� 9:20:30
		int year= 2020;
		int month=10;
		int day=20;
		
		//System.out.println(year+"��"+month+"��"+day+"��");
		System.out.printf("%d�� %d�� %d��\n",year,month,day);
		
		//# printf�� ����ϴ� ���Ĺ��ڵ�
		// %d : 10���� ����(decimal)
		// %x,X : 16���� ����(hexa decimal)  ��ҹ��� ���� ����
		System.out.printf("%x %X\n",10,10);
		// %o : 8���� ���� (octal)
		// %s : ���ڿ�(String)
		// %c : ����(character)
		// %f : �Ǽ�
		System.out.printf("����� �ſ����� '%s'�Դϴ�\n","1���");
		System.out.printf("%d[%c],%x(16),%o(8)\n",65,65,65,65);
		
		//# ���Ĺ��� �ɼ�
		//- d�� ������ϴ°��� �ƴ�
		
		//%����d: ���ڸ�ŭ ĭ�� Ȯ���Ͽ� ����Ѵ�.
		System.out.printf("�̸�: %20s\n","Hong gildong");
		System.out.printf("����: %20d\n",15);
		
		//%-����d: ���ڸ�ŭ ĭ�� Ȯ���� �� ���� ���� �Ͽ� ����Ѵ�.
		System.out.printf("%-10s:Hong gildong\n","Full name");
		System.out.printf("%-10s:15\n","Age");
		//%0����d:���ڸ�ŭ ĭ�� Ȯ���� �� �� ĭ�� 0�� ä�� ����Ѵ�.
		System.out.printf("%010d\n",123);
		System.out.printf("%010f\n",123.123);
		
		//%+����d: ��� �տ��� ��ȣ�� ���̰� �ȴ�.
		System.out.printf("������ ���� %+d���Դϴ�.\n",20);
		
		//%.����f:�Ҽ� �ڸ����� �����Ѵ�
		System.out.printf("%.3f\n",123.123);
		System.out.printf("%f\n",123.123);
		System.out.printf("%.10f\n",123.123);
		System.out.printf("%.20f\n",123.123);
		System.out.printf("%.255f\n",123.123);
		
		
		
	}
}
