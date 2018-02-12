package com.dt.rts.ladmv.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.dt.rts.ladmv.repository.DLRepository;
import com.dt.rts.ladmv.repository.DailyMoniesInquiryRepository;
import com.dt.rts.ladmv.repository.ELTRRepository;
import com.dt.rts.ladmv.repository.LARepository;
import com.dt.rts.ladmv.repository.LienInquiryByPlateOrVinRepository;
import com.dt.rts.ladmv.repository.MVRI01Repository;
import com.dt.rts.ladmv.repository.OwnerListInquiryRepository;
import com.dt.rts.ladmv.repository.TT38Repository;
import com.dt.rts.ladmv.repository.TT51Repository;
import com.dt.rts.ladmv.repository.TitleRegRepository;
import com.dt.rts.ladmv.repository.VehicleInquiryRepository;
import com.dt.rts.ladmv.repository.VehicleListInquiryRepository;
import com.dt.rts.ladmv.services.inquiries.dailymoniessummaryinquiry.DailyMoniesSummaryInquiryRequest;
import com.dt.rts.ladmv.services.inquiries.dailymoniessummaryinquiry.DailyMoniesSummaryInquiryResponse;
import com.dt.rts.ladmv.services.inquiries.driverlicenseinquiry.DriverLicenseInquiryRequest;
import com.dt.rts.ladmv.services.inquiries.driverlicenseinquiry.DriverLicenseInquiryResponse;
import com.dt.rts.ladmv.services.inquiries.electroniclienaddmodify.EltAddOrModifyRequest;
import com.dt.rts.ladmv.services.inquiries.electroniclienaddmodify.EltAddOrModifyResponse;
import com.dt.rts.ladmv.services.inquiries.electroniclieninquiry.EltrInquiryRequest;
import com.dt.rts.ladmv.services.inquiries.electroniclieninquiry.EltrInquiryResponse;
import com.dt.rts.ladmv.services.inquiries.lieninquirybyplateorvin.LienInquiryByPlateOrVinRequest;
import com.dt.rts.ladmv.services.inquiries.lieninquirybyplateorvin.LienInquiryByPlateOrVinResponse;
import com.dt.rts.ladmv.services.inquiries.mvri01inquiry.MVRI01InquiryRequest;
import com.dt.rts.ladmv.services.inquiries.mvri01inquiry.MVRI01InquiryResponse;
import com.dt.rts.ladmv.services.inquiries.ownerslistinquirybyname.OwnersListInquiryByNameRequest;
import com.dt.rts.ladmv.services.inquiries.ownerslistinquirybyname.OwnersListInquiryByNameResponse;
import com.dt.rts.ladmv.services.inquiries.vehicleinquiry.VehicleInquiryRequest;
import com.dt.rts.ladmv.services.inquiries.vehicleinquiry.VehicleInquiryResponse;
import com.dt.rts.ladmv.services.inquiries.vehicleslistinquirybyname.VehiclesListInquiryByNameRequest;
import com.dt.rts.ladmv.services.inquiries.vehicleslistinquirybyname.VehiclesListInquiryByNameResponse;
import com.dt.rts.ladmv.services.transaction.latransaction.LARequest;
import com.dt.rts.ladmv.services.transaction.latransaction.LAResponse;
import com.dt.rts.ladmv.services.transaction.titleregtransaction.TitleRegRequest;
import com.dt.rts.ladmv.services.transaction.titleregtransaction.TitleRegResponse;
import com.dt.rts.ladmv.services.transaction.tt38transaction.TT38Request;
import com.dt.rts.ladmv.services.transaction.tt38transaction.TT38Response;
import com.dt.rts.ladmv.services.transaction.tt51transaction.TT51Request;
import com.dt.rts.ladmv.services.transaction.tt51transaction.TT51Response;



