package com.mao.ext.dto; 
import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class  ShipResponse implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<CompletedShipment> completedShipments;
    private JournalDetails journalDetails;
    private List<Notification> notifications;
    private String provider;
    private String severityType;
    private String transactionIdentifier;
}
