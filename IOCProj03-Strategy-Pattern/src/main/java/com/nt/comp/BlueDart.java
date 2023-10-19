package com.nt.comp;

public class BlueDart implements Courier {

	public BlueDart() {
		System.out.println("BlueDart::0-param constructor");
	}
	
	@Override
	public String deliver(int oid) {
		
		return oid+"oder is delivered by BlueDart";
	}

}