@Endpoint
public class ServiceEndPoint {
	private static final String VM_NAMESPACE_URI = "http://rts.dt.com/ladmv/services/inquiries/VehicleInquiry";
	private static final String ELT_INQ_NAMESPACE_URI = "http://rts.dt.com/ladmv/services/inquiries/ElectronicLienInquiry";
	private static final String ELT_ADD_NAMESPACE_URI = "http://rts.dt.com/ladmv/services/inquiries/ElectronicLienAddModify";
	private static final String AR74_NAMESPACE_URI = "http://rts.dt.com/ladmv/services/inquiries/DailyMoniesSummaryInquiry";
	private static final String WWS_NAMESPACE_URI = "http://rts.dt.com/ladmv/services/inquiries/VehiclesListInquiryByName";
	private static final String NNS_NAMESPACE_URI = "http://rts.dt.com/ladmv/services/inquiries/OwnersListInquiryByName";
	private static final String MVRI01_INQ_NAMESPACE_URI = "http://rts.dt.com/ladmv/services/inquiries/MVRI01Inquiry";
	private static final String DL_INQ_NAMESPACE_URI = "http://rts.dt.com/ladmv/services/inquiries/DriverLicenseInquiry";
	private static final String TITLEREG_NAMESPACE_URI = "http://rts.dt.com/ladmv/services/transaction/TitleRegTransaction";
	private static final String TT51_NAMESPACE_URI = "http://rts.dt.com/ladmv/services/transaction/RenewalRegTransaction";
	private static final String LIEN_INQ_NAMESPACE_URI = "http://rts.dt.com/ladmv/services/inquiries/LienInquiryByPlateOrVin";
	private static final String TT38_NAMESPACE_URI = "http://rts.dt.com/ladmv/services/transaction/TT38Transaction";
	private static final String LA_TRAN_NAMESPACE_URI = "http://rts.dt.com/ladmv/services/transaction/LATransaction";
	public static final String VehicleInquiryType = "VM";

	@Autowired
	private ApplicationContext  appContext;

	@PayloadRoot(localPart = "VehicleInquiryRequest", namespace = VM_NAMESPACE_URI)
	@ResponsePayload
	public VehicleInquiryResponse getVin(@RequestPayload VehicleInquiryRequest request) {
		VehicleInquiryResponse vehicleInquiryResponse = appContext.getBean(VehicleInquiryResponse.class);
		VehicleInquiryRepository vehicleInquiryRepository = appContext.getBean(VehicleInquiryRepository.class);
		if(VehicleInquiryType.equalsIgnoreCase(request.getInquiry().getInquiryType().toString())){
			vehicleInquiryResponse.setInquiry(vehicleInquiryRepository.findVMInquirResponse(request.getInquiry().getVin()));
		} else {
			vehicleInquiryResponse.setInquiry(vehicleInquiryRepository.findLMInquirResponse(request.getInquiry().getPlateNum(), request.getInquiry().getRegExpYear().toString()));
		}
		return vehicleInquiryResponse;
	}
	
	
	@PayloadRoot(localPart = "EltAddOrModifyRequest", namespace = ELT_ADD_NAMESPACE_URI)
	@ResponsePayload
	public EltAddOrModifyResponse getVin(@RequestPayload EltAddOrModifyRequest request) {
		EltAddOrModifyResponse response = appContext.getBean(EltAddOrModifyResponse.class);
		System.out.println("EltInquiryResponse Starts");
		ELTRRepository eltInqRepository = appContext.getBean(ELTRRepository.class);
		return response;
	}
	
	@PayloadRoot(localPart = "EltrInquiryRequest", namespace = ELT_INQ_NAMESPACE_URI)
	@ResponsePayload
	public EltrInquiryResponse getVin(@RequestPayload EltrInquiryRequest request) {
		EltrInquiryResponse response = appContext.getBean(EltrInquiryResponse.class);
		System.out.println("EltInquiryResponse Starts");
		ELTRRepository eltInqRepository = appContext.getBean(ELTRRepository.class);
		return response;
	}
	
	@PayloadRoot(localPart = "MVRI01InquiryRequest", namespace = MVRI01_INQ_NAMESPACE_URI)
	@ResponsePayload
	public MVRI01InquiryResponse getVin(@RequestPayload MVRI01InquiryRequest request) {
		MVRI01InquiryResponse response = appContext.getBean(MVRI01InquiryResponse.class);
		System.out.println("MVRI01InquiryResponse Starts");
		MVRI01Repository mvri01InqRepository = appContext.getBean(MVRI01Repository.class);
		return response;
	}
	
