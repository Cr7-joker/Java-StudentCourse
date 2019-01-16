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
			System.out.println("������ѧ��ID��");
			String ID=console.next();
			Student st=students.get(ID);
			if(st==null) {
				System.out.println("������ѧ��������");
				String name=console.next();
				Student newStudent=new Student(ID,name);
				students.put(ID, newStudent);
				System.out.println("�ɹ����ѧ����"+students.get(ID).getName());
				i++;
			}else {
				System.out.println("��ѧ��ID�ѱ�ռ�ã�");
				continue;
			}
		}
	}
	
	public void testKeySet() {
		Set<String> keySet=students.keySet();
		System.out.println("�ܹ��У�"+students.size()+"��ѧ��");
		for (String stuiD : keySet) {
			Student st=students.get(stuiD);
			if(st!=null)
				System.out.println("ѧ����"+st.getName());
		}
	}
	
	public void testRemove() {
		System.out.println("������Ҫɾ��ѧ����ID��");
		Scanner console=new Scanner(System.in);
		while(true) {
			String ID=console.next();
			Student st=students.get(ID);
			if(st==null) {
				System.out.println("��ID�����ڣ�");
				continue;
			}
				students.remove(ID);
				System.out.println("�ɹ�ɾ��ѧ����"+st.getName());
				break;	
		}
	}
	
	public void testEntrySet() {
		Set<Entry<String,Student>> entrySet=students.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			System.out.println("ȡ�ü���"+entry.getKey());
			System.out.println("��Ӧ��ֵΪ��"+entry.getValue().getName());
		}
	}
	
	public void testModify() {
		System.out.println("������Ҫ�޸ĵ�ѧ��ID��");
		Scanner console=new Scanner(System.in);
		while(true) {
			String stuID=console.next();
			Student student=students.get(stuID);
			if(student==null) {
				System.out.println(":Ҫ�޸ĵ�ID�����ڣ�����������!");
				continue;
			}
			System.out.println("��ǰ��ѧ��ID����Ӧ��ѧ��Ϊ��"+student.getName());
			System.out.println("�������µ�ѧ��������");
			String name=console.next();
			Student newStudent=new Student(stuID,name);
			students.put(stuID, newStudent);
			System.out.println("�޸ĳɹ���");
			break;
		}
	}
	
	public void testContainsKeyOrValue() {
		System.out.println("������Ҫ��ѯ��ѧ��ID��");
		Scanner console=new Scanner(System.in);
		String id=console.next();
		System.out.println("�������ѧ��IDΪ��"+id+",��ѧ��ӳ������Ƿ���ڣ�"+students.containsKey(id));
		if(students.containsKey(id))
			System.out.println("��Ӧ��ѧ��Ϊ��"+students.get(id).getName());
		System.out.println("������Ҫ��ѯ��ѧ��������");
		String name=console.next();
		if(students.containsValue(new Student(null,name)))
			System.out.println("ѧ��ӳ����У�ȷʵ����ѧ����"+name);
		else
			System.out.println("��ѧ���в����ڸ�ѧ����");
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
