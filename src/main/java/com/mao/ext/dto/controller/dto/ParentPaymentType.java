package com.mao.ext.dto.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ParentPaymentType{
    @JsonProperty("PK") 
    private String pK;
}
