package com.designPatterns.gangOfFour.behavioral.state;

class TcpClosed extends TcpState {
	
	@Override
	public void activeOpen(TcpConnection tcpConnection) {
		// send SYN, receive SYN, ACK, etc.
		System.out.println("TcpClosed::activeOpen");
		tcpConnection.changeState(new TcpEstablished()) ;
	}
	@Override
	public void passiveOpen(TcpConnection tcpConnection) {
		System.out.println("TcpClosed::passiveOpen");
		tcpConnection.changeState(new TcpListen());
	}
	
	@Override
	public String toString() {
		return "TcpClosed";
	}
}