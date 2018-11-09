package com.woniuxy.Class36.Lessson13;

import java.util.ArrayList;
import java.util.HashMap;

public class Person {
	String name;
	int age;
	Double height;
	String id;
	public Person(String name,int age,Double height,String id){
		this.age = age;
		this.id = id ;
		this.name = name;
		this.height = height;
	}
	/*HashMap<String, Person> manName(Person per){
		HashMap<String, Person> Infor = new HashMap<String, Person>();
		Infor.put(this.name, per);
		return Infor;
	}*/
	
}