public class ArrayDemo5 {
	public static void main(String[] args) {
		String[][] names = {{"ȫ�浿", "������"} , {"������", "�̼���", "�Ƿ�"} , {"��������"}};
		
		System.out.println("�迭�� ũ��: " + names.length);
			System.out.println("0��° �迭�� ũ��: " +names[0].length);
				System.out.println("1���� �迭�� ũ��: " + names[1].length);
					System.out.println("1���� �迭�� ũ��: " + names[2].length);

		for (int i=0; i<names.length; i++){
			for (int j=0; j<names[i].length; j++) {
				System.out.println(names[i][j]);
			}
		}
	}
}
