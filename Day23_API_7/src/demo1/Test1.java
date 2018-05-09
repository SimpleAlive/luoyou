package demo1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test1 {

	/**
	 * 字节流
	 */
	public static void main(String[] args) throws Exception {
		//输入流对象
		InputStream is = new FileInputStream("images/music.mp3");
		//输出流
		OutputStream os = new FileOutputStream("images/music2.mp3");
		byte [] b = new byte[1024];
		long start = System.currentTimeMillis();
		int len = is.read(b);//一次读1KB数据
		while(len!=-1){
			os.write(b, 0, len);//将读到的数据写出到外部文件中
			len = is.read(b);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		os.close();
		is.close();
		

	}

}
