import java.util.*;

public class Memo {
	
	public static void main(String[] args) throws Exception {
	
/*		String text = "";
		text += "�б����� ������" + System.lineSeparator();
		text += "� ������"; + System.lineSeparator();
		text += "�������� �츮��"; + System.lineSeparator();
		text += "��ٸ��Ŵ�."; + System.lineSeparator();
		
		FileWriter writer = new FileWriter("a.txt");
		writer.write(text);
		writer.close();
		*/

		//�迭 �����ϱ�
		String[] src = {"�̼���", "������", "������", "ȫ�浿", "������", "�Ӳ���"};
		String[] dest = new String[10];
/*
		System.arraycopy(src, srcPosition, dest, destPosition, length)
			src: ���� �迭
			srcPosition : ���� �迭���� ������ �׸��� ���� ��ġ
			dest : �� �迭
			destPosition : �� �迭���� ������ �׸��� �ٿ����� ���� ��ġ
			length : ���� �迭���� ������ �׸��� ����
*/
		System.arraycopy(src, 3, dest, 1, 6);
		System.out.println(Arrays.toString(dest));
	}
}
