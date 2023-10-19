import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.test.vimp.Employee;

//  Sort descending order 
public class EmployeeSortBasedonSal {

	public static void main(String args[]) {

		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee("Ram", 24, 54000));
		empList.add(new Employee("Satish", 27, 44000));
		empList.add(new Employee("Mahesh", 29, 69000));
		empList.add(new Employee("Rakesh", 23, 34000));
		empList.add(new Employee("Shiva", 31, 94000));

	
		
		List<Employee> sortedEmp = empList.stream()
				.sorted((e1,e2)->(int) (e2.getSal()-e1.getSal()))
				.collect(Collectors.toList());
		
		 
		 System.out.println(sortedEmp);
		
		System.out.println("--------------- ");
		
		
		// Second Highest Sal 
		
		List<Employee> secondHighest = empList.stream().sorted((e1,e2)->(int)(e2.getSal()-e1.getSal()))
				.limit(2)
				.collect(Collectors.toList());
		
		System.out.println(secondHighest);
		
		
	}
}