	@PayloadRoot(localPart = "LienInquiryByPlateOrVinRequest", namespace = LIEN_INQ_NAMESPACE_URI)
	@ResponsePayload
	public LienInquiryByPlateOrVinResponse getVin(@RequestPayload LienInquiryByPlateOrVinRequest request) {
		LienInquiryByPlateOrVinResponse response = appContext.getBean(LienInquiryByPlateOrVinResponse.class);
		System.out.println("LienInquiryResponse Starts");
		LienInquiryByPlateOrVinRepository lienInquiryRepository = appContext.getBean(LienInquiryByPlateOrVinRepository.class);
		return response;
	}
	
	@PayloadRoot(localPart = "DriverLicenseInquiryRequest", namespace = DL_INQ_NAMESPACE_URI)
	@ResponsePayload
	public DriverLicenseInquiryResponse getVin(@RequestPayload DriverLicenseInquiryRequest request) {
	    	DriverLicenseInquiryResponse response = appContext.getBean(DriverLicenseInquiryResponse.class);
		System.out.println("DriverLicenseInquiryResponse Starts");
		DLRepository DLInqRepository = appContext.getBean(DLRepository.class);
		return response;
	}
	
	@PayloadRoot(localPart = "TitleRegRequest", namespace = TITLEREG_NAMESPACE_URI)
	@ResponsePayload
	public TitleRegResponse getVin(@RequestPayload TitleRegRequest request) {
		TitleRegResponse response = appContext.getBean(TitleRegResponse.class);
		System.out.println("TitleRegResponse Starts");
		TitleRegRepository titleRegRepository = appContext.getBean(TitleRegRepository.class);
		
		return response;
	}
	
	@PayloadRoot(localPart = "DailyMoniesSummaryInquiryRequest", namespace = AR74_NAMESPACE_URI)
	@ResponsePayload
	public DailyMoniesSummaryInquiryResponse getDailyMonies(@RequestPayload DailyMoniesSummaryInquiryRequest request) {
		DailyMoniesSummaryInquiryResponse response = appContext.getBean(DailyMoniesSummaryInquiryResponse.class);
		DailyMoniesInquiryRepository dailyMoniesInquiryRepository = appContext.getBean(DailyMoniesInquiryRepository.class);
		return response;
	}
	
	@PayloadRoot(localPart = "VehiclesListInquiryByNameRequest", namespace = WWS_NAMESPACE_URI)
	@ResponsePayload
	public VehiclesListInquiryByNameResponse getVehilesList(@RequestPayload VehiclesListInquiryByNameRequest request) {
		VehiclesListInquiryByNameResponse response = appContext.getBean(VehiclesListInquiryByNameResponse.class);
		VehicleListInquiryRepository dailyMoniesInquiryRepository = appContext.getBean(VehicleListInquiryRepository.class);
		return response;
	}
	
	@PayloadRoot(localPart = "TT51Request", namespace = TT51_NAMESPACE_URI)
	@ResponsePayload
	public TT51Response getSticker(@RequestPayload TT51Request request) {
		TT51Response response = appContext.getBean(TT51Response.class);
		TT51Repository tt51Repository = appContext.getBean(TT51Repository.class);
		return response;
		
	}
	
	@PayloadRoot(localPart = "OwnersListInquiryByNameRequest", namespace = NNS_NAMESPACE_URI)
	@ResponsePayload
	public OwnersListInquiryByNameResponse getOwnersList(@RequestPayload OwnersListInquiryByNameRequest request) {
	    	OwnersListInquiryByNameResponse response = appContext.getBean(OwnersListInquiryByNameResponse.class);
	    	OwnerListInquiryRepository ownerListInquiryRepository = appContext.getBean(OwnerListInquiryRepository.class);
		return response;
	}
	
	@PayloadRoot(localPart = "TT38Request", namespace = TT38_NAMESPACE_URI)
	@ResponsePayload
	public TT38Response getSticker(@RequestPayload TT38Request request) {
		TT38Response response = appContext.getBean(TT38Response.class);
		TT38Repository tt38Repository = appContext.getBean(TT38Repository.class);
		return response;
		
	}
	
	@PayloadRoot(localPart = "LARequest", namespace = LA_TRAN_NAMESPACE_URI)
	@ResponsePayload
	public LAResponse getLiens(@RequestPayload LARequest request) {
		LAResponse response = appContext.getBean(LAResponse.class);
		LARepository laRepository = appContext.getBean(LARepository.class);
		return response;
		
	}
	
}