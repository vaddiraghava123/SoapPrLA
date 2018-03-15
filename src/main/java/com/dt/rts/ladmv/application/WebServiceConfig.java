package com.dt.rts.ladmv.application;

import java.util.ArrayList;
import java.util.List;

import org.apache.ws.commons.schema.resolver.DefaultURIResolver;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.soap.server.endpoint.interceptor.PayloadValidatingInterceptor;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.commons.CommonsXsdSchemaCollection;

import com.dt.rts.ladmv.services.inquiries.commoninquiryelements.ELTResponse;
import com.dt.rts.ladmv.services.inquiries.dailymoniessummaryinquiry.DailyMoniesSummaryInquiryResponse;
import com.dt.rts.ladmv.services.inquiries.driverlicenseinquiry.DriverLicenseInquiryResponse;
import com.dt.rts.ladmv.services.inquiries.lieninquirybyplateorvin.LienInquiryByPlateOrVinResponse;
import com.dt.rts.ladmv.services.inquiries.mvri01inquiry.MVRI01InquiryResponse;
import com.dt.rts.ladmv.services.inquiries.ownerslistinquirybyname.OwnersListInquiryByNameResponse;
import com.dt.rts.ladmv.services.inquiries.vehicleinquiry.VehicleInquiryResponse;
import com.dt.rts.ladmv.services.inquiries.vehicleslistinquirybyname.VehiclesListInquiryByNameResponse;
import com.dt.rts.ladmv.services.transaction.latransaction.LAResponse;
import com.dt.rts.ladmv.services.transaction.tt38transaction.TT38Response;
import com.dt.rts.ladmv.services.transaction.tt51transaction.TT51Response;
import com.dt.rts.ladmv.services.transaction.voidtransaction.VoidResponse;

@EnableWs
@Configuration
@ComponentScan(basePackages = {"com.dt.rts.ladmv.repository"})
public class WebServiceConfig extends WsConfigurerAdapter {
	
	@Bean
	public VehicleInquiryResponse VehicleInquiryResponse(){
		return new VehicleInquiryResponse();
	}
	
	@Bean
	public DailyMoniesSummaryInquiryResponse dailyMoniesInquiryResponse(){
		return new DailyMoniesSummaryInquiryResponse();
	}
	
	@Bean
	public ELTResponse eltrInquiryResponse(){
		return new ELTResponse();
	}
	
	@Bean
	public ELTResponse eltrAddOrModifyResponse(){
		return new ELTResponse();
	}
	
	@Bean
	public MVRI01InquiryResponse mvri01Response(){
		return new MVRI01InquiryResponse();
	}
	
	@Bean
	public LienInquiryByPlateOrVinResponse lienInquiryResponse(){
		return new LienInquiryByPlateOrVinResponse();
	}
	
	@Bean
	public DriverLicenseInquiryResponse licenseInquiryResponse(){
		return new DriverLicenseInquiryResponse();
	}
	
	@Bean
	public VehiclesListInquiryByNameResponse vehicleListInquiryResponse(){
		return new VehiclesListInquiryByNameResponse();
	}
	
	@Bean
	public OwnersListInquiryByNameResponse ownerListInquiryByNameResponse(){
		return new OwnersListInquiryByNameResponse();
	}
	
	@Bean TT38Response tt38Response(){
		return new TT38Response();
	}
	
	@Bean TT51Response tt51Response(){
		return new TT51Response();
	}
	
	@Bean LAResponse laResponse(){
		return new LAResponse();
	}
	
	@Bean VoidResponse voidResponse(){
		return new VoidResponse();
	}
	/**
	 * Validate XML Element Values
	 */
	@Override
    public void addInterceptors(List<EndpointInterceptor> interceptors) {
        PayloadValidatingInterceptor validatingInterceptor = new PayloadValidatingInterceptor();
        validatingInterceptor.setValidateRequest(false);
        validatingInterceptor.setValidateResponse(false);
        validatingInterceptor.setXsdSchemaCollection(xsdSchemaCollection());
        interceptors.add(validatingInterceptor);
    }
	
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/la/*");
	}

	@Bean(name = "ladmvproxy")
	public DefaultWsdl11Definition defaultWsdl11Definition(CommonsXsdSchemaCollection xsdSchemaCollection) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("LADMVPort");
		wsdl11Definition.setLocationUri("/la");
		wsdl11Definition.setTargetNamespace("http://rts.dt.com/ladmv");
		wsdl11Definition.setSchemaCollection(xsdSchemaCollection);
		wsdl11Definition.setServiceName("LADMVService");
		return wsdl11Definition;
	}

	@Bean
	public CommonsXsdSchemaCollection xsdSchemaCollection() {
		List<ClassPathResource> res = new ArrayList<>();
        res.add(new ClassPathResource("/xsd/inquiries/VehicleInquiry.xsd"));
        res.add(new ClassPathResource("/xsd/inquiries/ElectronicLienInquiry.xsd"));
		res.add(new ClassPathResource("/xsd/inquiries/ElectronicLienAddModify.xsd"));
		res.add(new ClassPathResource("/xsd/inquiries/DMEM.xsd"));
        res.add(new ClassPathResource("/xsd/inquiries/AR74Inquiry.xsd"));
        res.add(new ClassPathResource("/xsd/inquiries/MVRI01.xsd"));
        res.add(new ClassPathResource("/xsd/inquiries/LienInquiryByPlateOrVin.xsd"));
        res.add(new ClassPathResource("/xsd/inquiries/DriverLicenseInquiry.xsd"));
        res.add(new ClassPathResource("/xsd/inquiries/VehiclesListInquiryByName.xsd"));
        res.add(new ClassPathResource("/xsd/inquiries/OwnersListInquiryByName.xsd"));
        res.add(new ClassPathResource("/xsd/transaction/TitleRegTransaction.xsd"));
        res.add(new ClassPathResource("/xsd/transaction/TT51Transaction.xsd"));
        res.add(new ClassPathResource("/xsd/transaction/TT38Transaction.xsd"));
        res.add(new ClassPathResource("/xsd/transaction/LATransaction.xsd"));
        res.add(new ClassPathResource("/xsd/transaction/VoidTransaction.xsd"));
        res.add(new ClassPathResource("/xsd/transaction/ChangeTitleRegInfoTransaction.xsd"));
        res.add(new ClassPathResource("/xsd/transaction/TT17Transaction.xsd"));
        res.add(new ClassPathResource("/xsd/transaction/AF80Transaction.xsd"));
        res.add(new ClassPathResource("/xsd/dlru/InitialDriverLicenseTransaction.xsd"));
        res.add(new ClassPathResource("/xsd/dlru/DriverLicenseSearch.xsd"));
        res.add(new ClassPathResource("/xsd/dlru/DriverLicenseUpdate.xsd"));
        res.add(new ClassPathResource("/xsd/dlru/DriverLicenseVoid.xsd"));
        res.add(new ClassPathResource("/xsd/dlru/OfficeCustomerList.xsd"));
        res.add(new ClassPathResource("/xsd/dlru/DLRU51Transaction.xsd"));
//        res.add(new ClassPathResource("/xsd/reinstatement/LicensePlateTransaction.xsd"));
//        res.add(new ClassPathResource("/xsd/reinstatement/ClearanceLetterTransaction.xsd"));
        
        
		CommonsXsdSchemaCollection collection = new CommonsXsdSchemaCollection(res.toArray(new ClassPathResource[0]));
		collection.setInline(true);
		collection.setUriResolver(new DefaultURIResolver());
		return collection; 
	} 
}