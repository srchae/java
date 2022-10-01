package oop0906;

import java.util.Vector;

class Product extends Object{//extends Object 생략가능
	  public int price;			//상품가격
	  public int bonusPoint;	//마일리지

	  public Product() {}		//default constructor
	  public Product(int price) {
		  this.price = price;	//this.멤버변수 = 지역변수
		  this.bonusPoint = (int)(price*0.1);	//상품가격 10%를 보너스 점수 책정
	  }
}//class end


class SmartTV extends Product {
	public SmartTV() {
		super(100);		//부모 클래스의 변수를 가져옴. 즉 price=100 bonusPoint=10
	}
	@Override
	public String toString() {
		return "스마트TV";		//상품명
	}
}//class end



class Notebook extends Product {
	public Notebook() {
		super(200);		//price=200 bonusPoint=10
	}
	@Override
	public String toString() {
		return "노트북";			//상품명
	}
}//class end

class Handphone extends Product {
	public Handphone() {
		super(150);
	}
	@Override
	public String toString() {
		return "핸드폰";
	}
}//class end

//상품을 구매하는 사람
class Buyer{
	private int myMoney=1000;	//나의 총 재산
	private int myMileage=0;		//나의 마일리지 점수
	private int i=0;				
	
	//상품을 구매했을 때 어떤 상품을 구매했는지 저장 (나의 구매목록)
	private Product[] items = new Product[10];
	/*
	 	
	 				Product
	 	
	 	SmartTV		Notebook	Handphone
	 	items[0]	items[1]	items[2]
	 	
	 	
	 */
	
	/*
	//메소드 오버로딩
	public void buy(SmartTV a) {}	
	public void buy(Notebook a) {}
	public void buy(Handphone a) {}
	*/
	
	public void buy(Product p) {
		if(p.price>this.myMoney) {
			System.out.println("잔액이 부족합니다!!");
			return;
		}//if end
		
		
		items[i++] = p;									//구매한 상품 저장하기
		this.myMoney = this.myMoney-p.price;			//나의 재산은 감소
		this.myMileage = this.myMileage+p.bonusPoint;	//나의 마일리지는 증가
	}//buy end
	
	public void disp() {
		
		StringBuilder shoplist = new StringBuilder();	//구매 상품 목록
		int hap = 0;		//사용 금액
		
		for(int n=0; n<items.length; n++) {
			if(items[n]==null) break;
			shoplist.append(items[n].toString() + " ");		//상품명
			hap = hap+items[n].price;
		}//for end
		
		System.out.println("구매 상품 목록 : " + shoplist);
		System.out.println("사용금액 : " + hap);
		System.out.println("나의 남은 재산 : " + this.myMoney);
		System.out.println("나의 마일리지 : " + this.myMileage);
	}
}//class end

class Order {
	private int myMoney=1000;	//나의 총 재산
	private int myMileage=0;		//나의 마일리지 점수
	private int i=0;				
	
	//상품을 구매했을 때 어떤 상품을 구매했는지 저장 (나의 구매목록)
	private Vector<Product> items = new Vector<Product>();
	
	public void buy(Product p) {
		if(p.price>this.myMoney) {
			System.out.println("잔액이 부족합니다!!");
			return;
		}//if end
		
		
		items.add(p);									//구매한 상품 저장하기
		this.myMoney = this.myMoney-p.price;			//나의 재산은 감소
		this.myMileage = this.myMileage+p.bonusPoint;	//나의 마일리지는 증가
	}//buy end
	
	public void disp() {
		
		StringBuilder shoplist = new StringBuilder();	//구매 상품 목록
		int hap = 0;		//사용 금액
		
		if(items.isEmpty()) {
			System.out.println("구매 상품 없음!!");
			return;
		}//if end
		
		for(int n=0; n<items.size(); n++) {
			Product p = items.get(n);		//요소 하나씩 꺼내오기
			shoplist.append(p.toString() + " ");		//상품명
			hap = hap+p.price;
		}//for end
		
		System.out.println("구매 상품 목록 : " + shoplist);
		System.out.println("구매 상품 목록 : " + items.toString());
		System.out.println("사용금액 : " + hap);
		System.out.println("나의 남은 재산 : " + this.myMoney);
		System.out.println("나의 마일리지 : " + this.myMileage);
	}//disp() end
	
	public void refund(Product p) {
		if(items.remove(p)) {
			System.out.println(p.toString() + "반품되었습니다");
		}else {
			System.out.println("구매내역에 상품이 없습니다 !");
		}//if end
	}//refund() end
	
}//class end

public class Test06_Buyer {

	public static void main(String[] args) {
		//상품 구매 및 반품 프로그램
		
		//상품 진열하기
		SmartTV tv = new SmartTV();
		Notebook note = new Notebook();
		Handphone phone = new Handphone();
		
		//상품 구매하기
		Buyer kim = new Buyer();	//Buyer 클래스 안에 buy 함수 생성
		kim.buy(tv);		//100
		kim.buy(note);		//200
		kim.buy(phone);		//150
		
		//출력하기
		kim.disp();
		
		System.out.println("---------------------------");
		
		Order lee = new Order();
		lee.buy(tv);
		lee.buy(note);
		lee.buy(phone);
		lee.disp();
		
		//상품을 중복 구매하지 않았다는 전제하에 반품
		System.out.println("<<<<<<<반품");
		lee.refund(note);
		
		System.out.println("<<<<<<<결과");
		lee.disp();
		
		//| 이 코드 cafe24에서 다시 가져와서 비교해보기 !!(밑 출력문 틀림 !) |
	}//main() end

}//class end
