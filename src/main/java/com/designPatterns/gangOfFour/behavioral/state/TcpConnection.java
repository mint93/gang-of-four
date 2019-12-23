package com.designPatterns.gangOfFour.behavioral.state;

import com.designPatterns.gangOfFour.behavioral.state.util.TcpOctetStream;

// Context - defines the interface of interest to clients. It maintains
// an instance of a ConcreteState subclass that defines the current state.
public class TcpConnection {
	
	private TcpState tcpState;
	
	public TcpConnection () {
		this.tcpState = new TcpClosed();
	}
	
	// Context delegates state-specific requests to the current ConcreteState
	// object. A context may pass itself as an argument to the State object
	// handling the request. This lets the State object access the context if
	// necessary.
	public void activeOpen() {
		tcpState.activeOpen(this);
	}
	public void passiveOpen() {
		tcpState.passiveOpen(this);
	}
	public void close() {
		tcpState.close(this);
	}
	public void send() {
		tcpState.send(this);
	}
	public void acknowledge() {
		tcpState.acknowledge(this);
	}
	public void synchronize() {
		tcpState.synchronize(this);
	}
	
	public void processOctet(TcpOctetStream tcpOctetStream) {
		System.out.println("Processing Octet Stream");
	}
	
	// The State pattern does not specify which	participant defines the criteria
	// for state transitions. If the criteria are fixed, then they can be
	// implemented entirely in the Context. However, it is generally more flexible
	// and appropriate, to let the State subclasses themselves specify their
	// successor state and when to make the transition. This requires adding an
	// interface to the Context that lets State objects set the Context's
	// current state explicitly.
	public void changeState(TcpState tcpState) {
		System.out.println("Changing state: " + this.tcpState + "->" + tcpState);
		this.tcpState = tcpState;
	}
}