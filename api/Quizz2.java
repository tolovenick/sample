public class Quizz2 {
	public static void main(String[] args) {
		String text = "<hong@naver.com>,<kim@hanmail.net>,<kang@naver.com>,<yushin@daum.net>";

		String[] data = text.split(",");

		for(String a : data) {
			a = a.replace("<","").replace(">","");
			System.out.println(a);
		}
	}
}