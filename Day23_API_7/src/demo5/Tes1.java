package demo5;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class Tes1 {

	/**
	 * ʵ�ִӿ���̨����һЩ�ַ�����д���ļ��У������롱exit��,ֹͣ
	 */
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		String msg;
		Writer writer = new FileWriter("test.txt");
		do{
			System.out.print("�������ַ���:");
			msg = input.next();
			if(!msg.equals("exit")){
				writer.write(msg);
			}
			writer.write("\n");
			writer.flush();//ˢ��
		}while(!msg.equals("exit"));
		
		writer.close();
		
	}

}
