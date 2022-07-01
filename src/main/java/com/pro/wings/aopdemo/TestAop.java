package com.pro.wings.aopdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAop {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(RegisterAspect.class);
		
		PaymentService ps = ctx.getBean(PaymentService.class);
		ps.makePayment(120000);
	}

}
