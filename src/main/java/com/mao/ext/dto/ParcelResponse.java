package com.mao.ext.dto;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class ParcelResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@SerializedName("ShipResponse")
	private ShipResponse shipResponse;

}
