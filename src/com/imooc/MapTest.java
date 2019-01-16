package com.imooc;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {

	public Map<String,Student> students;
	
	public MapTest() {
		this.students=new HashMap<String,Student>();
	}
	
	public void testPut() {
		Scanner console=new Scanner(System.in);
		int i=0;
		while(i<3) {
			System.out.println("请输入学生ID：");
			String ID=console.next();
			Student st=students.get(ID);
			if(st==null) {
				System.out.println("请输入学生姓名：");
				String name=console.next();
				Student newStudent=new Student(ID,name);
				students.put(ID, newStudent);
				System.out.println("成功添加学生："+students.get(ID).getName());
				i++;
			}else {
				System.out.println("该学生ID已被占用！");
				continue;
			}
		}
	}
	
	public void testKeySet() {
		Set<String> keySet=students.keySet();
		System.out.println("总共有："+students.size()+"个学生");
		for (String stuiD : keySet) {
			Student st=students.get(stuiD);
			if(st!=null)
				System.out.println("学生："+st.getName());
		}
	}
	
	public void testRemove() {
		System.out.println("请输入要删除学生的ID：");
		Scanner console=new Scanner(System.in);
		while(true) {
			String ID=console.next();
			Student st=students.get(ID);
			if(st==null) {
				System.out.println("该ID不存在！");
				continue;
			}
				students.remove(ID);
				System.out.println("成功删除学生："+st.getName());
				break;	
		}
	}
	
	public void testEntrySet() {
		Set<Entry<String,Student>> entrySet=students.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			System.out.println("取得键："+entry.getKey());
			System.out.println("对应的值为："+entry.getValue().getName());
		}
	}
	
	public void testModify() {
		System.out.println("请输入要修改的学生ID：");
		Scanner console=new Scanner(System.in);
		while(true) {
			String stuID=console.next();
			Student student=students.get(stuID);
			if(student==null) {
				System.out.println(":要修改的ID不存在，请重新输入!");
				continue;
			}
			System.out.println("当前该学生ID所对应的学生为："+student.getName());
			System.out.println("请输入新的学生姓名：");
			String name=console.next();
			Student newStudent=new Student(stuID,name);
			students.put(stuID, newStudent);
			System.out.println("修改成功！");
			break;
		}
	}
	
	public void testContainsKeyOrValue() {
		System.out.println("请输入要查询的学生ID：");
		Scanner console=new Scanner(System.in);
		String id=console.next();
		System.out.println("您输入的学生ID为："+id+",在学生映射表中是否存在："+students.containsKey(id));
		if(students.containsKey(id))
			System.out.println("对应的学生为："+students.get(id).getName());
		System.out.println("请输入要查询的学生姓名：");
		String name=console.next();
		if(students.containsValue(new Student(null,name)))
			System.out.println("学生映射表中，确实包含学生："+name);
		else
			System.out.println("在学生中不存在该学生！");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MapTest mt=new MapTest();
		mt.testPut();
		mt.testKeySet();
//		mt.testRemove();
//		mt.testEntrySet();
//		mt.testModify();
//		mt.testEntrySet();
		mt.testContainsKeyOrValue();
	}

}
