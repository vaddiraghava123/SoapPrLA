package com.dt.rts.ladmv.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.dt.rts.ladmv.repository.TitleRegRepository;
import com.dt.rts.ladmv.repository.VehicleInquiryRepository;
import com.dt.rts.ladmv.services.inquiries.vehicleinquiry.VehicleInquiryRequest;
import com.dt.rts.ladmv.services.inquiries.vehicleinquiry.VehicleInquiryResponse;
import com.dt.rts.ladmv.services.transaction.titleregtransaction.TitleRegRequest;
import com.dt.rts.ladmv.services.transaction.titleregtransaction.TitleRegResponse;
import com.dt.rts.ladmv.services.transaction.titleregtransaction.VehicleForTitleRegTransRequestType;


@Endpoint
public class ServiceEndPoint {
	private static final String VM_NAMESPACE_URI = "http://rts.dt.com/ladmv/services/inquiries/VehicleInquiry";
	private static final String ELT_NAMESPACE_URI = "http://rts.dt.com/ladmv/services/inquiries/ElectronicLienInquiry";
	private static final String TITLEREG_NAMESPACE_URI = "http://rts.dt.com/ladmv/services/transaction/TitleRegTransaction";

	@Autowired
	private ApplicationContext  ctx;

	@PayloadRoot(localPart = "VehicleInquiryRequest", namespace = VM_NAMESPACE_URI)
	@ResponsePayload
	public VehicleInquiryResponse getVin(@RequestPayload VehicleInquiryRequest request) {
		VehicleInquiryResponse response = ctx.getBean(VehicleInquiryResponse.class);
		System.out.println("VehicleResponse Starts");
		VehicleInquiryRepository vehicleInqRepository = ctx.getBean(VehicleInquiryRepository.class);
		response.setInquiry(vehicleInqRepository.findVin(request.getInquiry().getVin()));
		return response;
	}
	
	/*
	 * Kept Hold 
	 * 
	 * @PayloadRoot(localPart = "EltInquiryRequest", namespace = ELT_NAMESPACE_URI)
	@ResponsePayload
	public EltInquiryResponse getVin(@RequestPayload EltInquiryRequest request) {
		EltInquiryResponse response = ctx.getBean(EltInquiryResponse.class);
		System.out.println("EltInquiryResponse Starts");
		ELTInquiryRepository eltInqRepository = ctx.getBean(ELTInquiryRepository.class);
		response.setInquiry(eltInqRepository.findElt(request.getInquiry().getEltType()));
		return response;
	}*/
	
	@PayloadRoot(localPart = "TitleRegRequest", namespace = TITLEREG_NAMESPACE_URI)
	@ResponsePayload
	public TitleRegResponse getVin(@RequestPayload TitleRegRequest request) {
		TitleRegResponse response = ctx.getBean(TitleRegResponse.class);
		System.out.println("TitleRegResponse Starts");
		TitleRegRepository titleRegRepository = ctx.getBean(TitleRegRepository.class);
		
//		response.setInquiry(titleRegRepository.receiveTitleReg(request.getTransaction().getVehicle().getVin());
		return response;
	}
}