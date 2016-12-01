public class ProductApp {
	public static void main(String[] args) {
	// ��ǰ�� 5�� ��� �迭�� �����ϱ�
	// Product[5] = 5ĭ�� ��� �迭 ( 0ĭ , 1ĭ , 2ĭ , 3ĭ , 4ĭ )
	Product[] p001 = new Product[5];

	// �迭�� ��ǰ 5�� �����ϱ�
	p001[0] = new Product(1,"���",2000,"���",0.2,true);
	p001[1] = new Product(2,"����",3000,"�Թ�",0.3,true);
	p001[2] = new Product(3,"���",4000,"���",0.2,true);
	p001[3] = new Product(4,"���",1500,"��",0.1,false);
	p001[4] = new Product(5,"ȣ��",12500,"�Թ�",0.5,true);

	// �迭�� ����� ��ǰ�߿� �Ǹ����� ��ǰ�� ǥ���ϱ�
	System.out.printf(" �Ǹ����� ��ǰ��� �Դϴ�. \n");
	for( Product i : p001 ) {
		if ( i.Availability == true ){
			System.out.printf(" %s�� �Ǹ����Դϴ�. \n",i.productName);
		}
	}
	System.out.printf("\n");

	// �迭�� ����� ��ǰ�߿��� ������ 10000�� �̻��� ��ǰ�� ǥ���ϱ�
	System.out.printf(" ���� �̻� ��ǰ��� �Դϴ�. \n");
	for( Product i : p001 ) {
		if ( i.price > 10000 ) {
			System.out.printf(" %s�� �Ǹ����Դϴ�. \n",i.productName);
		}
	}
	System.out.printf("\n");


	// �迭�� ����� ��ǰ�� ��ü ������ ǥ���ϱ�
	for( Product i : p001 ) {
		i.infoView();
		}
	}
}
