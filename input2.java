package oop0907;

import java.io.FileInputStream;
import java.io.FileReader;

public class Test06_input {

	public static void main(String[] args) {
		//InputStream 기반과 Reader 기반 비교
		
		String filename = "C://java202108/workspace/basic01_java/src/oop0906/Test06_Buyer.java";
		
		try {
			//byte형 : 1바이트 할당
			//char형 : 2바이트 할당
			
			//1)FileInputStream : byte 기반
			//->한글 깨짐
			FileInputStream fis = new FileInputStream(filename);
			
			while(true) {
				int data = fis.read();
				if (data==-1) {	//파일의 끝(End Of File)인지?
					break;
				}//if end
				System.out.printf("%c", data);
			}//while end
			
			fis.close();	//자원반납
			// ! 주석 어디에 달린건지 cafe24에서 확인해보기 !
//-----------------------------------------------------------
			
			//2)FileReader : char 기반
			//->한글 안 깨짐
			FileReader fr = new FileReader(filename);
			while(true) {
				int data = fr.read();
				if(data == 1) {
					break;
				}//if end
				System.out.printf("%c", data);
			}//while end
			
			fr.close();
			
			
			
		} catch(Exception e) {
			System.out.println("실패 : " + e);
		}//end
	}//main() end
}//class end

