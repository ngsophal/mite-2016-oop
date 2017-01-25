package edu.rupp.repo;

import java.util.HashSet;
import java.util.Set;
/*
 1 - Find duplicate country  and display all unique countries name using HashSet  ( mehtod add , size )
 */
public class ExcerciseJavaCollection1 {
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
		Set<String> setCountries = new HashSet<String>();
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
