package com.mao.ext.dto.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ReferenceType{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("Extended") 
    private Extended extended;
}
