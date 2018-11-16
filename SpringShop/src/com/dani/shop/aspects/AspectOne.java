package com.dani.shop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.dani.shop.model.Articulo;

@Aspect
@Component
public class AspectOne {

	@Before("execution(* com.dani.shop.*.*.*(..))")
	public void before0(JoinPoint jp) {
		System.out.println("---> ASPECT @Before com.dani.shop.*.*.* ---> " + jp.toLongString());
		for (Object op : jp.getArgs()) {
			if (op instanceof Articulo) {
				((Articulo) op).setMarca("M-" + ((Articulo) op).getMarca());
			}
		}
	}

	@Before("execution(* com.dani.shop.services.*.*(..))")
	public void before1(JoinPoint jp) {
		System.out.println("---> ASPECT @Before com.dani.shop.services.*.* ---> " + jp.toLongString());
		for (Object op : jp.getArgs()) {
			if (op instanceof Articulo) {
				((Articulo) op).setMarca("M-" + ((Articulo) op).getMarca());
			}
		}
	}

	@Before("execution(* com.dani.shop.controllers.*.*(..))")
	public void before(JoinPoint jp) {
		System.out.println("---> ASPECT @Before com.dani.shop.controllers.*.* ---> " + jp.toLongString());
		for (Object op : jp.getArgs()) {
			if (op instanceof Articulo) {
				((Articulo) op).setMarca("M-" + ((Articulo) op).getMarca());
			}
		}
	}

	@After("execution(* com.dani.shop.services.*.*(..))")
	public void after0(JoinPoint jp) {
		System.out.println("---> ASPECT @After com.dani.shop.services.*.* ---> " + jp.toLongString());
		for (Object op : jp.getArgs()) {
			if (op instanceof Articulo) {
				((Articulo) op).setMarca("M-" + ((Articulo) op).getMarca());
			}
		}
	}

	@After("execution(* com.dani.shop.controllers.*.*(..))")
	public void after1(JoinPoint jp) {
		System.out.println("---> ASPECT @After com.dani.shop.controllers.*.* ---> " + jp.toLongString());
		for (Object op : jp.getArgs()) {
			if (op instanceof Articulo) {
				((Articulo) op).setMarca("M-" + ((Articulo) op).getMarca());
			}
		}
	}

	@After("execution(* com.dani.shop.*.*.*(..))")
	public void after(JoinPoint jp) {
		System.out.println("---> ASPECT @After com.dani.shop.*.*.* ---> " + jp.toLongString());
		for (Object op : jp.getArgs()) {
			if (op instanceof Articulo) {
				((Articulo) op).setMarca("M-" + ((Articulo) op).getMarca());
			}
		}
	}
}
