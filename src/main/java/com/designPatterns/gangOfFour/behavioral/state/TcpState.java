package com.designPatterns.gangOfFour.behavioral.state;

import com.designPatterns.gangOfFour.behavioral.state.util.TcpOctetStream;

// State - defines an interface for encapsulating the behavior associated
// with a particular state of the Context
public abstract class TcpState {
	public void transmit(TcpConnection tcpConnection, TcpOctetStream tcpOctetStream) {
		throw new UnsupportedOperationException();
	}
	public void activeOpen(TcpConnection tcpConnection) {
		throw new UnsupportedOperationException();
	}
	public void passiveOpen(TcpConnection tcpConnection) {
		throw new UnsupportedOperationException();
	}
	public void close(TcpConnection tcpConnection) {
		throw new UnsupportedOperationException();
	}
	public void synchronize(TcpConnection tcpConnection) {
		throw new UnsupportedOperationException();
	}
	public void acknowledge(TcpConnection tcpConnection) {
		throw new UnsupportedOperationException();
	}
	public void send(TcpConnection tcpConnection) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public abstract String toString();
	
}