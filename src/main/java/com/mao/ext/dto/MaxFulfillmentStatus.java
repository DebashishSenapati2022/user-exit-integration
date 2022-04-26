package com.mao.ext.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class MaxFulfillmentStatus{
    @JsonProperty("StatusId") 
    private String statusId;
}
