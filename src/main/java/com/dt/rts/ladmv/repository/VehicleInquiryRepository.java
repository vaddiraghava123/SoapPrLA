package com.dt.rts.ladmv.repository;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.dt.rts.ladmv.services.coreelements.RegistrationType;
import com.dt.rts.ladmv.services.coreelements.TransVehicleType;
import com.dt.rts.ladmv.services.inquiries.commoninquiryelements.InquiryRegistrationType;
import com.dt.rts.ladmv.services.inquiries.vehicleinquiry.InqVehicleType;
import com.dt.rts.ladmv.services.inquiries.vehicleinquiry.InquiryResponse;



@Component
public class VehicleInquiryRepository {
	//private static final Map<String, Inquiry> inquiryResponse = new TreeMap();

//	@PostConstruct
//	public void initData() throws ParseException {
		
		/*Long batchNo = new Long(232322);
		BigDecimal sale = new BigDecimal(3232.902D);
		SimpleDateFormat sdf = new SimpleDateFormat("ddmmyy");
		String dateInString = "220318";
		Date date = sdf.parse(dateInString);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		String dateInString1 = "220319";
		Date date1 = sdf.parse(dateInString1);
		Calendar calendar1 = Calendar.getInstance();
		calendar1.setTime(date1);
		
		Inquiry in = new Inquiry();
		in.setBatchNum(batchNo);
		VehicleType v = new VehicleType();
		v.setBody("BLK"); 
		
		
		
		FlagListType flags = new FlagListType();
		FlagType f = new FlagType();
		f.setCode("IU");
		
		FlagType f1= new FlagType();
		f1.setCode("TW");
		
		ArrayList<FlagType> flagsList = new ArrayList<FlagType>();
		flagsList.add(f);
		flagsList.add(f1);
		
		flags.getFlag().add(f1);
		flags.getFlag().add(f);
		
		v.setFlags(flags);	
		
		v.setMake("MK");
//		v.set("FSSS");
		v.setOdometerReading("2323");
		v.setPrimaryColor("BLK");
		v.setYear(2018);
		v.setVin("1C3CDZAB7DN529738");
		
		
		in.setVehicle(v);
		
		
		OwnersType owners = new OwnersType();
		
		PrimaryOwnerType firstOwner = new PrimaryOwnerType();
		firstOwner.setOwnerType(1);
		firstOwner.setName("LOUSIANA");
		firstOwner.setDrivingLicenseNum("FFDSFDF");
		
		Address address1 = new Address();
		address1.setCity("CS BATON ROUGE");
		address1.setState("LA");
		address1.setStreet("1 DATEEND RD");
		address1.setZip(70808);
		
		firstOwner.setAddress(address1);
		
		owners.setPrimaryOwner(firstOwner);
		
		in.setOwners(owners);
		
		in.setPrivacyActCompliance(Integer.valueOf(2332));
		in.setDate1(calendar);
		in.setDate2(calendar1);
		in.setSpecialFees(sale);
		
	
		inquiryResponse.put(v.getVin(), in);
		
		
		Inquiry in1 = new Inquiry();
		in1.setBatchNum(batchNo);
		VehicleType v1 = new VehicleType();
		v1.setBody("TATA"); 
		
		FlagListType flags1 = new FlagListType();
		FlagType f11 = new FlagType();
		f11.setCode("TR");
		
		FlagType f12= new FlagType();
		f12.setCode("TW");
		
		ArrayList<FlagType> flagsList1 = new ArrayList<FlagType>();
		flagsList1.add(f11);
		flagsList1.add(f12);
		
		flags1.getFlag().add(f11);
		flags1.getFlag().add(f12);
		
		v1.setFlags(flags1);	
		
		v1.setMake("MK");
//		v1.setModelOrWeight("TES");
		v1.setOdometerReading("343");
		v1.setPrimaryColor("YLW");
		v1.setYear(2017);
		v1.setVin("1C3CDZAB7DN529737");
		
		in1.setVehicle(v1);
		
		
		OwnersType owners1 = new OwnersType();
		
		PrimaryOwnerType firstOwner1 = new PrimaryOwnerType();
		firstOwner1.setOwnerType(1);
		firstOwner1.setName("LOUSIANA");
		firstOwner1.setDrivingLicenseNum("FFDSFDF");
		
		owners1.setPrimaryOwner(firstOwner1);
		
		in1.setOwners(owners1);
		
		in1.setPrivacyActCompliance(Integer.valueOf(2332));
		in.setDate1(calendar);
		in.setDate2(calendar1);
		in.setSpecialFees(sale);
		
	
		inquiryResponse.put(v1.getVin(), in1);*/
//	}

	/*private TransVehicleType veh = null;

	@PostConstruct
	public void initData() {
		this.veh = new InqVehicleType();
		this.veh.setVin("12345678901234567");
		
	}*/

	public InquiryResponse findVMInquirResponse(String vin) {
		
		InquiryResponse inquiryResponse = new InquiryResponse();
		InqVehicleType inqVeh = new InqVehicleType();
		inqVeh.setVin(vin);
		inquiryResponse.setTitle(null);
		inquiryResponse.setVehicle(inqVeh);
		return inquiryResponse;
	}
	
	public InquiryResponse findLMInquirResponse(String plateNumber, String expirationyear) {
		InquiryResponse inquiryResponse = new InquiryResponse();
		InquiryRegistrationType reg = new InquiryRegistrationType();
		reg.setCurrentPlateNum(plateNumber);
		reg.setCurrentPlateExpDate(expirationyear);
		inquiryResponse.setRegistration((InquiryRegistrationType) reg);
		return inquiryResponse;
	}
}