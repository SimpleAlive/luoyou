package demo2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class Test1 {

	/**
	 * �ַ���--������
	 */
	public static void main(String[] args) throws Exception {
		//�ַ�����������Ĵ���
		Reader  reader = new FileReader("io.txt");
		//���ַ�����
		/*int len = reader.read();//һ�ζ�һ���ַ�
		while(len!=-1){
			System.out.print((char)len);
			len = reader.read();
		}*/
		
		
		BufferedReader br = new BufferedReader(reader);
		char [] c = new char[1024];
		int len = br.read(c);//һ�ζ�����ַ�
		while(len!=-1){
			String str = new String(c,0,len);
			System.out.print(str);
			len = br.read(c);
		}
		
		
		reader.close();
		
	}

}
