package com.mao.ext.dto; 
import java.io.Serializable;
import java.util.Date;
import java.util.List; 

import lombok.Data;

@Data
public class  CompletedShipment implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BillingWeight billingWeight;
    private String carrierCode;
    private String carrierName;
    private String commitmentLevel;
    private CompletedHoldAtLocationDetail completedHoldAtLocationDetail;
    private List<CompletedPackage> completedPackages;
    private Date deliveryDate;
    private String deliveryDays;
    private List<Document> documents;
    private String exportComplianceStatement;
    private OperationalDetail operationalDetail;
    private String serviceType;
    private String serviceTypeName;
    private Date shipDate;
    private int shipmentId;
    private String shipmentIdentifier;
    private ShippingCharge shippingCharge;
}
