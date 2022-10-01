package oop0819;

public class Test02_operator {

	public static void main(String[] args) {
		//연산자 우선순위
		//-> 최우선 연산자 ()
		//-> 산술 -> 비교 -> 논리
		//-> 후순위 연산자 : = 대입연산자
		
		
		//1) 삼항연산자
		//-> (조건)	? 	참	: 	거짓 
		// 반드시 조건이 boolean 값으로 나옴
		/*
		int a = 3;
		System.out.println(a * -1); //이항연산자
		System.out.println(-a); 	//단항연산자
		System.out.println();
		*/
		
		//문) 절대값을 구하시오(양수 값을 구하시오)
		/*
		int num = -5;
		// 양수인지 물어보기 
		int result = (num > 0) 	?	num : num*-1;
					// -5 > 0	?		-5 * -1
					// false
					// result = 5;
		System.out.println(num + "절대값" + result);
		*/
//-------------------------------------------------------------
		
		//2) 대입연산자
		/*
		int a = 3;
		a = a + 2;
		System.out.println(a); //5
		
		a+=2;
		System.out.println(a); //7
		
		a-=3;
		System.out.println(a); //4
		
		a*=5;
		System.out.println(a); //20
		
		a/=2;
		System.out.println(a); //10
		
		a%=4;
		System.out.println(a); //2
		*/
		
//-------------------------------------------------------------
		
		
		//3) 1증감 연산자
		
		// 1증가 연산자
		
		/*
		int a = 3;
		a = a + 1; 	//4
		a += 1; 	//5
		a++; 		//6
		++a; 		//7
		System.out.println(a);
		
		// 1감소 연산자
		int b = 3;
		b = b - 1; 	//2
		b -= 1;		//1
		b--;		//0
		--b;		//-1
		System.out.println(b);
		
		// 1증감 연산자는 대입연산자오 계산식과 함께 사용되는 경우 주의!
		int i = 10;
		int j = 20;
		int x = i++; // int x = i	int x = 10
					 // i = i + 1	i = 10 + 1
		// 10인 i 값을 x에 대입 후 연산 실행, 그러므로 x == 10
		int y = --j; // j = j - 1	j = 10 - 1
					 // int y = j	y = 19
		
		System.out.println(i); //11
		System.out.println(j); //19
		System.out.println(x); //10
		System.out.println(y); //19
		*/
//------------------------------------------------------
		
		//문제) 세 개의 수 중에서 최대값을 출력하시오
		/*
		int x=7, y=5, z=9;
		int max = 0;
		int result = (x>y) ? (max = x) : (max = y);
		result = (y>z) ? (max = y) : (max = z);
		result = (x>z) ? (max = x) : (max = z);
		
		System.out.println(result);
		*/
		int x=7, y=5, z=9;
		
		int max = (x < y) ? y : x;
		max = (max < z) ? z : max;
		// x와 y를 비교하여 y이가 더 크면 y를
		// max 변수에 담아주고
		// 그 max(최대값)을 나머지 z와 비교해주어
		// z가 더 크다면 다시 max의 값을 z로 바꿔준다
		
		System.out.println(x+","+y+","+z+" 중 최대값 : "+max);
	
	}//main() end

}//class end
