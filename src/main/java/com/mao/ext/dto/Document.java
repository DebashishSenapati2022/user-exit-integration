package com.mao.ext.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class  Document implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String documentId;
    private String documentType;
    private String formatType;
    private String image;
}
