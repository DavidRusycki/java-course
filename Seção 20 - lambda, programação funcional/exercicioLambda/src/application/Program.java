package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter full file path: ");
		String path = sc.next();
		
		System.out.print("Enter salary: ");
		Double salary = sc.nextDouble();
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while(line != null) {
				String[] values = line.split(",");
				
				Employee employee = new Employee(values[0], values[1], Double.parseDouble(values[2]));
				
				list.add(employee);
				
				line = br.readLine();
			}
			
			List<String> newList = list.stream()
				.filter(e -> e.getSalary() > salary)
				.map(e -> e.getEmail())
				.sorted()
				.collect(Collectors.toList());
			
			newList.forEach(e -> System.out.println(e));
			
			Double acu = 0.0;
			
			Double sum = list.stream()
				.filter(e -> e.getName().charAt(0) == 'M')
				.map(e -> e.getSalary())
				.reduce(0.0, (x,y) -> x + y);
			
			System.out.print("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		sc.close();
	}
	
}
