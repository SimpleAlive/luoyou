package demo3;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BanJi ban = new BanJi();
		Student stu1 = new Student("tom");
		ban.add(stu1);
		ban.add(new Student("jack"));
		ban.add(new Student("rose"));
		
		//�����Ƴ��ķ���
		//ban.remove(1);
		//ban.remove(stu1);
		
		
		//�鿴�༶ѧԱ
	/*	for(int i=0;i<ban.list.size();i++){
			Student stu = ban.list.get(i);
			System.out.println(stu.getName());
		}*/
		
		BanJi ban2 = new BanJi();
		ban2.add(new Student("С��"));
		ban2.add(new Student("С��"));
		ban2.add(new Student("С��"));
		
		
		/*for(int i=0;i<ban2.list.size();i++){
			Student stu = ban2.list.get(i);
			System.out.println(stu.getName());
		}*/
		
		//�ϰ�
		ban.list.addAll(ban2.list);
		for(int i=0;i<ban.list.size();i++){
			Student stu = ban.list.get(i);
			System.out.println(stu.getName());
		}
		
		

	}

}
