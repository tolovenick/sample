public class SystemDemo {

	public static void main(String[] args) {
	
		// ���� �ð����� �˾Ƴ���
		long time = System.currentTimeMillis();
		System.out.println(time);

		long nanoTime = System.nanoTime();
		System.out.println(nanoTime);


		// ȯ�溯���� ��ȸ�ϱ�

		String value1 = System.getenv("JAVA_HOME");
		System.out.println(value1);
		String value2 = System.getenv("PATH");
		System.out.println(value2);
		}
}