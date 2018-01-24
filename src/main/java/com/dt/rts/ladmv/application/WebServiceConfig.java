package com.dt.rts.ladmv.application;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.commons.CommonsXsdSchemaCollection;

import com.dt.rts.ladmv.services.inquiries.vehicleinquiry.VehicleInquiryResponse;

@EnableWs
@Configuration
@ComponentScan(basePackages = {"com.dt.rts.ladmv.repository"})
public class WebServiceConfig extends WsConfigurerAdapter {
	
	@Bean
	public VehicleInquiryResponse VehicleInquiryResponse(){
		return new VehicleInquiryResponse();
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
        res.add(new ClassPathResource("/xsd/transaction/TitleRegTransaction.xsd"));
        
		CommonsXsdSchemaCollection collection = new CommonsXsdSchemaCollection(res.toArray(new ClassPathResource[0]));
		collection.setInline(true);
		return collection; 
	} 
}