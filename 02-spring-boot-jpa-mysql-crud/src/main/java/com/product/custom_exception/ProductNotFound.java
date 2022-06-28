package com.product.custom_exception;

public class ProductNotFound extends RuntimeException {

//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//	public ProductNotFound()
//	{
//		super();
//	}
	public ProductNotFound(String message)
	{
		super(message);
	}
}
