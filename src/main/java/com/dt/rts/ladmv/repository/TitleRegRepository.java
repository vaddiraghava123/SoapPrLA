package com.dt.rts.ladmv.repository;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;


@Component
public class TitleRegRepository {


import org.springframework.util.Assert;

@Component
public class TitleRegRepository {
//	private static final Map<String, Inquiry> inquiryResponse = new TreeMap();


	@PostConstruct
	public void initData() {
		
	}


	//TODO Build response here and return it.
	/*public Inquiry getTitleRegResponse(String vin) {
		Inquiry inquiryResponse = new Inquiry();
		inquiryResponse.setVehicle(veh);
		return inquiryResponse;
	}*/
}

	/*public Inquiry findVin(String vin) {
		Assert.notNull(vin, "VIN is not null");
		System.out.println("Testing the VIN " + vin);
		return (Inquiry) inquiryResponse.get(vin);
	}*/
}

