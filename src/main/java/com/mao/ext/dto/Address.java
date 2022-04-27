package com.mao.ext.dto; 
import java.io.Serializable;
import java.util.List; 

import lombok.Data;

@Data
public class  Address implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String city;
    private String countryCode;
    private String postalCode;
    private boolean residential;
    private String stateOrProvinceCode;
    private List<String> streetLines;
}
