package com.mao.ext.dto.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class MaxReturnStatus{
    @JsonProperty("StatusId") 
    private String statusId;
}
