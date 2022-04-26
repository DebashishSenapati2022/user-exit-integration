package com.mao.ext.dto.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Root{
    @JsonProperty("PaymentGatewayRequest") 
    private PaymentGatewayRequest paymentGatewayRequest;
}
