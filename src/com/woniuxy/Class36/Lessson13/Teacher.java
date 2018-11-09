package com.woniuxy.Class36.Lessson13;

import java.util.ArrayList;
import java.util.HashMap;

public class Teacher {

	HashMap<String, ArrayList<Student>> phoneGroup = new HashMap<String, ArrayList<Student>>();
	ArrayList<Student> stud = new ArrayList<Student>();

	void start() {
		for (int i = 0; i < 30; i++) {
			Student stu = new Student();
			if (i%2 == 0) {
				stu.phone = "180" + Math.random()*100000000;
			} else {
				stu.phone = "189" + Math.random()*100000000;
			}

			stud.add(stu);
			stu.initScore();
			this.spiltgroup();
		}
	}

	void spiltgroup() {
		ArrayList<Student> numberGroup1 = new ArrayList<Student>();
		ArrayList<Student> numberGroup2 = new ArrayList<Student>();
		phoneGroup.put("180", numberGroup1);
		phoneGroup.put("189", numberGroup2);
		for (Student each : stud){
			if (each.phone.substring(0, 3).equals("180")) {
				phoneGroup.get("180").add(each);
			}
		}
		System.out.println(phoneGroup);
	}

}
