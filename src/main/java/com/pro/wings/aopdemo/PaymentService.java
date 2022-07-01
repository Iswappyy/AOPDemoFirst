package com.pro.wings.aopdemo;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
	
	public int makePayment(int salary) {
		
		//System.out.println(salary/0);
		System.out.println("Amount debited...."+salary);
	
		
		return salary;
		
	}

	
}
