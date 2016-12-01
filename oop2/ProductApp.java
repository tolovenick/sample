public class ProductApp {
	public static void main(String[] args) {
	// 상품을 5개 담는 배열을 정의하기
	// Product[5] = 5칸을 담는 배열 ( 0칸 , 1칸 , 2칸 , 3칸 , 4칸 )
	Product[] p001 = new Product[5];

	// 배열에 상품 5개 저장하기
	p001[0] = new Product(1,"당근",2000,"흙밭",0.2,true);
	p001[1] = new Product(2,"가지",3000,"텃밭",0.3,true);
	p001[2] = new Product(3,"우엉",4000,"흙밭",0.2,true);
	p001[3] = new Product(4,"계란",1500,"닭",0.1,false);
	p001[4] = new Product(5,"호박",12500,"텃밭",0.5,true);

	// 배열에 저장된 상품중에 판매중인 상품만 표시하기
	System.out.printf(" 판매중인 상품목록 입니다. \n");
	for( Product i : p001 ) {
		if ( i.Availability == true ){
			System.out.printf(" %s이 판매중입니다. \n",i.productName);
		}
	}
	System.out.printf("\n");

	// 배열에 저장된 상품중에서 가격이 10000원 이상인 상품만 표시하기
	System.out.printf(" 만원 이상 상품목록 입니다. \n");
	for( Product i : p001 ) {
		if ( i.price > 10000 ) {
			System.out.printf(" %s이 판매중입니다. \n",i.productName);
		}
	}
	System.out.printf("\n");


	// 배열에 저장된 상품의 전체 가격을 표시하기
	for( Product i : p001 ) {
		i.infoView();
		}
	}
}
