
public class C12_tryCatchFinally {

	//#����ó��
	//	- �츮�� ������� �˰��ִ� ���� �۾����� ����(Exception)��� �θ���.
	//	- ���������� Ʋ������ ���ܰ� �ƴ϶� �����̴�.
	//	- ���α׷��Ӱ� ���ܿ� ���� ������ ��ġ�� �����شٸ� ���α׷��� �������������ʰ� ����ؼ� �����ϰ� �ȴ�.
	
	//#try
	// - ���ܰ� �߻��� �� �ִ� �ڵ带 try�� ���ο� ���Խ�Ų��
	// - ���ܰ� �߻����� ������ ���� ����ȴ�
	// - ���ܰ� �߻��Ѵٸ� �ش� ���ܸ� �޴� catch������ �Ѿ�� �ȴ�
	// - catch���� ������ ��밡��
	
	
	//#catch
	//- try�� ������ �ڵ忡�� ���ܰ� �߻��ϸ� �ش� catch������ �̵��Ѵ�.
	//- ù ���� �Ű������� �ش� ���ܿ� ���� ������ ����ִ� ��ü�� �޴´�
	//- catch���� ��ø����� �����ϴ�
	//- ExceptionŸ���� catch���� ��� ���ܸ� catch�Ҽ� �ִ�.
	//	��Exception: ��翹���� �θ� Ÿ��
	
	//# finally
	//- try�� ������ ���� �߻� ���ο� ������� ������ ����Ǵ� ����
	
	
	
	public static void main(String[] args) {
		
		int [] abc=new int[0];
		try {
			System.out.println("try���� ����");
			
			System.out.println(abc[85]);	// ���� �߻� �ڵ�
			
			//Integer.parseInt(str)= ���ڿ��� intŸ���� ������ ��ȯ�ϴ� �޼���
			System.out.println(Integer.parseInt("123"));//���ܹ߻��ڵ� 2
			
			System.out.printf("%d",12);
			
			System.out.println("try���� ������");
			
		} catch(Exception e) {//
			System.out.println("catch:"+e.getMessage());
		} finally {
			System.out.println(" /)/)");
			System.out.println("(.. )");
			System.out.println("��<  )");
		}
		
	}
}

