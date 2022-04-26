package com.mao.ext.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OrderTaxConfig{
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
    @JsonProperty("InvoiceTaxModeId") 
    private String invoiceTaxModeId;
    @JsonProperty("LocalTaxConfigId") 
    private String localTaxConfigId;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("OfflineTaxGatewayId") 
    private String offlineTaxGatewayId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("ProfileId") 
    private String profileId;
    @JsonProperty("ReturnInvoiceTaxMode") 
    private ReturnInvoiceTaxMode returnInvoiceTaxMode;
    @JsonProperty("TaxComparisonStrategy") 
    private TaxComparisonStrategy taxComparisonStrategy;
    @JsonProperty("ThirdPartyTaxGatewayId") 
    private String thirdPartyTaxGatewayId;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
