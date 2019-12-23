package com.designPatterns.gangOfFour.behavioral.state;

class TcpListen extends TcpState {
	@Override
	public void send(TcpConnection tcpConnection) {
		// send SYN, receive SYN, ACK, etc.
		System.out.println("TcpListen::send");
		tcpConnection.changeState(new TcpEstablished());
	}

	@Override
	public String toString() {
		return "TcpListen";
	}
}