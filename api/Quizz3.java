public class Quizz3 {
	public static void main(String[] args) {
		String text = "A mutable sequence of characters. This provides an API compatible with StringBuffer, but with no guarantee of synchronization. This class is designed for use as a drop-in replacement for StringBuffer in places where the string buffer was being used by a single thread (as is generally). ";
		text = text.toLowerCase();
			int[] arr = new int[26];
			for(int i=0; i<text.length();i++) {
				int value = text.charAt(i) - 97;

				if(value >= 0) {
					arr[value]++;
				}
			}
			System.out.println(java.util.Arrays.toString(arr));
	}
}