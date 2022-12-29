import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		/* Utilização simples do Enum criado. */
		Order order = new Order(1090, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		/* Instanciando o valor de um Enum a partir de uma string. Pois o front end irá enviar uma string e não um objeto. */
		OrderStatus orderStatus1 = OrderStatus.valueOf("PENDING_PAYMENT");
		OrderStatus orderStatus2 = OrderStatus.PENDING_PAYMENT;
		
		System.out.println(orderStatus1);
		System.out.println(orderStatus2);
	}

}

