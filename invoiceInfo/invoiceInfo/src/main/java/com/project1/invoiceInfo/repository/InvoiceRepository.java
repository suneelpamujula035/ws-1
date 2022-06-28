package com.project1.invoiceInfo.repository;


import com.project1.invoiceInfo.entity.InvoiceInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<InvoiceInfo,Long> {

}
