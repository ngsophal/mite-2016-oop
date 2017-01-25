package edu.rupp.repo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/*6 : Convert array above into Map (HashMap, TreepMap) by key is countryName, value is number of times that countryName found and display all elements using entrySet() methods
 */
public class ExcerciseJavaCollection6 {
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
		
		
		Map<String, Integer> mapCoun1 = new HashMap<String, Integer>();//HashMap		
		Map<String, Integer> mapCoun2 = new TreeMap<String, Integer>();//TreeMap
		for(String item:setCountries){
			Integer isTotalDuplicated = 0;
			isTotalDuplicated =countingDuplicatedCountries(item, countries);
			mapCoun1.put(item, isTotalDuplicated);
			mapCoun2.put(item, isTotalDuplicated);
		}	
		
		//Display        
		System.out.println("--------display all elements of HashMap using entrySet() methods-----");
        Set<Map.Entry<String, Integer>> entries = mapCoun1.entrySet(); 
        for (Map.Entry<String, Integer> entry : entries) {
            String code = entry.getKey();
            Integer country = entry.getValue();
            System.out.println(code + " => " + country);
        }
        
        System.out.println("--------display all elements of TreeMap using entrySet() methods-----");
        Set<Map.Entry<String, Integer>> entries2 = mapCoun2.entrySet(); 
        for (Map.Entry<String, Integer> entry : entries2) {
            String code = entry.getKey();
            Integer country = entry.getValue();
            System.out.println(code + " => " + country);
        }		
		
    }
	//method
	public static Integer countingDuplicatedCountries(String country, String[] countries){
		int total =0;
		for(String item:countries){
			if(item == country){
				total++;			
			}
		}
		return total;
	}	
	//end method
}
