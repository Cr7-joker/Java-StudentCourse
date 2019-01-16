package com.imooc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
	public Student student;
	private Scanner console;
	public List<Course> coursesToSelect;
	public SetTest() {
		this.coursesToSelect=new ArrayList<Course>();
		console=new Scanner(System.in);
	}
	
	public void testAdd() {
		Course cr1=new Course("1","数据结构");
		coursesToSelect.add(cr1);
		Course temp=(Course)coursesToSelect.get(0);
//		System.out.println("添加了课程："+temp.getId()+":"+temp.getName());
		
		
		Course cr2=new Course("2","C语言");
		coursesToSelect.add(0,cr2);
		Course temp2=(Course)coursesToSelect.get(0);
//		System.out.println("添加了课程："+temp2.getId()+":"+temp2.getName());
		
//		coursesToSelect.add(cr1);
//		Course temp0=(Course)coursesToSelect.get(2);
//		System.out.println("添加了课程："+temp0.getId()+":"+temp0.getName());
		
		Course [] course={new Course("3","离散数学"),new Course("4","汇编语言")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3=(Course)coursesToSelect.get(2);
		Course temp4=(Course)coursesToSelect.get(3);
//		System.out.println("添加了两门课程："+temp3.getId()+":"+temp3.getName()+";"+temp4.getId()+":"+temp4.getName());
		
		Course [] course2={new Course("5","高等数学"),new Course("6","大学英语")};
		coursesToSelect.addAll(2, Arrays.asList(course2));
		Course temp5=(Course)coursesToSelect.get(2);
		Course temp6=(Course)coursesToSelect.get(3);
//		System.out.println("添加了两门课程："+temp5.getId()+":"+temp5.getName()+";"+temp6.getId()+":"+temp6.getName());
	}

	public void testForEach() {
		System.out.println("有如下课程待选(通过foreach访问)：");
		for(Object obj:coursesToSelect) {
			Course cr=(Course)obj;
			System.out.println("课程："+cr.getId()+":"+cr.getName());
		}
	}
	
	public void testForEachForSet(Student student) {
		for(Course cr:student.courses) {
			System.out.println("选择了课程："+cr.getId()+":"+cr.getName());
		}
	}
	
	public void testListContains() {
		Course course=coursesToSelect.get(0);
		System.out.println("取得课程："+course.getName());
		System.out.println("备选课程中是否包含课程："+course.getName()+","+coursesToSelect.contains(course));
		System.out.println("提示输入课程名称：");
		String name=console.next();
		Course course2=new Course();
		course2.setName(name);
		System.out.println("新创建课程："+course2.getName());
		System.out.println("备选课程中是否包含课程："+course2.getName()+","+coursesToSelect.contains(course2));
		if(coursesToSelect.contains(course2))
			System.out.println("课程："+course2.getName()+"的索引位置为："+coursesToSelect.indexOf(course2));
	}
	
	public void creat() {
		student=new Student("1","小明");
		System.out.println("欢迎学生"+student.getName()+"选课");
		Scanner console=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("请输入课程ID");
			String c=console.next();
			for (Course cr : coursesToSelect) {
				if(cr.getId().equals(c)) {
					student.courses.add(cr);
				}
					
			}
		}
	}
	
	public void testSetContains() {
		System.out.println("请输入学生已选的课程名称：");
		String name=console.next();
		Course course2=new Course();
		course2.setName(name);
		System.out.println("新创建课程："+course2.getName());
		System.out.println("备选课程中是否包含课程："+course2.getName()+","+student.courses.contains(course2));
		if(coursesToSelect.contains(course2))
			System.out.println("课程："+course2.getName()+"的索引位置为："+coursesToSelect.indexOf(course2));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SetTest st=new SetTest();
		st.testAdd();
//		st.testForEach();
//		st.creat();
//		st.testSetContains();
		st.testListContains();
		st.testForEach();

//		st.testForEachForSet(student);
	}

}
