package demo2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class Test1 {

	/**
	 * 字符流--输入流
	 */
	public static void main(String[] args) throws Exception {
		//字符输入流对象的创建
		Reader  reader = new FileReader("io.txt");
		//读字符数据
		/*int len = reader.read();//一次读一个字符
		while(len!=-1){
			System.out.print((char)len);
			len = reader.read();
		}*/
		
		
		BufferedReader br = new BufferedReader(reader);
		char [] c = new char[1024];
		int len = br.read(c);//一次读多个字符
		while(len!=-1){
			String str = new String(c,0,len);
			System.out.print(str);
			len = br.read(c);
		}
		
		
		reader.close();
		
	}

}
