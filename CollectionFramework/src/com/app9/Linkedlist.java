package com.app9;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		list.add(300);
		list.add(100);
		list.add(200);
		list.add(500);
		list.add(400);
		list.addFirst(10000);
		list.addLast(10000);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		
		list.removeFirst();
		list.removeLast();
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		

	}

}