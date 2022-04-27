package com.mao.ext.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class  JournalDetails implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String errorDetails;
    private int externalSystemProcessingTime;
    private Date externalSystemRequestTimeStamp;
    private String rawRequest;
    private String rawResponse;
}
