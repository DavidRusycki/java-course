package model.services;

import model.interfaces.OnlinePaymentService;

public class PaypalService implements OnlinePaymentService{

	@Override
	public Double paymentFee(Double amount) {
		amount += amount * 0.02;
		return amount;
	}

	@Override
	public Double interest(Double amount, Integer month) {
		amount +=  amount * 0.01 * month;
		return amount;
	}
	
}
