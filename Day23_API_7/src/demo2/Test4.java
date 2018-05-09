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
	 * 转换流
	 */
	public static void main(String[] args) throws Exception {
		//字节流
		InputStream is = new FileInputStream("io2.txt");
		//将字节流转换为字符流
		Reader r = new InputStreamReader(is);
		
		OutputStream os = new FileOutputStream("io4.txt");
		//将字节流转换为字符流
		Writer w = new OutputStreamWriter(os);

	}

}
