package com.mao.ext.dto.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class EligibleRefundCharge{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("Extended") 
    private Extended extended;
}
