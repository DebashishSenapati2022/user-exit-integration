package com.mao.ext.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OrderLineRefundCharge{
    @JsonProperty("EligibleRefundCharges") 
    private List<EligibleRefundCharge> eligibleRefundCharges;
    @JsonProperty("OrderLineId") 
    private String orderLineId;
}
