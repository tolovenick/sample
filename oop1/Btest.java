public class Btest {
// 1) �迭�� ���޹޾Ƽ� �� �迭���� ���� ū ���� ��ȯ�ϴ� �޼ҵ�
// 2) �迭�� ���ڸ� ���޹޾Ƽ� �� �迭�� ���ڰ� ���ԵǾ��ִ��� ���θ� ��ȯ�ϴ� �޼ҵ�

	//�Ӽ�
	int[] list = new int[3];			// �� �迭�� ����
	int existNumber;					// üũ�� ��ȣ�� �ް�

	//���
	public int mostNumber() {			// �ִ밪�� ���ϴ� ����� �մϴ�.
		int max = 0;					// max ��� ������ ���� ������� ����
		for(int a=0; a<list.length; a++) {
			if(list[a] > max ) {
				max = list[a];
			}
		}
		return max;
	}

		public boolean yesNumber() {		// �����ϴ��� ������ yes ��� ������ ����ؼ� üũ�մϴ�.
			boolean yes = false;
			for(int b=0; b<list.length; b++) {
				if(list[b] == existNumber) {
					yes = true;
				}
			}
			return yes;
		}
}