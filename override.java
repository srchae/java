package oop0902;

class Korea {
	String name ="대한민국";
	final void view() {
		System.out.println("Korea.view()...");
	}//view 함수. final은 고쳐쓸 수 없음
	void disp() {
		System.out.println("Korea.disp()..." + name);
	}//disp 함수
	
}//class end

class Seoul extends Korea {}//class end

class Busan extends Korea {
	String name = "부산광역시";
	
	@Override
	void disp() {
			System.out.println("Busan.disp()..." + name);
	}//disp() end
	
	/*
	@Override
	void view() {	파이널 메소드는 override 할 수 없다
	*/	


}//class end

public class Test02_override {

	public static void main(String[] args) {
		//Method Override 함수 재정의 
		//->상속관계에서 물려받은 메소드를 다시 수행(리폼)
		
		//1)오버라이드(리폼) 하기 전
		Seoul se = new Seoul();
		se.view();
		se.disp();
		
		//2)오버라이드(리폼) 한 후
		Busan bu = new Busan();
		bu.disp();
		bu.view(); 		//상속은 가능(부모 korea의 view 출력 가능),
						//하지만 final 메소드는 오버라이드 할 수 없다.
		
		
		
	}//main() end
}//class end
