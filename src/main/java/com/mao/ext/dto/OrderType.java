package com.mao.ext.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OrderType{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("Description") 
    private String description;
    @JsonProperty("DocTypeId") 
    private String docTypeId;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("GenerateOrderId") 
    private boolean generateOrderId;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("OrderConfigId") 
    private OrderConfigId orderConfigId;
    @JsonProperty("OrderIdMaxLength") 
    private int orderIdMaxLength;
    @JsonProperty("OrderIdPrefix") 
    private String orderIdPrefix;
    @JsonProperty("OrderIdSuffix") 
    private String orderIdSuffix;
    @JsonProperty("OrderTypeId") 
    private String orderTypeId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("ProfileId") 
    private String profileId;
    @JsonProperty("ShortDescription") 
    private String shortDescription;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
