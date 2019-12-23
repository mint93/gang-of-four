package com.designPatterns.gangOfFour.behavioral.state;

public class Client {
	public static void main(String[] args) {
		System.out.println("Passively open TCP connection");
		TcpConnection tcpConnection1 = new TcpConnection();
		tcpConnection1.passiveOpen();
		tcpConnection1.send();
		tcpConnection1.close();
		
		System.out.println("\nActively open TCP connection");
		TcpConnection tcpConnection2 = new TcpConnection();
		tcpConnection2.activeOpen();
		tcpConnection2.close();
	}
}
