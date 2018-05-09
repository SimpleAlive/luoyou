package demo5;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class Tes1 {

	/**
	 * 实现从控制台接收一些字符串，写入文件中，当输入”exit”,停止
	 */
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		String msg;
		Writer writer = new FileWriter("test.txt");
		do{
			System.out.print("请输入字符串:");
			msg = input.next();
			if(!msg.equals("exit")){
				writer.write(msg);
			}
			writer.write("\n");
			writer.flush();//刷新
		}while(!msg.equals("exit"));
		
		writer.close();
		
	}

}
