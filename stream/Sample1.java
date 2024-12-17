package com.app.stream;

import java.util.stream.Stream;

public class Sample1 {

	public static void main(String[] args) {
		Integer i[]=new Integer[]{23,34,45,23,34,45,23};
		Stream<Integer> stream0=Stream.of(i);
		stream0.forEach((x)-> System.out.print(x+","));
		System.out.println();
		
		Stream<Integer> stream1=Stream.of(34,45,56,67,23,63,63,63,73);
		stream1.forEach((x)-> System.out.print(x+","));
		System.out.println();

		Stream<String> stream2=Stream.of("sunday","monday","tuesday","wednesday","thursday","friday","saturday");
		stream2.forEach((x)-> System.out.print(x+","));
		System.out.println();
}
}