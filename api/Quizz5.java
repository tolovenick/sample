public class Quizz5 {
	public static void main(String[] args) {
	
		String[] words = {"����", "��", "��", "����"};

		String text = "�� ���� ����, ���� �����ض�";

		// ������ ������ ��Ģ� ���ԵǾ� �ִ��� ���� Ȯ���ϱ�
		boolean isContains = false;

		for(String bad: words) {
			if(text.contains(bad)) {
			isContains = true;
			}
		}
		if(isContains) {
			System.out.println("���� �ܾ� ������!");
		}
	}
}