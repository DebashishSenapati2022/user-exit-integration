package com.mao.ext.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class  AccessorialCharge implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int amount;
    private String currency;
}
