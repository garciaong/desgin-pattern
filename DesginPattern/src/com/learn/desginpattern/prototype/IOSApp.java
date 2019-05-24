package com.learn.desginpattern.prototype;

public class IOSApp extends App {
	public IOSApp() {
		System.out.println("Creating an iOS App");
		setType(AppType.IOS);
	}

	@Override
	public void develop() {
		System.out.println("Developing an iOS App");
	}
}