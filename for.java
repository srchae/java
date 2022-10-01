package oop0823;

public class Test05_for {

	public static void main(String[] args) {
		//이중 반복문
		/*
		for (int a=1; a<=2; a=a+1) {
			System.out.println(a+"JAVA");
			
			for(int b=1; b<=3; b=b+1) {
				System.out.println(b+"PYTHON");
			}//for end
			
		}//for end
		*/
		/*
		 	a=1		1<=2	1JAVA
		 					b=1		1<=3	1PYTHON
		 					b=2		2<=3	2PYTHON
		 					b=3		3<=3	3PYTHON
		 	a=2		2<=2	2JAVA
		 					b=1		1<=3	1PYTHON
		 					b=2		2<=3	2PYTHON
		 					b=3		3<=3	3PYTHON
		 				
		 	
		 */
		
		//구구단 2단~9단 출력하기
		//내가 짠 코드
		/*
		for (int i=2;i<=9;i++) {
			System.out.println("--" + i + "단" +"--");
			for (int j=1;j<=9;j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}//for end
		}//for end
		*/
//--------------------------------------------
		
		//회전 수 증가
		/*
		for (int a=1; a<=4; a++) {
			
			for (int b=1; b<=a; b++) {
				System.out.println("#");
			}//for end
			
			System.out.println();
			
		}//for end
		*/
		/*
		 	a=1		1<=4
		 			b=1		1<=1	#
		 			
		 			2<=4
		 			b=1		1<=2	#
		 			b=2		2<=2	#
		 			
		 			3<=4
		 			b=1		1<=3	#
		 			b=2		2<=3	#
		 			b=3		3<=3	#
		 			
		 			4<=4
		 			b=1		1<=4	#
		 			b=2		2<=4	#
		 			b=3		3<=4	#
		 			b=4		4<=4	#
		 	
		 */
		
		//회전 수 감소
		int a=0, b=0;
		
		for (a=4; a>=1; a--) {
			for (b=1; b<=a; b++) {
				System.out.print("@");
				
			}//for end
			System.out.println();
		}//for end
		
		System.out.println(a+b); //2
		
		System.out.println("---------------");
		/*
		 	a=4		4>=1
		 				b=1		1<=4	@@@@
		 				b=2		2<=4
		 				b=3		3<=4	
		 				b=4		4<=4
		 			
		 			3>=1
		 				b=1		1<=3	@@@
		 				b=2		2<=3	
		 				b=3		3<=3
		 			2>=1
		 				b=1		1<=2	@@
		 				b=2		2<=2	
		 			1>=1
		 				b=1		1<=1	@
		 				b=2		2<=1 -- X
		 			0>=1
		 			
		 			//a = 0, b = 2	
		 			//a가 0이 된 시점에서 아래로 코드를 읽을 때, 그 다음 문장을 수행하지 못하기 
		 			//때문에 a는 0이 되고, b는 가장 마지막에 있던 2가 된다. 		
		 			
		 */
//------------------------------------------------
		
		//과제)아래 그림과 같이 출력하시오
		/*
		 	@***
		 	*@**
		 	**@*
		 	***@
		 */
		for (int i=1; i<=4; i++) {
			for (int j=1; j<=4; j++) {
				if (i == j) {		// i와 j가 같을 때 @찍는다
					System.out.print("@");
				}
				else {
					System.out.print("*");
				}
				
			}System.out.println();	//for(j) end
			
		} //for(i) end
		
		
		
	}//main() end
}//class end
