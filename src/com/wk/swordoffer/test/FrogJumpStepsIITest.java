package com.wk.swordoffer.test;

import com.wk.swordoffer.run.FrogJumpStepsII;

import junit.framework.TestCase;

public class FrogJumpStepsIITest extends TestCase{
	public void test(){
		int result =0;
		int target =4;
		FrogJumpStepsII fjsII = new FrogJumpStepsII();
		result =fjsII.JumpFloorII(target);
		System.out.println(result);
	}
}
