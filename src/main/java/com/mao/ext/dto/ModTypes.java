package com.mao.ext.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ModTypes{
    @JsonProperty("OrderLine") 
    private List<String> orderLine;
}
