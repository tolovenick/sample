public class StringDemo {
	
	public static void main(String[] args) {
	
		/*
			String Ŭ����
				String Ŭ������ ���ڿ��� ǥ���Ѵ�.
				String���� �Һ����̴�. �ѹ� ������� ���Ŀ��� ������ �� ����.
				String�� ��ü�� �����ϴ� Ư���� ����� �����Ѵ�.
					String str = new String("abc");	// �����ڸ� �̿��� String��ü ����
					String str = "abc";				// ���ڿ� ǥ������ �̿��� String��ü ����

				Employee emp = new Employee();
		*/

		String str8 = "�ڹ� ���α׷��� ����";
		
		// ���ڿ����� ������ ���ڿ��� ó������ �����ϴ� ��ġ�� ��ȯ�ϴ� �޼ҵ� : int indexOf(String str)
		int index = str8.indexOf("��");
		System.out.println("���ڿ����� [��]�̶�� ���ڰ� ó������ �����ϴ� ��ġ��? " + index);

		// ���ڿ����� ������ ������ ���ڿ��� ��ü�� ���ο� ���ڿ��� ��ȯ�ϴ� �޼ҵ� : String replace(String
		String str9 = str8.replace("�ڹ�", "���̽�");
		System.out.println("str8["+str8+"]");
		System.out.println("str9["+str9+"]");

		// ���ڿ����� ������ ��ġ���� ������ ���ڿ��� �߶� ��ȯ�ϴ� �޼ҵ� : String substring(int beginIndex)
		String str10 = "abcdefghjklmn";
		String sub1 = str10.substring(5);
		System.out.println("5��°���� �߶� ���ڿ�: " +sub1);

		// ���ڿ����� ������ ������ ���ڿ��� �߶� ��ȯ�ϴ� �޼ҵ� : String substring(int begin, int end)
		// ������ġ�� ���Եǰ�, ����ġ�� ���Ե��� �ʴ´�.
		String sub2 = str10.substring(0, 4);
		System.out.println("0������ 4���ձ��� �߶� ���ڿ�: " + sub2);

		String name = "ȫ�浿";
		String familyName = name.substring(0, 1);
		System.out.println("��: " + familyName);

		// ���ڿ��� ������ �����ڸ� �������� �߶� �迭�� ��ȯ�ϴ� �޼ҵ�: String[] split(String delim)
		String text =  "����, ���,��õ, ����, �λ�, ����, ���, �뱸";
		String[] area = text.split(",");
		System.out.println(area[0]);
		System.out.println(area[2]);

		//���ڿ��� �ҹ���/�빮�ڷ� ��ȯ�� ���ο� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
		//String toUpperCase(), String toLowerCase()
		String str11 = "sony";
		String str12 = str11.toUpperCase();
		System.out.println("str11 ["+str11+"]");
		System.out.println("str12 ["+str12+"]");

		// ����, �Ǽ�, �Ҹ���, ��Ÿ ���� ������ ������ ���ڿ��� ��ȯ�ؼ� ��ȯ�ϴ� ���� �޼ҵ�
		// String valueOf(int value), String valueOf(double value), String valueOf(boolean value)
		int number = 1234;
		// ���� 123�� ���ڿ� "123"���� ��ȯ�ؼ� ��ȯ�Ѵ�.
		String str13 = String.valueOf(number);
		System.out.println("���� �ڸ���: " + str13.substring(str13.length()-1));\

		String str14 =1234 + "";

	}
}