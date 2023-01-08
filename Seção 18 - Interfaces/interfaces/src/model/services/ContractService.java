package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;
import model.interfaces.OnlinePaymentService;

public class ContractService {

	private OnlinePaymentService paymentService;
	
	public ContractService(OnlinePaymentService paymentService) {
		this.setPaymentService(paymentService);
	}

	public void processContract(Contract contract, Integer mounths) {
		Double baseValue = contract.getTotalValue() / mounths;
		
		for (int i = 1; i <= mounths; i++) {
			LocalDate newDate = contract.getDate().plusMonths(i);
			Double withInterestValue = this.paymentService.interest(baseValue, i);
			Double totalValueFromInstallment = this.getPaymentService().paymentFee(withInterestValue);
			Installment installment = new Installment(newDate, totalValueFromInstallment);
			
			contract.addInstallment(installment);
		}
	}

	public OnlinePaymentService getPaymentService() {
		return paymentService;
	}

	private void setPaymentService(OnlinePaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
}
