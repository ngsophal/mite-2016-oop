package edu.rupp.repo;

import java.util.LinkedHashSet;
import java.util.Set;
/*3 - convert array above into LinkedHashSet Object and write a method named as isCountryExist(Set,countryName) 
return as boolean this method to check countryName existed or not*/
public class ExcerciseJavaCollection3 {
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
		String[] otherCountries = {
				"Canada",				
				"Thailand",
				"Germany",
				"Cambodia"
				};
		
		Set<String> setCountries = new LinkedHashSet<String>();
		for(String item:countries){
			setCountries.add(item);
		}
		
		for(String item:otherCountries){
			Boolean isExist = false;
			isExist =isCountryExist(setCountries, item);
			if(isExist){
				System.out.printf(" Country name :[%s] found in the object%n", item);
			}else{
				System.out.printf(" Country name :[%s] is not found in the object%n", item);
			}
		}
	}
	
	//method	
	public static boolean isCountryExist(Set<String> list, String c){
		boolean result = false;
		if(list.contains(c)){
			result = true;			
		}
		return result;
	}
	//end method
}
