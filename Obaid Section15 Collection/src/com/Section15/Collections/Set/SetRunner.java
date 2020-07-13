package com.Section15.Collections.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//import com.Section15.Collections.List.Student;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> characters = new ArrayList<>();
		Character ch1 = new Character('A');
		Character ch2 = new Character('Z');
		Character ch3 = new Character('A');
		Character ch4 = new Character('B');
		Character ch5 = new Character('Z');
		Character ch6 = new Character('F');
		
		characters.add(ch1);
		characters.add(ch2);
		characters.add(ch3);
		characters.add(ch4);
		characters.add(ch5);
		characters.add(ch6);
		
		//unique - Set
		//Tree sorted  navigable
		//Hash most efficient
		//LinkedHash insertion order
		
		Set<Character> treeSet = new TreeSet<>(characters);
		System.out.println("tree set :" + treeSet);
		
		Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
		System.out.println("linkedHashSet :"+ linkedHashSet);
		
		Set<Character> hashSet = new HashSet<>(characters);
		System.out.println("hashSet :"+ hashSet);
		
	}

}
