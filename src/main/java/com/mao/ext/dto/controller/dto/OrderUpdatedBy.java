package com.mao.ext.dto.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OrderUpdatedBy{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedByDate") 
    private String updatedByDate;
    @JsonProperty("UpdatedByUser") 
    private String updatedByUser;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
