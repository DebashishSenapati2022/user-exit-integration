package com.mao.ext.dto; 

import java.io.Serializable;

import lombok.Data;

@Data
public class  CompletedHoldAtLocationDetail implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Address address;
    private Contact contact;
}
