public class Fileupload {

	long maxFileSize;
	int maxFileAmount;

	public Fileupload() {
		// ����Ʈ �������� ���� �� �����ؼ� ����Ұ�.
		maxFileSize = 1024 * 1024 * 10;
		maxFileAmount = 10;
	}

	public Fileupload(long size) {
		maxFileSize = size;
		maxFileAmount = 10;
	}

	public Fileupload(int amount) {
		maxFileAmount = amount;
		
	}

	public Fileupload(long size, int amount) {
		maxFileSize = size;
		maxFileAmount = amount;
	}

	public void upload() {
		System.out.println(" ���� ���ε� ������ ... ");
		System.out.println(" �ִ� ���ϻ����� : " + maxFileSize);
		System.out.println(" �ִ� ���� ���� : " + maxFileAmount);

	}
}
