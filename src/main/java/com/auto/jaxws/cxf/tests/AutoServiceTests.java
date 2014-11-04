package com.auto.jaxws.cxf.tests;

import static org.junit.Assert.*;

import org.junit.Test;


import com.auto.jaxws.cxf.utils.*;
public class AutoServiceTests {



	
	@Test
	public void testName() throws Exception {
		assertEquals("YWRtaW4xMjM0NQ==", true, new TokenChecker().Check("admin", "12345", "YWRtaW4xMjM0NQ=="));
	}

}
