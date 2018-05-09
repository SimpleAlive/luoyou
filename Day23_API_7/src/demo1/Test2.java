package demo1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test2 {

	/**
	 * 字节流
	 */
	public static void main(String[] args) throws Exception {
		//输入流对象
		InputStream is = new FileInputStream("images/music.mp3");
		//输入缓冲流
		BufferedInputStream bis = new BufferedInputStream(is);
		
		//输出流
		OutputStream os = new FileOutputStream("images/music3.mp3");
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		byte [] b = new byte[1024];
		long start = System.currentTimeMillis();
		int len = bis.read(b);
		while(len!=-1){
			bos.write(b, 0, len);
			len = bis.read(b);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		bos.close();
		os.close();
		bis.close();
		is.close();
		
		

	}

}
