public class ProductApp {

	public static void main(String[] args) {
	
		Product p1 = new Product(10, "�����е�", "����", 1000000, 0.05);
		Product p2 = new Product(12, "�ƺ� ����", "����", 2500000, 0.1);
		Product p3 = new Product(13, "������", "����", 850000, 0);

		p1.info();
		p2.info();
		p3.info();
	}
}
