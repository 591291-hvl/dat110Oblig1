package no.hvl.dat110.messaging;

import no.hvl.dat110.TODO;

public class Message {

	private byte[] data;

	public Message(byte[] data) {
		
		// TODO - START
		
		//Check if data != null and not longer than 127 bytes
		if(data != null && data.length <= 127) {
			this.data = data;
		}
		
		
//		if (true)
//			throw new UnsupportedOperationException(TODO.constructor("Message"));
			
		// TODO - END
	}

	public byte[] getData() {
		return this.data; 
	}

}
