package com.woniuxy.class36lession12;

public class Linklist {
	
		//链式结构的优点
		//内存随机分布，不存在连续分配内存的难度
		//不需要下标值，也不需要获得元素，直接通过引用传递
		//没有顺序的限制，不需要加序号，不需要强制有序
		 //缺点
		//无法快速获得指定位置的元素，查找元素效率低
		//排序繁杂
		
		
		
		//预习map hashmap
		//key 值如何唯一  怎样找元素
		
		
	
	
	void start() {
		//构造一个链式结构
		Student head = new Student();
		head.name = "a0";
		head.code = "a000";
		
		
		
		head.next = new Student();
		head.next.name = "a2";
		head.next.code = "a002";
	
		
		Student p;//节点引用
		Student q = head;//移位引用
		for (int i=0;i<10;i++) {
			p = new Student();
			p.name = "a" + (i + 1);
			p.code = "a00" + (i + 1);
			
			q.next = p;
			q = p;
		}
		q.next = null;
		
		q = head;
		while (q!=null) {
			System.out.println(q.name);
			q = q.next;
		}
		
	}
	
	class Student {
		String name;
		String code; 
		
		Student next;
	}

	
}
