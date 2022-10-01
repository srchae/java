package oop0824;

public class Test03_array {

	public static void main(String[] args) {
		//2차원 배열
		//[행] [열]
		
		//2열 3행
		/*
		int [][] kor = new int [2][3]; //4바이트*6개 -> 24바이트 메모리 할당
		kor[0][0] = 10;
		kor[0][1] = 20;
		kor[0][2] = 30;
		kor[1][0] = 40;
		kor[1][1] = 50;
		kor[1][2] = 60;
		
		//kor 배열의 행의 갯수
		System.out.println(kor.length);		//2
		
		//0행의 열 갯수 
		System.out.println(kor[0].length);	//3
		
		//1행의 열 갯수
		System.out.println(kor[1].length);  //3

		for (int r=0; r<=1; r++) {
			for (int c=0; c<=2; c++) {
				System.out.println(kor[r][c]);
			}//for
		}
		
		System.out.println("--------------");
		for (int row=0; row<kor.length; row++) {
			int col=kor[row].length;	//row의 행의 열 갯수를 알아오기 위함임
										//행의 열 갯수는 각각 다를 수 있음 (자바 특징)
			for (int c=0; c<col; c++) {
				System.out.println(kor[row][c]);
			}
		}
		
		//ArrayIndexOutOfBoundsException발생
		//kor의 4행은 4열은 존재하지 않음
		//System.out.println(kor[4][4]);
		*/
		
//------------------------------------------------------------
		
		//2차원 배열에서 각행의 열의 갯수는 달라도 된다.
		int[][] eng = {
				{10,20},
				{30,40,50,60},
				{70,80,90}
			
		};
		
		int row = eng.length;	//3
		
		for (int i=0; i<row; i++) {
			int col=eng[i].length;
			for(int j=0; j<col; j++) {
				System.out.println(eng[i][j]);
			}
		}
		
		
		
	}//main() end
}//class end
