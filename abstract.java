package oop0903;


abstract class Animal {
	String name;
	void view() {}	//일반 메소드
	abstract void disp();	//추상 메소드(미완성★ 메소드)	//{}(바디)가 없을 때는 미완성 메소드
													//이므로 앞에 abstract를 붙여줌. 
													//class 앞에도 붙여줌
	
}//class end

//추상 클래스는 부모역할만 주로 한다
//추상 클래스도 상속은 받을 수 있다
//추상 클래스는 상속받은 자식 클래스는 반드시 추상 메소드를 완성해야 한다(override)
class Elephant extends Animal {
	@Override
	void disp() {
		System.out.println("점보");
		
	}
	
}//class end

class Tuna extends Animal {
	@Override
	void disp() {
		System.out.println("니모");
		
	}
}//class end
	

public class Test02_abstract {

	public static void main(String[] args) {
		//[교재] Chapter 12 객체지향 프로그래밍의 응용
		
		//추상클래스 Abstract class
		//->미완성 클래스
		//->추상 메소드가 1개라도 있으면 추상클래스
		//->일반 메소드와 추상 메소드는 같이 선언 가능 (섞어쓰기 가능)
		//->객체를 생성할 수 없다
		//->new 연산자를 직접 사용할 수 없다
		
		//추상 메소드
		//->미완성 메소드!!
		//->형식) 리턴형 함수명();
		//->메소드의 body {}가 없는 함수
		//->메소드를 선언만 하고 기능 부여는 하지 않은 것
		
		//인터페이스 : 추상메소드만 선언 가능하다
//------------------------------------------------------------------------------
		
		//에러! 미완성 클래스는 new 연산자로 객체생성 할 수 없다
		//Animal ani = new Animal(); 에러!
		
		Elephant jumbo = new Elephant();
		jumbo.disp();
		
		Tuna nemo = new Tuna();
		nemo.disp();
		
		//다형성
		Animal animal = new Elephant();
		animal.disp();
		
		animal = new Tuna();
		animal.disp();
		
		
		

	}//main() end
}//class end
