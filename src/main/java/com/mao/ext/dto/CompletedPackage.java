package com.mao.ext.dto; 
import java.io.Serializable;
import java.util.Date;
import java.util.List; 

import lombok.Data;

@Data
public class  CompletedPackage implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BillingWeight billingWeight;
    private String codtrackingNumber;
    private List<Document> documents;
    private Date estimatedDeliveryDate;
   // private Extended extended;
    private int packageId;
    private String packageIdentifier;
    private String packageType;
    private int shipToHoldState;
    private String shipperReference;
    private ShippingCharge shippingCharge;
    private String stringBarcode;
    private String trackingNumber;
    private String trackingNumber2;
}
