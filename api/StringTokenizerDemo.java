import java.util.StringTokenizer;

public class StringTokenizerDemo {
	
	public static void main(String[] args) {
	
		String text = "World's coolest vintage coffee shops? The classic kissaten is retro in design: mirrors, dark paneling and elaborate light fixtures and replica paintings from the European masters.";
		
		/*
		StringTokenizer st = new StringTokenizer(text);

		int length = st.countTokens();
		System.out.println("�ܾ� ����: " + length);

		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			System.out.println("���� ��ū ����: " + st.countTokens());
		*/

		String[] tokens = text.split(" ");
		System.out.println("�ܾ��: " + tokens.length);
			/*
				StringTokenizer
					- ���ڿ��� �����ڸ� �������� �߶� ��ū���� �����.
					- new StringTokenizer(�ؽ�Ʈ);				// �����ڸ� �������� ������ ������ �����ڰ� �ȴ�.
					- new StringTokenizer(�ؽ�Ʈ, ������);

					- boolean hasMoreTokens() : �������� ���� ��ū�� �����ϸ� true�� ��ȯ�Ѵ�.
					- String nextToken()	  : ��ū(���ڿ�)�� ������.
			*/
		
	}
}