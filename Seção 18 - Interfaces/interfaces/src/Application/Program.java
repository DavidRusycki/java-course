package Application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do contrato:");
		
		System.out.print("Numero: ");
		Integer numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		String date = sc.next();
		System.out.print("Valor do contrato:");
		Double valueOfContract = sc.nextDouble();
		
		System.out.print("Entre com o número de parcelas: ");
		Integer numberInstallments = sc.nextInt();
		
		Contract contract = new Contract(numero, LocalDate.parse(date, Installment.dateTimeFormater), valueOfContract);
		ContractService contractService = new ContractService(new PaypalService()); 
		contractService.processContract(contract, numberInstallments);
		
		ArrayList<Installment> list = contract.getInstallments();
		
		System.out.println("Parcelas");
		for (Installment installment : list) {
			System.out.println(installment);
		}	
	}
	
}
