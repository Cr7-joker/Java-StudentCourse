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
		Course cr1=new Course("1","���ݽṹ");
		coursesToSelect.add(cr1);
		Course temp=(Course)coursesToSelect.get(0);
//		System.out.println("����˿γ̣�"+temp.getId()+":"+temp.getName());
		
		
		Course cr2=new Course("2","C����");
		coursesToSelect.add(0,cr2);
		Course temp2=(Course)coursesToSelect.get(0);
//		System.out.println("����˿γ̣�"+temp2.getId()+":"+temp2.getName());
		
//		coursesToSelect.add(cr1);
//		Course temp0=(Course)coursesToSelect.get(2);
//		System.out.println("����˿γ̣�"+temp0.getId()+":"+temp0.getName());
		
		Course [] course={new Course("3","��ɢ��ѧ"),new Course("4","�������")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3=(Course)coursesToSelect.get(2);
		Course temp4=(Course)coursesToSelect.get(3);
//		System.out.println("��������ſγ̣�"+temp3.getId()+":"+temp3.getName()+";"+temp4.getId()+":"+temp4.getName());
		
		Course [] course2={new Course("5","�ߵ���ѧ"),new Course("6","��ѧӢ��")};
		coursesToSelect.addAll(2, Arrays.asList(course2));
		Course temp5=(Course)coursesToSelect.get(2);
		Course temp6=(Course)coursesToSelect.get(3);
//		System.out.println("��������ſγ̣�"+temp5.getId()+":"+temp5.getName()+";"+temp6.getId()+":"+temp6.getName());
	}

	public void testForEach() {
		System.out.println("�����¿γ̴�ѡ(ͨ��foreach����)��");
		for(Object obj:coursesToSelect) {
			Course cr=(Course)obj;
			System.out.println("�γ̣�"+cr.getId()+":"+cr.getName());
		}
	}
	
	public void testForEachForSet(Student student) {
		for(Course cr:student.courses) {
			System.out.println("ѡ���˿γ̣�"+cr.getId()+":"+cr.getName());
		}
	}
	
	public void testListContains() {
		Course course=coursesToSelect.get(0);
		System.out.println("ȡ�ÿγ̣�"+course.getName());
		System.out.println("��ѡ�γ����Ƿ�����γ̣�"+course.getName()+","+coursesToSelect.contains(course));
		System.out.println("��ʾ����γ����ƣ�");
		String name=console.next();
		Course course2=new Course();
		course2.setName(name);
		System.out.println("�´����γ̣�"+course2.getName());
		System.out.println("��ѡ�γ����Ƿ�����γ̣�"+course2.getName()+","+coursesToSelect.contains(course2));
		if(coursesToSelect.contains(course2))
			System.out.println("�γ̣�"+course2.getName()+"������λ��Ϊ��"+coursesToSelect.indexOf(course2));
	}
	
	public void creat() {
		student=new Student("1","С��");
		System.out.println("��ӭѧ��"+student.getName()+"ѡ��");
		Scanner console=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("������γ�ID");
			String c=console.next();
			for (Course cr : coursesToSelect) {
				if(cr.getId().equals(c)) {
					student.courses.add(cr);
				}
					
			}
		}
	}
	
	public void testSetContains() {
		System.out.println("������ѧ����ѡ�Ŀγ����ƣ�");
		String name=console.next();
		Course course2=new Course();
		course2.setName(name);
		System.out.println("�´����γ̣�"+course2.getName());
		System.out.println("��ѡ�γ����Ƿ�����γ̣�"+course2.getName()+","+student.courses.contains(course2));
		if(coursesToSelect.contains(course2))
			System.out.println("�γ̣�"+course2.getName()+"������λ��Ϊ��"+coursesToSelect.indexOf(course2));
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
