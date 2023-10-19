package com.test.vimp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicatesString {

	public static void main(String[] args) {

		List<String> companies = new ArrayList<String>();

		companies.add("Meta");
		companies.add("Apple");
		companies.add("Amazon");
		companies.add("Netflix");
		companies.add("Meta"); 
		companies.add("Google");
		companies.add("Apple"); 

		System.out.println(" Original List with duplicates : \n");
		companies.forEach(System.out::println);

		List<String> distinctCompanies = companies.stream().distinct().collect(Collectors.toList());
		
		//print unique elements
        System.out.println(" Unique elements : \n");
        distinctCompanies.forEach(System.out::println);
        
        
        // 3. get duplicate elements
        for (String distinctCompany : distinctCompanies) {
            companies.remove(distinctCompany);
        }
        System.out.println(" Duplicate elements : \n");
        companies.forEach(System.out::println);
	}
}
