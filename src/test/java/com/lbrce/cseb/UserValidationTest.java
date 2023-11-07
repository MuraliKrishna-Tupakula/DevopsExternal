package com.lbrce.cseb;

import org.junit.Test;

import junit.framework.Assert;

public class UserValidationTest {

	@Test
	public void testCase1()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("", ""));
	}
	@Test
	public void testCase2()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(true,uv.check("sai","sai@123"));
	}
}
