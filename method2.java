package oop0826;

public class Test03_method {

	public static int test1(int a, int b) {
			int sum = a+b; //8
			// return; => 리턴값이 없는 경우 (void)
			return sum;	//리턴값의 자료형을 void 자리에 쓴다
						//리턴값은 1개의 값만 리턴할 수 있다
	}//test1() end
	
	public static String test2(int a) {
			if (a % 2 == 0) {
				return "짝수";
			}
			else {
				return "홀수";
			}
	}//test2() end
	
	
//------------------------------------------------------------------------------
	
	
	//문1) 윤년 확인하는 함수
	//내가 짠 코드
	/*
	public static String leap(int y) {
		if (y%4==0 && y%100!=0 || y%400==0) {
			return "윤년";
		}
		else {
			return "평년";
		}
	}
	*/
	// boolean 사용 (강사님 코드)
	public static boolean leap(int y) {
		if (y%4==0 && y%100!=0 || y%400==0) {
			return true;
		}
		else {
			return false;
		}
	}//leap() end
	
	
	//문2) 팩토리얼 값 구하기 함수
	//내가 짠 코드
	public static long fact(int num) {
		long gop = 1;
		for (int i=1; i<=num; i++) {
			gop = gop * i;
		}
		return gop;
 	}

	
	
	
	
//------------------------------------------------------------------------------
	
	
	public static void main(String[] args) {
		
		//3) 리턴값이 있는 경우
		
		//System.out.println(Math.abs(-3));
		//System.out.println(Math.max(2, 4));

		int result = test1(3, 5);	//함수는 호출된 곳으로 돌아옴
									//돌아와서 값을 result라는 변수에 넣어준다
		System.out.println(result);
		
		//값 : 상수값, 변수값, 리턴값
		System.out.println(test1(2,4)); //함수 호출과 동시에 돌아와서 출력
		
		
		
		String str = test2(7); //함수를 변수에 저장해서 그 변수를 출력함
		System.out.println(str);
		System.out.println(test2(7));
		
//------------------------------------------------------------------------------
		
		//문1) 윤년 확인하는 함수
		//String year = leap(2021);
		System.out.println(leap(2021));
		
		//문2) 팩토리얼 값 구하는 함수
		long gop = fact(4);
		System.out.println(gop);
		
		
		
	}//main() end
}//class end
