public class Product {
	// �Ӽ�
	// ��ǰ��ȣ, ��ǰ��, ����, ������, ������(�Ǽ�), �Ǹſ���

	int no;
	String productName;
	int price;
	String manufacturer;
	double discountRate;
	boolean Availability;

	// ������
	// �⺻������,�Ű����� �ִ� ������

	public Product(){
	}

	public Product(int a, String b, int c, String d, double e, boolean f){
		no = a;
		productName = b;
		price = c;
		manufacturer = d;
		discountRate = e;
		Availability = f;
	}
	
	// ���
	// ���ε� ������ ��ȯ�ϴ� �޼ҵ� ( ���ε� ����� ������ ���� (����) )
	// ��ǰ������ ǥ���ϴ� �޼ҵ�( ���ΰ� ���� )

	public int discount() {
		double discountPrice = price * discountRate;
		return (int) discountPrice;
	}

	public void infoView() {
	System.out.printf("��ȣ : %2d || �̸� : %s || ���� : %4d || ������ : %s || ������ : %1.0f || �Ǹſ��� : %s  || ���ΰ� : %4d \n",no,productName,price,manufacturer,discountRate*100,Availability,price-discount());
	}
}