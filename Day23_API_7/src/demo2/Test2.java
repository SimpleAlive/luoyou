package demo2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class Test2 {

	/**
	 * �ַ�--�����
	 */
	public static void main(String[] args) throws Exception {
		//�����ַ����������
		//true��ʾ�Ƿ�׷���ļ������ݣ�false���ǲ�д���ʾ����
		Writer writer = new FileWriter("io2.txt",false);
		BufferedWriter bw = new BufferedWriter(writer);
		/*writer.write(97);//a---97  b  98  c-99
		writer.write(98);//a---97  b  98  c-99
		writer.write(99);//a---97  b  98  c-99
        */	
		
		/*char [] c = {'a','b','c'};
		writer.write(c);*/
		/*writer.write("���߲�����");
		//writer.write("\n");
		writer.write("��������ҧ");*/
		
		bw.write("���߲�����");
		bw.newLine();
		bw.write("��������ҧ");
		
		bw.close();
		writer.close();
		

	}

}
