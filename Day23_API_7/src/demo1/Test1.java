package demo1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test1 {

	/**
	 * �ֽ���
	 */
	public static void main(String[] args) throws Exception {
		//����������
		InputStream is = new FileInputStream("images/music.mp3");
		//�����
		OutputStream os = new FileOutputStream("images/music2.mp3");
		byte [] b = new byte[1024];
		long start = System.currentTimeMillis();
		int len = is.read(b);//һ�ζ�1KB����
		while(len!=-1){
			os.write(b, 0, len);//������������д�����ⲿ�ļ���
			len = is.read(b);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		os.close();
		is.close();
		

	}

}
