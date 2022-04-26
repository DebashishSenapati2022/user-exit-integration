package com.mao.ext.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class SelfServiceAttribute{
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
    @JsonProperty("MailPublished") 
    private boolean mailPublished;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("PayByLinkShortURL") 
    private String payByLinkShortURL;
    @JsonProperty("PayByLinkURL") 
    private String payByLinkURL;
    @JsonProperty("TextPublished") 
    private boolean textPublished;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
