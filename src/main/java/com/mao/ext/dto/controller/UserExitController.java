package com.mao.ext.dto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.mao.ext.dto.controller.dto.PaymentGatewayRequest;
import com.mao.ext.dto.controller.dto.RequestPayload;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/base")
public class UserExitController {
	
	@GetMapping
	public String hello() {
		return "User Exit Integration Service is UP.........";
	}
	
	
	@PostMapping("/orderDetails")
	public String postData(@RequestBody RequestPayload carrierData) {
		
		PaymentGatewayRequest paymentGatewayRequest= carrierData.getPaymentGatewayRequest();
		
		log.info("customer ID from controller is {}",paymentGatewayRequest.getCustomerId());
	//	log.info("EnableVisaMandate2019 ID from controller is {}",paymentGatewayRequest.getEnableVisaMandate2019());
	//	log.info("Order ID from controller is {}",paymentGatewayRequest.getOrderId());
	//	log.info("PaymentGroup ID from controller is {}",paymentGatewayRequest.getPaymentGroupId());
		log.info("Parcel object............. :: {}", new Gson().toJson(paymentGatewayRequest));
		
		return "SUCCESS";
	}

}
