package oop0901;

import java.util.Calendar;

//1)final 클래스 (종단클래스)
/*
final class Animal {//class end }
class Elephant extends Animal {} 에러! final 클래스는 상속 받을 수 없다
*/

//2)final 메소드
class Fruit {
	void view() {}
	final void disp() {}
}//class end

class Apple extends Fruit {//자식 클래스, extends 부모클래스
	
	@Override		//<-annotation, 재정의(리폼) 가능
	void view() {}
	
	/*
	@Override		
	void disp() {}	에러! final 메소드는 더 이상 override 할 수 없다
	*/
}//class end


public class Test03_final {

	public static void main(String[] args) {
		//final 마지막
		//변수 : 변수를 상수화 (변하지 x)
		//함수 : 더 이상 리폼(override 재정의)할 수 없다
		//클래스 : 종단클래스, 후손클래스를 생성할 수 없다
		
		int a = 3;
		a = 5;		//다른 값으로 대입 가능
		
		final int b = 2;	//변수의 상수화
		//b = 4;	에러! final 변수는 다른 값으로 대입 불가능
		
		System.out.println(Calendar.YEAR);		//1
		System.out.println(Calendar.MONTH);		//2
		System.out.println(Calendar.DATE);		//5
		
		System.out.println(Calendar.HOUR);		//10
		System.out.println(Calendar.MINUTE);	//12
		System.out.println(Calendar.SECOND);	//13
		
		//Calendar.YEAR = 10; 에러
		/*
		 	class Calendar {
		 		static final int YEAR = 1;
		 		static final int MONTH = 2;
		 		static final int DATE = 5;
		 	
		 	}
		 	
		 	
		 */
		
		
		
		
		
	}//main() end
}//class end
