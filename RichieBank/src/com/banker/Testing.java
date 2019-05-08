package com.banker;

import com.example.junit.Ignore;
import com.example.junit.Test;

public class Testing {
	
	@Test
    public void isDeposit() {
        assertEquals("should return 9", 9, calc.isSum(4,5));
        System.out.println("method to check the equality of the two integers tested");
    }
    @Ignore
    @Test
    public void isDiff() {
        assertEquals("should return 6", 6, calc.isDiff(15,9));
        System.out.println("method to check the equality of the two integers tested");
    }
	
	

}
