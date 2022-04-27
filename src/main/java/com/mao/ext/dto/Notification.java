package com.mao.ext.dto; 

import java.io.Serializable;

import lombok.Data;

@Data
public class  Notification implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String code;
    private String message;
    private String severity;
    private String source;
}
