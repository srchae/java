package oop0826;

public class Test04_method {

	public static void test() {
		test(); //자신의 함수를 호출할 수 있다
		
	}//test() end
	
	
	
	public static long fact(int a) {
		if (a == 0) {
			return 1;
		}
		else {
			return a* fact(a-1);
		
		}//if end
	}//fact() end
	
	/*
	 	a=3		if 3 == 0 
	 			else
	 				3*fact(2)
	 				if 2 == 0
	 				else
	 					2*fact(1)
	 					if 1 == 0
	 					else
	 						1*fact(0)
	 						if (0 == 0)
	 							return 1
	 	
	 */
	
	public static void main(String[] args) {
		//재귀적 함수 호출
		//-> 자신이 자신의 함수를 호출할 수 있다 (잘못하면 무한루프 돌 수도 있음)
		
		System.out.println(fact(3));

	}//main() end
}//class end
