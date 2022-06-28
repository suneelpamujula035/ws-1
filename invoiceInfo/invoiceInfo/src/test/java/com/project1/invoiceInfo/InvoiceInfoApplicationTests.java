package com.project1.invoiceInfo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.project1.invoiceInfo.entity.InvoiceInfo;
import com.project1.invoiceInfo.repository.InvoiceRepository;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class InvoiceInfoApplicationTests {

	@Autowired
	InvoiceRepository invoiceRepository;
	
	@Test
	@Order(1)
	public void testCreate() throws ParseException {
		InvoiceInfo info = new InvoiceInfo();
		info.setId(1L);
		info.setBillTo("Aayush");
	   
		DateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date dueDate = format.parse("2021-01-01");
		Date invoiceDate = format.parse("2021-02-01");
		info.setDueDate(dueDate);
		info.setInvoiceDate(invoiceDate);
		info.setGrandTotal("200");
		info.setInvoiceNo("inv-001");
		info.setStatus("paid");
		info.setSubTotal(100);
		info.setTotalTax(10);
		
		invoiceRepository.save(info);
		assertNotNull(invoiceRepository.findById(1L).get());
	} 
	
	@Test
	@Order(2)
	public void testReadAll() {
		List<InvoiceInfo> list= invoiceRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
	
	@Test
	@Order(3)
	public void testingSingleInvoice() {
		InvoiceInfo invoiceInfo = invoiceRepository.findById(1L).get();
		assertEquals("Aayush", invoiceInfo.getBillTo());
	}
	
	@Test
	@Order(4)
	public void testSave() {
		InvoiceInfo info = invoiceRepository.findById(1L).get();
		info.setGrandTotal("100.00");
		invoiceRepository.save(info);
		assertNotEquals("200", invoiceRepository.findById(1L).get().getGrandTotal());
	}
	
	@Test
	@Order(5)
	public void testDelete() {
		invoiceRepository.deleteById(1L);
		assertThat(invoiceRepository.existsById(1L)).isFalse();
	}
	
	

}
