public class ArrayDemo3 {
	public static void main(String[] args) {
		int[] numbers = new int[3];

		// �迭�� ������ ��ġ�� ���� �����ϱ�
		// numbers[�ε���] = ��;

		numbers[0] = 12;
		numbers[1] = 23;
		numbers[2] = 56;

//		numbers[3] = 100;   3��°�� �߰��Ұ�� �Ʒ����� ������ ����
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
//		at ArrayDemo3.main(ArrayDemo3.java:11)

		for (int a : numbers ) {
			System.out.println(a);
		}
	}
}
