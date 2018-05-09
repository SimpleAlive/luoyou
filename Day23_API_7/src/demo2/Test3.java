package demo2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Test3 {

	
	public static void main(String[] args) throws Exception {
		Reader r = new FileReader("io2.txt");
		Writer w = new FileWriter("io3.txt");
		
		BufferedReader br = new BufferedReader(r);
		BufferedWriter bw = new BufferedWriter(w);
		
		char [] c = new char[100];
		int len = br.read(c);
		while(len!=-1){
			bw.write(c, 0, len);
			len = br.read(c);
		}
		
		//¹Ø±ÕÁ÷
		bw.close();
		w.close();
		br.close();
		r.close();
		
		

	}

}
