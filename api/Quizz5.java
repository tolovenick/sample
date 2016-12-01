public class Quizz5 {
	public static void main(String[] args) {
	
		String[] words = {"새끼", "놈", "년", "병신"};

		String text = "이 놈의 새끼, 당장 숙제해라";

		// 위에서 나열한 금칙어가 포함되어 있는지 여부 확인하기
		boolean isContains = false;

		for(String bad: words) {
			if(text.contains(bad)) {
			isContains = true;
			}
		}
		if(isContains) {
			System.out.println("나쁜 단어 사용금지!");
		}
	}
}