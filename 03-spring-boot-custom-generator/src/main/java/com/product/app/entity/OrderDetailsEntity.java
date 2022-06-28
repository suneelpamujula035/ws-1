package com.product.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name =  "ORDER_DETAILS")
public class OrderDetailsEntity {

	@Id
	@GenericGenerator(name = "order_id_gen", strategy = "com.product.app.generator")
	@GeneratedValue(generator = "order_id_gen")
	@Column(name = "ORDER_ID")
	private String orderId;
	@Column(name = "ORDER_BY")
	private String orderBy;
	@Column(name = "ORDER_PLACED_DATE")
	@Temporal(TemporalType.DATE)
	private Date orderPlacedDate;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public Date getOrderPlacedDate() {
		return orderPlacedDate;
	}
	public void setOrderPlacedDate(Date orderPlacedDate) {
		this.orderPlacedDate = orderPlacedDate;
	}
	@Override
	public String toString() {
		return "OrderDetailsEntity [orderId=" + orderId + ", orderBy=" + orderBy + ", orderPlacedDate="
				+ orderPlacedDate + "]";
	}
}
