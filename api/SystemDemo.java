public class SystemDemo {

	public static void main(String[] args) {
	
		// 현재 시간정보 알아내기
		long time = System.currentTimeMillis();
		System.out.println(time);

		long nanoTime = System.nanoTime();
		System.out.println(nanoTime);


		// 환경변수값 조회하기

		String value1 = System.getenv("JAVA_HOME");
		System.out.println(value1);
		String value2 = System.getenv("PATH");
		System.out.println(value2);

		// 현재 시스템의 줄바꿈문자 조회하기
		String newLineChar = System.getProperty("line.separator");
		System.out.println("abcdef"+newlineChar+"ghijk");

		//현재 시스템의 사용자 홈 디렉토리 조회하기
		Strubg dir = System.getProperty("user.home");
		System.out.println(dir);
		}
}