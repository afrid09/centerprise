package com.app9;
import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(300);
		list.add(100);
		list.add(200);
		list.add(500);
		list.add(400);
		list.add(300);
		list.add(100);
		list.add(200);
		list.add(500);
		list.add(400);
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		
		list1.add(1001);
		list1.add(2002);
		list1.add(5003);
		list1.add(4004);
		
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.addAll(1, list1));
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println("============For Loop===================");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("===========ForEach====================");
		for (Integer i : list) {
			System.out.println(i);
		}
		
		System.out.println("===============================");

	}
}