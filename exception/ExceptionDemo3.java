import java.io.*;

public class ExceptionDemo3 {

	public static void writing() {
		try {
			FileWriter writer = new FileWriter("simple.txt");
			String text = "12�� 3�� ������ ����� �ܼ�Ʈ";

			writer.write(text);
			writer.flush();
			
		} catch (FileNotFoundException e) {
			throw new L2Exception();
		} catch (IOException e) {
			throw new L2Exception();
		}
	}

	
	public static void reading() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("memo.txt"));
			String text = reader.readLine();
			System.out.println("����: " + text);
		} catch (FileNotFoundException e) {
			// FileNotFuoundException�� �߻��� ���� ����ä��, ��� L2Exception�� �����ؼ� ������
			throw new L2Exception();
		} catch (IOException e) {
			throw new L2Exception();
		}
	
		public static void main(String[] args) {
			
		}
	}
}