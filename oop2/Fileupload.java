public class Fileupload {

	long maxFileSize;
	int maxFileAmount;

	public Fileupload() {
		// 디폴트 생성자의 값을 잘 생각해서 사용할것.
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
		System.out.println(" 파일 업로드 실행중 ... ");
		System.out.println(" 최대 파일사이즈 : " + maxFileSize);
		System.out.println(" 최대 파일 개수 : " + maxFileAmount);

	}
}
