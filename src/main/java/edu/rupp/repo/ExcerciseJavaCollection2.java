package edu.rupp.repo;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
/*2 - Find duplicate country and display all unique countries name in aphabet order*/
public class ExcerciseJavaCollection2 {
	public static void main(String[] args) {
		String[] countries = {
				"Cambodia",
				"VietNam",
				"Thailand",
				"USA",
				"Cambodia",
				"France",
				"England",
				"VietNam",
				"Cambodia"
				};
		
		SortedSet<String> setCountries = new TreeSet<String>();
		for(String item:countries){
			setCountries.add(item);
		}
		
		System.out.println("Duplicated Country name is :");
		listOfduplicatedCountries(setCountries, countries);
		
		System.out.printf("There are %d countries:", setCountries.size());
		System.out.println(setCountries);
	}
	
	
	//method
	public static void listOfduplicatedCountries(Set<String> list, String[] c){
		for(String item:list){
			String isDuplicated = "";
			isDuplicated =isDuplicatedCountries(item, c);
			if(isDuplicated != ""){
				System.out.println(isDuplicated);
			}
		}	
	}
	public static String isDuplicatedCountries(String country, String[] countries){
		int total =0;
		for(String item:countries){
			if(item == country){
				total++;			
			}
		}
		
		if(total > 1){
			return country;
		}
		return "";
	}
	//end method	
}
