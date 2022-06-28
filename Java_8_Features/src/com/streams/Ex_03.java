package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class SmsSending {
	long number;
	String network;

	public SmsSending(long number, String network) {
		super();
		this.number = number;
		this.network = network;
	}

	@Override
	public String toString() {
		return "SmsSending [number=" + number + ", network=" + network + "]";
	}
}

public class Ex_03 {

	public static void main(String[] args) {

		List<SmsSending> l = new ArrayList<>();
		l.add(new SmsSending(9160980881L, "AIRTEL"));
		l.add(new SmsSending(778899345789L, "JIO"));
		l.add(new SmsSending(9882342277L, "IDEA"));
		l.add(new SmsSending(7899986543L, "JIO"));
		l.add(new SmsSending(8765778987L, "BSNL"));
		l.add(new SmsSending(9888666689L, "IDEA"));
		l.add(new SmsSending(7889996654L, "AIRTEL"));
		l.add(new SmsSending(6554489789L, "BSNL"));
		
		System.out.println(l);
		List<SmsSending> l2 = l.stream().filter(i->i.network=="AIRTEL").collect(Collectors.toList()); 
		System.out.println(l2);


	}

}
