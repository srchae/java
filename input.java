package oop0907;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test05_input {

	public static void main(String[] args) {
		//메모장 파일 (.txt .java) 내용 읽기
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			String filename ="C://java202108/workspace/basic01_java/src/oop0906/Test06_Buyer.java";
			
			
			//1)파일 가져오기
			fr = new FileReader(filename); 
					
			//2)파일 내용 읽기
			br = new BufferedReader(fr);
			
			int num = 0; //행번호
			while(true) {
				//3)엔터(\n)를 기준으로 한 줄씩 가져오기
				String line = br.readLine();
				if(line==null) {
					break;
				}//if end
				
				System.out.printf("%3d %s\n", ++num, line);
			
				//20명마다 밑줄 긋기
				if(num%20==0) {
					System.out.println("-----------------------------------------");
				}//if end
			
			}//while end
			
		}catch(Exception e) {
			System.out.println("파일읽기 실패 : " + e);
		}finally {
			//차원 반납 순서 주의
			try {
				if (br!=null) { br.close(); }
			}catch(Exception e) {}
			
			try {
				if(fr!=null) { fr.close(); }
			}catch (Exception e) {}
		}//try end
		
		
	}//main() end
}//class end
