import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter department's name: ");
		
		Department department = new Department(scanner.next());
		
		Worker worker = new Worker();
		worker.setDepartment(department);
		
		System.out.println("Enter worker data:");
		
		System.out.println("Name: ");
		worker.setName(scanner.next());
		System.out.println("Level: ");
		worker.setLevel(WorkerLevel.valueOf(scanner.next()));
		System.out.println("Base salary: ");
		worker.setBaseSalary(scanner.nextDouble());
		
		System.out.println("How many contracts to this worker? ");
		Integer quantityContracts = scanner.nextInt();

		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		for (Integer i = 0; i < quantityContracts; i++) {
			HourContract contract = new HourContract();
			System.out.println("Enter contract #"+(i+1)+" data: ");
			System.out.println("Date (DD/MM/YYYY): ");
			LocalDate local = LocalDate.parse(scanner.next(), dtf1);
			contract.setDate(Date.from(local.atStartOfDay(ZoneId.systemDefault()).toInstant()));
			System.out.println("Value per hour: ");
			contract.setValuePerHour(scanner.nextDouble());
			System.out.println("Duration (hours) ");
			contract.setHours(scanner.nextInt());
			worker.addContract(contract);
		}

		System.out.println("Enter month and year to calculate income (MM/YYYY): ");
		String date = scanner.next();
		
		String[] str = date.split("/", 2);
		
		worker.income(Integer.valueOf(str[1]), Integer.valueOf(str[0]));
		
		scanner.close();
	}

}
