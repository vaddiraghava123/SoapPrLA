package com.dt.rts.ladmv.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;


@Endpoint
public class ServiceEndPoint {
	private static final String VM_NAMESPACE_URI = "http://rts.dt.com/ladmv/services/inquiries/VehicleInquiry";
	private static final String ELT_NAMESPACE_URI = "http://rts.dt.com/ladmv/services/inquiries/ElectronicLienInquiry";
	private static final String AR74_NAMESPACE_URI = "http://rts.dt.com/ladmv/services/inquiries/DailyMoniesSummaryInquiry";
	private static final String TITLEREG_NAMESPACE_URI = "http://rts.dt.com/ladmv/services/transaction/TitleRegTransaction";
	public static final String VehicleInquiryType = "VM";

	@Autowired
	private ApplicationContext  appContext;

	/*@PayloadRoot(localPart = "VehicleInquiryRequest", namespace = VM_NAMESPACE_URI)
	@ResponsePayload
	public VehicleInquiryResponse getVin(@RequestPayload VehicleInquiryRequest request) {
		VehicleInquiryResponse vehicleInquiryResponse = appContext.getBean(VehicleInquiryResponse.class);
		VehicleInquiryRepository vehicleInquiryRepository = appContext.getBean(VehicleInquiryRepository.class);
		if(VehicleInquiryType.equalsIgnoreCase(request.getInquiry().getInquiryType())){
			vehicleInquiryResponse.setInquiry(vehicleInquiryRepository.findVMInquirResponse(request.getInquiry().getVin()));
		} else {
			vehicleInquiryResponse.setInquiry(vehicleInquiryRepository.findLMInquirResponse(request.getInquiry().getPlateNum(), request.getInquiry().getRegExpYear().toString()));
		}
		return vehicleInquiryResponse;
	}*/
	
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
	
	/*@PayloadRoot(localPart = "TitleRegRequest", namespace = TITLEREG_NAMESPACE_URI)
	@ResponsePayload
	public TitleRegResponse getVin(@RequestPayload TitleRegRequest request) {
		TitleRegResponse response = appContext.getBean(TitleRegResponse.class);
		System.out.println("TitleRegResponse Starts");
		TitleRegRepository titleRegRepository = appContext.getBean(TitleRegRepository.class);
		
//		response.setInquiry(titleRegRepository.receiveTitleReg(request.getTransaction().getVehicle().getVin());
		return response;
	}*/
	
	/*@PayloadRoot(localPart = "DailyMoniesSummaryInquiryRequest", namespace = AR74_NAMESPACE_URI)
	@ResponsePayload
	public DailyMoniesSummaryInquiryResponse getDailyMonies(@RequestPayload DailyMoniesSummaryInquiryRequest request) {
		DailyMoniesSummaryInquiryResponse response = appContext.getBean(DailyMoniesSummaryInquiryResponse.class);
		DailyMoniesInquiryRepository dailyMoniesInquiryRepository = appContext.getBean(DailyMoniesInquiryRepository.class);
		return response;
		
	}*/
	
}