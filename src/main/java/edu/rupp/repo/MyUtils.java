package edu.rupp.repo;

import java.util.Set;

public class MyUtils {
	public static void checkDuplicate(Set<String> s, String[] countries) {
		//Set<String> s = new HashSet<>();
		Set<String> set = s;
		for(String item:countries){
			set.add(item);
		}
		System.out.println(set);
	}	
}
