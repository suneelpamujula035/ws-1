package com.project1.invoiceInfo.service;

import com.project1.invoiceInfo.entity.InvoiceInfo;
import com.project1.invoiceInfo.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceInfoService {
	@Autowired
	private InvoiceRepository invoiceRepository;
	
	//for testing
//	public InvoiceInfoService(InvoiceRepository invoiceRepository) {
//		this.invoiceRepository=invoiceRepository;
//	}

	public List<InvoiceInfo> getAllInvoiceInfo() {
		return invoiceRepository.findAll();
	}

	public void saveInvoiceInfo(InvoiceInfo invoiceInfo) {
		this.invoiceRepository.save(invoiceInfo);
	}

	public InvoiceInfo getInvoiceById(long id) {
		InvoiceInfo invoiceInfo = invoiceRepository.findById(id).get();
		return invoiceInfo;
	}

	public void deleteInvoiceById(long id) {
		this.invoiceRepository.deleteById(id);
	}


}
