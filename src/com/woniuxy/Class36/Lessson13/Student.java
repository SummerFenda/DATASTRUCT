package com.woniuxy.Class36.Lessson13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Student {
	String name;
	int age;
	double height;
	String id;
	double  score;
	String phone;
	
	ArrayList<Double> scores = new ArrayList<Double>();
	
	void initScore() {
		for (int i=0;i<5;i++) {
			Random ran = new Random();
			scores.add(new Double(ran.nextInt(100)));
		}
		System.out.println(scores);//输出每个学生的各科成绩
	}

	
	
	
}
