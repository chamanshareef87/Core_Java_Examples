package com.classes.nestedclasses;

import java.math.BigDecimal;

public class AddBigDecima {

	public static void main(String[] args) {

		BigDecimal BigDec1 = new BigDecimal("123812638712322343423342342344.23234444442323432");
		BigDecimal BigDec2 = new BigDecimal("121366992234389183234345234234.111112342123");
		 
        // Addition of two BigDecimals
        BigDec1 = BigDec1.add(BigDec2);
        System.out.println("BigDec1 = " + BigDec1);

	}

}
