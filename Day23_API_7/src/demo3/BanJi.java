package demo3;

import java.util.ArrayList;
import java.util.List;

public class BanJi {

	List<Student> list =  new ArrayList<Student>();
	//Ìí¼Ó
	public void add(Student stu){
		list.add(stu);
	}
	
	public void remove(Student stu){
		list.remove(stu);
	}
	
	public void remove(int index){
		list.remove(index);
	}
	
	public void addAll(List<Student> list2){
		list.addAll(list2);
	}
	
	
	
	
}
