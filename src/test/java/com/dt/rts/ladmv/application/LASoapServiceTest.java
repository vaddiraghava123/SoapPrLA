/*
 * This Java source file was generated by the Gradle 'init' task.

 */

package com.dt.rts.ladmv.application;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.ClassUtils;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.context.MessageContext;

import com.dt.rts.ladmv.services.inquiries.vehicleinquiry.InquiryRequest;
import com.dt.rts.ladmv.services.inquiries.vehicleinquiry.VehicleInquiryRequest;
import com.dt.rts.ladmv.services.inquiries.vehicleinquiry.VehicleInquiryResponse;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class LASoapServiceTest {
	
	
	
	private Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
	MessageContext context = null;

	TestRestTemplate restTemplate = new TestRestTemplate();
	HttpHeaders headers = new HttpHeaders();
	@LocalServerPort
	private int port = 8888;

	@Before
	public void init() throws Exception {
		marshaller.setPackagesToScan(ClassUtils.getPackageName(VehicleInquiryRequest.class));
		marshaller.afterPropertiesSet();
	}

	@Test 
	@Ignore
	public void vinTestService() throws IOException {WebServiceTemplate ws = new WebServiceTemplate(marshaller);
	    VehicleInquiryRequest request = new VehicleInquiryRequest();
	    InquiryRequest inquiry = new InquiryRequest();
	    inquiry.setInquiryType("VM");
	    inquiry.setVin("12345678901234567");
	    request.setInquiry(inquiry);
	    VehicleInquiryResponse response = (VehicleInquiryResponse) ws.marshalSendAndReceive("http://localhost:"+ port + "/la", request);
	
	    assertThat(response).isNotNull();
    }
}