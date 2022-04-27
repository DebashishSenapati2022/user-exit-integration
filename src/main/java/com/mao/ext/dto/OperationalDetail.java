package com.mao.ext.dto; 

import java.io.Serializable;

import lombok.Data;

@Data
public class  OperationalDetail implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String airportId;
    private String countryCode;
}
