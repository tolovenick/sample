public class MethodDemo2 {
	public static void a() {

	}

	public static void displayGuGudan(int dan) {
	System.out.printf("%d단 입니다. \n",dan);
	for (int a=1; a<10; a++) {
		System.out.printf("%d x %d = %d \n",dan,a,dan*a);
		}
	System.out.printf("%d단 끝났습니다. \n",dan);
	System.out.printf(" \n");
	}

	public static void main(String[] args) {
		displayGuGudan(8);

		displayGuGudan(199);


	}
}

