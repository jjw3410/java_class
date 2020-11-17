import myob.C07_diffpackage;

public class C07_accessModifier extends C07_diffPackage{

	
	//# ���԰���(include)
	//-	����� ���� �ش� Ŭ������ �����ϴ� ��
	//- ���� ���� ���յ��� ���Ѵ�(b�� �ٲ�� a�� �ٲ�°� ) 
	
	//# ��������(dependency)
	//	- �ϳ��� Ŭ������ �ٸ� Ŭ������ ����ϴ°� 
	
	
	//	#���� ������(Access Modifier)
	//	- �ٸ� Ŭ������ �ش� Ŭ������ �ڿ��� ����Ϸ��� �� �� 
	//	- ��� ��ü���� �Ÿ��� ���� ��뿩�θ� �����Ѵ�
	
	
	//# ������ �� �ִ� �Ÿ��� ����
	//	-	���� Ŭ���� ������ �ٸ� �ڿ� (���� ����� �Ÿ�)
	//	-	���� ��Ű�� ������ �ٸ� �ڿ�
	//	-	�ٸ� ��Ű���� ������ ��ӹ��� �ڿ�
	//	-	�ٸ� ��Ű���� �ڿ�(���� �� �Ÿ�)
	
	
	//���� �������� ����
	//	- private		: ���� Ŭ���� ���ο����� ����� �� �ִ� �ڿ��� �ȴ�
	//	- �ƹ��͵� �� ��	: default.�ٸ� ��Ű�������� ����� �� ���� �ڿ��� �ȴ�
	//	- protected		: �ٸ� ��Ű�������� ����� ������ �� �� �ִ� �ڿ��� �ȴ�(���� ��Ű�������� �����Ӱ� ����� �����ϴ�)
	//	- public		: ���� �� �Ÿ������� �����Ӱ� �� �� �ִ� �ڿ��� �ȴ�(���� ��Ű�������� �����Ӱ� ����� ���� �ϴ�)
	
	//# ��ü������ ĸ��ȭ(Encapsulation)
	//- ���� �����ڸ� Ȱ���� �ٸ� Ŭ�������Դ� ������ �ʿ���� �ڿ�(����/�޼���)�� �����ϴ� ���� ���Ѵ�.
	//
	
	public static void main(String[] args) {
		 
		//#���� ��Ű�� ������ �ڿ��� private�� �����ϰ� ��� ���δ�
		System.out.println(C07_samePackage.package_sInt);
		System.out.println(C07_samePackage.protected_sInt);
		System.out.println(C07_samePackage.public_sInt);
		
		C07_samePackage same_package_instance=new C07_samePackage();
		
		System.out.println(same_package_instance.package_int);
		System.out.println(same_package_instance.protected_Int);
		System.out.println(same_package_instance.public_Int);
		
		//#�ٸ� ��Ű���� �ڿ��� ����� ������ protected���� ���δ�.(visible)
		System.out.println(C07_diffpackage.public_sInt);
		
		
		//# ��ӹ��� ��ü�� �ν��Ͻ��� protected �ڿ��� �����Ҽ� �ִ�.
		
		
	}
}
	