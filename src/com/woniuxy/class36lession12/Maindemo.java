package com.woniuxy.class36lession12;

import java.sql.Date;
import java.util.ArrayList;



public class Maindemo {

	public static void main(String[] args) {
		Linklist link = new Linklist();
		link.start();
		
		
		
		
		
		
	StructSearch<Date> dateSearch = new StructSearch<Date>();
	Date date = new Date(2);
	Date yesterday = new Date(date.getTime()-(24*3600*1000));
	
	
	//通过时间查找，找目标时间
	//赋值查找目标
	dateSearch.target = date;
	Date [] dates = {date,yesterday };
	//赋值查找数据源
	dateSearch.sourceArr = dates;
	//开始查找
	int index = dateSearch.indexof();
	System.out.println(index);
	
	System.out.println("summerday");
		
	StructSearch <String> StringSearch = new StructSearch <String>();	
	String str1 = "小赵";
	String str2 = "爱学习";
	StringSearch.target = "爱学习";
	String [] str ={str1, str2};
	StringSearch.sourceArr=str;
	int temp = StringSearch.indexof();
	System.out.println(temp);
	
	//数组操作
	ArrayList<Object> arr = new  ArrayList<Object>();
	//增删改查：
	arr.add('a');
	System.out.println(arr);
	arr.add('b');
	arr.add('c');
	System.out.println(arr);
	arr.remove(0);//删除下标
	System.out.println(arr);
	arr.remove('b');//删除元素
	System.out.println(arr);
	arr.subList(0, 1);//截取一个子数组，子数组的类型为list
	arr.add(1,'b');//相当于insert
	arr.contains("b");//查找是否有B
	arr.indexOf("d");//查找在哪里下标
	arr.set(1, "c");//给指定数组元素赋值
	
	
	
	String [] letters = {
					"ab",
					"abc",
					"cd",
					"xyz",
					"aaaa",
					"yaaaa",
					"80857",
					"a0",
	};
	ArrayList<String> arrfind = new  ArrayList<String>();
	for (String eachstr:letters) {
		if(eachstr.substring(0,1).equals('a')) {
			arrfind.add(eachstr);
		}
		
	}
	System.out.println("arrfind");
	
	/*for(int i = 0 ;i < 8;i++) {
		arrfind.add(letters[i]);
		 if(arrfind.contains("a") &  ) {
		 }
		
	}*/
	
	
	//Java中的集合类
		//集合：多个相同的事物放在一起进行特定的批量性操作
		//集合操作：排序 查找 求和 转格式 连接多个字符串 二维数组坐标
	//集合的类型：数组式结构  链式结构 树形结构  
	//长度固定 数组存在的问题主要是长度固定 无法扩展 类型单一 无法动态设定   不能对整体操作
	//数组arrylist 的要求
	//不能放非对象 可以放多个类型 但是最好确定类型 
	//数组必须严格遵循对象操作流程  （初始化  赋值  ）
	
	
		
		
		

	}

}
