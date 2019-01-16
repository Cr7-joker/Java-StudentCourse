package com.imooc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ColloctionTest {

	public void testSort1() {
		List<Integer> integerList=new ArrayList<Integer>();
		Random random=new Random();
		Integer k;
		for(int i=0;i<10;i++) {
			do {
			k=random.nextInt(100);
			}while(integerList.contains(k));
			integerList.add(k);
			System.out.println("�ɹ����������"+k);
		}
		System.out.println("-----------����ǰ-----------");
		for(Integer integer:integerList) {
			System.out.println("Ԫ�أ�"+integer);
		}
		Collections.sort(integerList);
		System.out.println("-----------�����-----------");
		for(Integer integer:integerList) {
			System.out.println("Ԫ�أ�"+integer);
		}
	}
	
	public void testSort2() {
		List<String> stringList=new ArrayList<String>();
		stringList.add("microsoft");
		stringList.add("google");
		stringList.add("lenovo");
		System.out.println("-----------����ǰ----------");
		for (String string : stringList) {
			System.out.println("Ԫ�أ�"+string);
		}
		Collections.sort(stringList);
		System.out.println("-----------�����----------");
		for (String string : stringList) {
			System.out.println("Ԫ�أ�"+string);
		}
	}
	
	public void testSort3() {
		List<Student> studentList=new ArrayList<Student>();
		Random random=new Random();
		studentList.add(new Student(random.nextInt(1000)+"","Mike"));
		studentList.add(new Student(random.nextInt(1000)+"","tom"));
		studentList.add(new Student(random.nextInt(1000)+"","lucy"));
		studentList.add(new Student(10000+"","beyonce"));
		System.out.println("-----------����ǰ----------");
		for (Student student : studentList) {
			System.out.println("ѧ����"+student.getId()+":"+student.getName());
		}
		Collections.sort(studentList);
		System.out.println("-----------�����----------");
		for (Student student : studentList) {
			System.out.println("ѧ����"+student.getId()+":"+student.getName());
		}
		System.out.println("--------�������������--------");
		Collections.sort(studentList, new StudentComparator());
		for (Student student : studentList) {
			System.out.println("ѧ����"+student.getId()+":"+student.getName());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ColloctionTest ct=new ColloctionTest();
//		ct.testSort1();
//		ct.testSort2();
		ct.testSort3();
	}

}
