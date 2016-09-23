package com.wk.swordoffer.test;

import com.wk.swordoffer.run.FrogJumpSteps;

import junit.framework.TestCase;

public class FrogJumpStepsTest extends TestCase{
	public void test(){
		int result = 0;
		FrogJumpSteps fjs = new FrogJumpSteps();
		result = fjs.JumpFloor(4);
		System.out.println(result);
	}
}
