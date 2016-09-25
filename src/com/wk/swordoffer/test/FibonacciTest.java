package com.wk.swordoffer.test;

import com.wk.swordoffer.run.Fibonacci;

import junit.framework.TestCase;

public class FibonacciTest extends TestCase{
	public void test(){
		int result=0;
		Fibonacci f = new Fibonacci();
		result = f.fibonacci(1);
		assertEquals("equal",1,result);
	}
}
