
public class B02_operator02 {
	
	public static void main(String[]args) {
		
		//#�񱳿���
		//- �� ������ ����� �� �Ǵ� �����̴�.(booleanŸ��)
		//- ��� ����� �� ������ �Բ� ������ ��� ������ ���� ����Ѵ�.
		
		int a=7, b=9;
		
		
		System.out.println("a>b:"+(a>b));
		System.out.println("a<b:"+(a<b));
		System.out.println("a>=b:"+(a>=b));
		System.out.println("a<=b:"+(a<=b)); //�ε�ȣ ǥ�ð� ���� ������ �ȵ� 
		
		System.out.println("a==b:"+(a==b));//������  true
		System.out.println("a!=b:"+(a!=b));//�ٸ���  true
		
		//#������
		//-boolean �� �ΰ��� �ϴ� ����
		//-&&: �� ���� ��� true �϶��� (and)
		//-||: �� ���� �ϳ��� true ���� true(or)
		//-! : true�� false, false�̸� true (not)
		
		System.out.println("####AND####");
		System.out.println(true && true);
		System.out.println(true && true);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("####or####");
		System.out.println(true || true);
		System.out.println(true || true);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("####not####");
		System.out.println(!true);
		System.out.println(!false);
		
		
		
		
	}

}
