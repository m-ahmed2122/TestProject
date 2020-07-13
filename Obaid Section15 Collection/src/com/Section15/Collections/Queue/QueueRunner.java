package com.Section15.Collections.Queue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueRunner {
	
class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String value1, String value2) {
		
		return Integer.compare(value1.length(), value2.length());
	}
	
}

	public static void main(String[] args) {
		
		List<String> queue = new ArrayList<>();
		String str1 = new String("Zebra");
		String str2 = new String("Monkey");
		String str3 = new String("Cat");
		
		queue.add(str1);
		queue.add(str2);
		queue.add(str3);
		
		System.out.println(queue);
		
		
		//Queue<String> queue = new PriorityQueue<>();
		//queue.addAll(List.of("Zebra", "Monkey","Cat"))
	}

}
