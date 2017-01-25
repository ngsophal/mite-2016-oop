package edu.rupp.repo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
/*4 : write Own class : MyUtils with one static method as below*/
public class ExcerciseJavaCollection4 {
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
        //List<String> countries = (List<String>) CountriesList.getAllCountries();
		Set<String> hSet = new HashSet<String>();
		Set<String> tSet = new TreeSet<String>();
		Set<String> lhSet = new LinkedHashSet<String>();
		
		System.out.printf("Set type = %s ", hSet.getClass().getName());
		MyUtils.checkDuplicate(hSet, countries);
		
		System.out.printf("Set type = %s ", tSet.getClass().getName());
        MyUtils.checkDuplicate(tSet, countries);
        
        System.out.printf("Set type = %s ", lhSet.getClass().getName());
        MyUtils.checkDuplicate(lhSet, countries);
        //Object.getClass().getName()

    }
}
