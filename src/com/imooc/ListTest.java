package com.imooc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {

	public List coursesToSelect;
	public ListTest() {
		this.coursesToSelect=new ArrayList();
	}
	public void testAdd() {
		Course cr1=new Course("1","���ݽṹ");
		coursesToSelect.add(cr1);
		Course temp=(Course)coursesToSelect.get(0);
		System.out.println("����˿γ̣�"+temp.getId()+":"+temp.getName());
		
		
		Course cr2=new Course("2","C����");
		coursesToSelect.add(0,cr2);
		Course temp2=(Course)coursesToSelect.get(0);
		System.out.println("����˿γ̣�"+temp2.getId()+":"+temp2.getName());
		
		coursesToSelect.add(cr1);
		Course temp0=(Course)coursesToSelect.get(2);
		System.out.println("����˿γ̣�"+temp0.getId()+":"+temp0.getName());
		
		Course [] course={new Course("3","��ɢ��ѧ"),new Course("4","�������")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3=(Course)coursesToSelect.get(3);
		Course temp4=(Course)coursesToSelect.get(4);
		System.out.println("��������ſγ̣�"+temp3.getId()+":"+temp3.getName()+";"+temp4.getId()+":"+temp4.getName());
		
		Course [] course2={new Course("5","�ߵ���ѧ"),new Course("6","��ѧӢ��")};
		coursesToSelect.addAll(2, Arrays.asList(course2));
		Course temp5=(Course)coursesToSelect.get(2);
		Course temp6=(Course)coursesToSelect.get(3);
		System.out.println("��������ſγ̣�"+temp5.getId()+":"+temp5.getName()+";"+temp6.getId()+":"+temp6.getName());
	}

	public void testGet() {
		int size=coursesToSelect.size();
		System.out.println("�����¿γ̴�ѡ��");
		for(int i=0;i<size;i++) {
			Course cr=(Course)coursesToSelect.get(i);
			System.out.println("�γ̣�"+cr.getId()+":"+cr.getName());
		}
	}

	public void testIterator() {
		Iterator it=coursesToSelect.iterator();
		System.out.println("�����¿γ̴�ѡ(ͨ������������)��");
		while(it.hasNext()) {
			Course cr=(Course)it.next();
			System.out.println("�γ̣�"+cr.getId()+":"+cr.getName());
		}
	}
	
	public void testForEach() {
		System.out.println("�����¿γ̴�ѡ(ͨ��foreach����)��");
		for(Object obj:coursesToSelect) {
			Course cr=(Course)obj;
			System.out.println("�γ̣�"+cr.getId()+":"+cr.getName());
		}
	}
	
	public void testModify() {
		coursesToSelect.set(4, new Course("7","ë��"));
	}
	
	public void testRemove() {
//		Course cr=(Course)coursesToSelect.get(4);
//		System.out.println("�γ̣�"+cr.getId()+":"+cr.getName()+"������ɾ��");
//		coursesToSelect.remove(cr);
		Course[] courses= {(Course)coursesToSelect.get(4),(Course)coursesToSelect.get(5)}; 
		coursesToSelect.removeAll(Arrays.asList(courses));
		System.out.println("�ɹ�ɾ����");
		testForEach();
	}
	
public static void main(String[] args) {
	ListTest lt=new ListTest();
	lt.testAdd();
	lt.testGet();
	lt.testIterator();
	lt.testForEach();
	lt.testModify();
	lt.testForEach();
	lt.testRemove();
}

}