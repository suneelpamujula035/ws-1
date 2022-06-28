package com.project1.invoiceInfo.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.project1.invoiceInfo.repository.InvoiceRepository;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class InvoiceInfoServiceTest {
	
	
	
	@Mock
	private InvoiceRepository invoiceRepository;
	
	
	private InvoiceInfoService invoiceInfoService;
	
	
	@BeforeEach
	void setUp() {
//		this.invoiceInfoService=new InvoiceInfoService(this.invoiceRepository);
	}
	
	
	@Test
	public void testGetAllInvoiceInfo() {
		invoiceInfoService.getAllInvoiceInfo();
		
		verify(invoiceRepository).findAll();
	}

	@Test
	@Disabled
	public void testSaveInvoiceInfo() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	public void testGetInvoiceById() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	public void testDeleteInvoiceById() {
		fail("Not yet implemented");
	}

}
