package com.pro.wings.aopdemo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

	@Before("execution(* com.pro.wings.aopdemo.PaymentService.makePayment(..))")
	public void printBefore() {
		System.out.println("Payment started...Before");
	}

	@After("execution(* com.pro.wings.aopdemo.PaymentService.makePayment(..))")
	public void printAfter() {
		System.out.println("Payment started...After");

	}

	@AfterReturning("execution(* com.pro.wings.aopdemo.PaymentService.makePayment(..))")
	public void printAfterReturning() {
		System.out.println("Payment started...After Returning");
	}

	@AfterThrowing("execution(* com.pro.wings.aopdemo.PaymentService.makePayment(..))")
	public void printAfterThrowing() {
		System.out.println("Payment started...After Throwing");
	}

	@Around("execution(* com.pro.wings.aopdemo.PaymentService.makePayment(..))")
	public void printAroundAdvice() {
		System.out.println("Payment started...Around Advice");
	}
}