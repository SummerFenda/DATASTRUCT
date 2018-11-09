package com.woniuxy.class36lession12;

public class StructSearch <T>{
//数据结构操作
	T target ;//搜索目标
	T [] sourceArr;//搜索数据源

	int indexof() {
		for (int i = 0; i < sourceArr.length; i++) {
			if (target.equals(sourceArr[i])) {
				return i;
			}
		}
		return -1;
	}
	
	
	
	
	
	
//算法
	
	
	
	
}
