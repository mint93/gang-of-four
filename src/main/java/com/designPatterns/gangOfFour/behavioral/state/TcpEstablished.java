package com.designPatterns.gangOfFour.behavioral.state;

import com.designPatterns.gangOfFour.behavioral.state.util.TcpOctetStream;

public class TcpEstablished extends TcpState {
	@Override
	public void transmit(TcpConnection tcpConnection, TcpOctetStream tcpOctetStream) {
		System.out.println("TcpEstablished::transmit");
		tcpConnection.processOctet(tcpOctetStream);
	}
	@Override
	public void close(TcpConnection tcpConnection) {
		// send PIN, receive ACK of FIN
		System.out.println("TcpEstablished::close");
		tcpConnection.changeState(new TcpListen());
	}
	@Override
	public String toString() {
		return "TcpEstablished";
	}
}