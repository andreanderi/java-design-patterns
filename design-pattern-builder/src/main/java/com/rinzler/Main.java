package com.rinzler;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		Invoice invoice = new InvoiceBuilder().withAddress("sesame street 666")
				.withDueDate(new Date())
				.with(new InvoiceItem("chips", 13))
				.with(new InvoiceItem("ice cream", 13))
				.withPaymentResponsible("Finn the human")
				.withValue(666)
				.build();
		
		System.out.println(invoice.getValue());

	}

}
