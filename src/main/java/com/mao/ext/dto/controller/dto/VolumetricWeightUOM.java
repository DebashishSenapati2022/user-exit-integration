package com.mao.ext.dto.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class VolumetricWeightUOM{
    @JsonProperty("Code") 
    private String code;
}