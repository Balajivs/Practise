import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.test.vimp.Employee;

public class EmployeeSort {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee("Ram",24,54000));
		empList.add(new Employee("Satish",27,44000));
		empList.add(new Employee("Mahesh",29,69000));
		empList.add(new Employee("Rakesh",23,34000));
		empList.add(new Employee("Shiva",31,94000));
		
		//empList.sort((Comparator.comparingInt(Employee::getAge)));
	        
	        System.out.println(" Sorted based on Salary ");
	        List<Employee> sortedSalList = empList.stream()
		            .sorted(Comparator.comparingDouble(Employee::getSal))
		            .collect(Collectors.toList());
	        sortedSalList.forEach(System.out::println);   
	        
		
	    System.out.println(" Sorted based on age ");
	    
	    List<Employee> sortedList = empList.stream()
	            .sorted(Comparator.comparingInt(Employee::getAge))
	            .collect(Collectors.toList());
	    sortedList.forEach(System.out::println);
	    
	    // By Name
	    System.out.println(" Sorted By Name ");
	    
	    List<Employee> sortedNameList = empList.stream()
	            .sorted((e1,e2)->e1.getName().compareTo(e2.getName()))
	            .collect(Collectors.toList());
	    sortedNameList.forEach(System.out::println);
	    
	    
	    
	    
	    System.out.println(" Sal greater that 35k ");
	    
	    Stream<Employee> sorList = empList.stream()
	    		                    .filter(e->e.getSal()>35000)
	    		                    .sorted(Comparator.comparingDouble(Employee::getSal));
	    
	    sorList.forEach(System.out::println);	
	    
	    
	    
	    
	    
	}
}
