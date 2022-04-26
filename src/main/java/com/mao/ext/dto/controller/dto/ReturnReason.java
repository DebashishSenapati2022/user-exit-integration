package com.mao.ext.dto.controller.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ReturnReason{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("LocalizedData") 
    private List<Object> localizedData;
    @JsonProperty("LocalizedDataKVStore") 
    private List<Object> localizedDataKVStore;
}
