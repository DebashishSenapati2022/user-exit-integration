package com.mao.ext.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.mao.ext.dto.ParcelRequest;
import com.mao.ext.dto.ParcelResponse;

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
	public ResponseEntity<ParcelResponse> parcelPost(@RequestBody ParcelRequest parcelRequest ) {
		
		ParcelResponse parcelResponse=new ParcelResponse();
		parcelResponse.setShipResponse(parcelRequest.getShipResponse());
		String response= new Gson().toJson(parcelResponse);
		
		log.info("ParcelRequest ===>>> {}",parcelRequest);
		log.info("ParcelResponse ===>>> {}",response);
		
		return new ResponseEntity<>(parcelResponse ,HttpStatus.OK);
		
	}

}
