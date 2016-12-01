public class DeskApp {
	public static void main(String[] args) {
		
		OpticalMouse m = new OpticalMouse();
		Desktop pc = new Desktop();

		pc.setMouse(m);

		pc.running();
		pc.painting();
	}
}