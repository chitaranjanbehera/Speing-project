package com.nt.comp;

public class Dtdc implements Courier {
	public Dtdc() {
		System.out.println("DTDC::0-param constructor");
	}
	@Override
	public String deliver(int oid) {
		
		return oid+"oder is delivered by DTDC";
	}

}
