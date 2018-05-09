package demo4;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test1 {

	/**
	 * 随机生成26个大写字母,
	 * 要求获得一共随机生存了多少次才产生不重复的26个大写字母,
	 * 输出的时候要求排序输出
	 */
	public static void main(String[] args) {
		/*char c = 'Z';
		int a = c;
		System.out.println(a);*/
		//65-90之间的数字
		Random random = new Random();
		//(0---2)+1-->1--3
		//1--3
		//(0--25)+65
		//65-90
			

		Set<Character> set = new TreeSet<Character>();
		int index = 0;
		while(set.size()<26){
			int num =(int)(Math.random()*26)+65;
			char c = (char) num;
			set.add(c);
			index++;
		}
		
		System.out.println(index);
		for(Character c :set){
			System.out.print(c+" ");
		}
	}

}
