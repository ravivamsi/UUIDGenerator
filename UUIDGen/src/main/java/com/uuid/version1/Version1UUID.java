package com.uuid.version1;

import java.util.UUID;

public class Version1UUID {
	
	public static void main(String[] args){
	
		UUID uuid = UUID.randomUUID();
		
		String uuidString = uuid.toString();
		
		uuid.version();
		uuid.variant();
		uuid.timestamp();
		uuid.clockSequence();
		
	}
	

}
