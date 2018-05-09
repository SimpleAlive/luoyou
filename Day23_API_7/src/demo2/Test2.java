package demo2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class Test2 {

	/**
	 * 字符--输出流
	 */
	public static void main(String[] args) throws Exception {
		//创建字符输出流对象
		//true表示是否追加文件中数据，false或是不写则表示覆盖
		Writer writer = new FileWriter("io2.txt",false);
		BufferedWriter bw = new BufferedWriter(writer);
		/*writer.write(97);//a---97  b  98  c-99
		writer.write(98);//a---97  b  98  c-99
		writer.write(99);//a---97  b  98  c-99
        */	
		
		/*char [] c = {'a','b','c'};
		writer.write(c);*/
		/*writer.write("春眠不觉晓");
		//writer.write("\n");
		writer.write("处处蚊子咬");*/
		
		bw.write("春眠不觉晓");
		bw.newLine();
		bw.write("处处蚊子咬");
		
		bw.close();
		writer.close();
		

	}

}
