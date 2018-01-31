package com.dt.rts.ladmv.repository;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.dt.rts.ladmv.services.coreelements.TransVehicleType;
import com.dt.rts.ladmv.services.inquiries.vehicleinquiry.InqVehicleType;
import com.dt.rts.ladmv.services.inquiries.vehicleinquiry.InquiryRequest;
import com.dt.rts.ladmv.services.inquiries.vehicleinquiry.InquiryResponse;


@Component
public class VehicleInquiryRepository {
	
	private TransVehicleType veh = null;

	@PostConstruct
	public void initData() {
		this.veh = new InqVehicleType();
		this.veh.setVin("12345678901234567");
		
	}

	public InquiryResponse findVMInquirResponse(String vin) {
		InquiryResponse inquiryResponse = new InquiryResponse();
		inquiryResponse.setVehicle((InqVehicleType) veh);
		return inquiryResponse;
	}
	
	public InquiryResponse findLMInquirResponse(String plateNumber, String expirationyear) {
		InquiryResponse inquiryResponse = new InquiryResponse();
		inquiryResponse.setVehicle((InqVehicleType) veh);
		return inquiryResponse;
	}
}
