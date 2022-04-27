package com.mao.ext.dto; 

import java.io.Serializable;

import lombok.Data;

@Data
public class  Contact implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String companyName;
    private String department;
    private String email;
    private String faxNumber;
    private String personName;
    private String phoneExtension;
    private String phoneNumber;
    private String title;
}
