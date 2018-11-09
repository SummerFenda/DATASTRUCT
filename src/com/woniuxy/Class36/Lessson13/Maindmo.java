package com.woniuxy.Class36.Lessson13;

import java.util.*;

public class Maindmo {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//map :字典 Key-value
		//HashMap<k,v> :哈希表
		/*Person per = new Person();
		per.name = "xiaozhao";
		HashMap<String, Person> contact = new HashMap<String , Person>();
		contact.put("x", per);
		
		Person per1 = new Person();
		per1.name = "Anna";
		contact.put("A",per1);
		
		Person target= contact.get("A");
		System.out.println(target.name);*/
		
		
		//建立一个map,保存相关信息
		/*HashMap<String,Object> perInfo = new HashMap<String, Object>();
		perInfo.put("name", per.name);
		perInfo.put("age", per.age);
		perInfo.put("height", per.height);
		perInfo.put("id", per.id);
		
		per.name = (String) perInfo.get("name");
		//System.out.println(per.name);
		//删除元素，找不到元素的情况下会获得null值
		//perInfo.remove("name");
		String isname = (String) perInfo.get("name");
		System.out.println(isname);

		System.out.println(perInfo.clone());*/
		
		//解决方案一
		
		/*String [] keys = new String[perInfo.keySet().size()];// 创建一个keys数组
		perInfo.keySet().toArray(keys);// 将 persInfo的值赋给keys
		for (int i = 0; i < keys.length; i++) {
			if (keys[i].contains("i")) {
				perInfo.remove(keys[i]);
			}
		}*/
		//解决方案二
		/*首先定义一个数组，将要删除的数据保存至另一个数组中，之后遍历该数组之后就可以删除*/
		/*ArrayList<String> removelist = new ArrayList<String>();
		for (String key : perInfo.keySet()) {
			if(key.contains("i")) {
				//直接移除会导致运算过程错误
				//perInfo.remove(key);
				removelist.add(key);
			}
		}
		for (String key : removelist) {
			perInfo.remove(key);
		}
		System.out.println(perInfo);*/
		// 一次性列举所有元素
		//不能在foreach 中对数组  map set等集合进行删除 
		
		
		//1. 任意找到5个以a、e、i、o、u开头的英文单词，然后放入map，形成{"a" = "animal"}的结构
		
		HashMap<String, String> words = new HashMap<String, String>();
		words.put("a", "area");
		words.put("e", "elephant");
		words.put("i", "identy");
		words.put("o", "overcome");
		words.put("u", "undentifed");
		System.err.println(words);
		
		
		HashMap<Character, Integer>  charkeys = new HashMap<Character, Integer>();
		for (char  ch= 'a'; ch <='z'; ch++) {
			//charkeys.put(ch, int(ch));
			charkeys.put(ch, new Integer(ch));
		}
		System.out.println(charkeys);
		
		
		
		//2. 定义5个person对象，用其名字作为key，对象作为value，放入map
		
		HashMap<String, Person>  man= new HashMap<String, Person>();
		Person one = new Person("程序", 31, 200.0, "235");	
		Person two = new Person("王二", 41, 200.0, "234");	
		Person there = new Person("小李", 51, 200.0, "236");
		man.put(one.name,one);
		man.put(two.name,two);
		man.put(there.name,there);
		System.out.println(man);
		//3. 从上述字典中，删除key长度大于5的对象
		ArrayList<String> removelist = new ArrayList<String>();
		for (String string : man.keySet()) {
			if(string.length()>5) {
				removelist.add(string);
			}
		}
		for (String string : removelist) {
			man.remove(string);
		}
		HashSet<String>  set =new HashSet<String >();
		set.add("a");
		set.add("a");
		set.add("a");
		/*集set的作用
		 * 1.去重复
		 * 2.遍历，乱序
		 * */
		for (String string : set) {
			
		}
		System.out.println(set.size());
		/*tremap
		 * 用法暂时与hashmap一致
		 * */
		//list
	//Linklist,插入效率非常高，内存零散分布
		//更改元素较慢
		
		
		//arraylist,插入效率非常低，内存连续分布
		//更改元素快
		//HASHmap:红黑树
		//hashtable: b+树
		
		Teacher tea = new Teacher();
		tea.start();
		
		
		
		
		
	}

}
