package za.co.paulscott.musicgraph.impl;

import za.co.paulscott.musicgraph.iface.HelloWorld;

public class HelloWorldImpl implements HelloWorld {

	public void printHelloWorld(String msg) {

		System.out.println("Hello : " + msg);
	}

}
