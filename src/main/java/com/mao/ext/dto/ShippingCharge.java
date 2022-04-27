package com.mao.ext.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class  ShippingCharge implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private AccessorialCharge accessorialCharge;
    private BaseCharge baseCharge;
    private Discount discount;
    private OtherCharge otherCharge;
    private TotalCharge totalCharge;
}
