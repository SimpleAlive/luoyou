package demo2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Test4 {

	/**
	 * ת����
	 */
	public static void main(String[] args) throws Exception {
		//�ֽ���
		InputStream is = new FileInputStream("io2.txt");
		//���ֽ���ת��Ϊ�ַ���
		Reader r = new InputStreamReader(is);
		
		OutputStream os = new FileOutputStream("io4.txt");
		//���ֽ���ת��Ϊ�ַ���
		Writer w = new OutputStreamWriter(os);

	}

}
