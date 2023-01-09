package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Set<Student> hashList = new HashSet<Student>();
		
		System.out.println("How manu students for course A?");
		Integer numberA = sc.nextInt();
		
		for (int i = 1; i <= numberA; i++) {
			hashList.add(new Student(sc.nextInt()));
		}
		
		System.out.println("How manu students for course B?");
		Integer numberB = sc.nextInt();

		for (int i = 1; i <= numberB; i++) {
			hashList.add(new Student(sc.nextInt()));
		}
		
		System.out.println("How manu students for course C?");
		Integer numberC = sc.nextInt();
		
		for (int i = 1; i <= numberC; i++) {
			hashList.add(new Student(sc.nextInt()));
		}
		
		System.out.println("Total students: " + hashList.size());
		
		sc.close();
	}
	
}
