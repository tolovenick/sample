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

		// ���� �ý����� �ٹٲ޹��� ��ȸ�ϱ�
		String newLineChar = System.getProperty("line.separator");
		System.out.println("abcdef"+newlineChar+"ghijk");

		//���� �ý����� ����� Ȩ ���丮 ��ȸ�ϱ�
		Strubg dir = System.getProperty("user.home");
		System.out.println(dir);
		}
}