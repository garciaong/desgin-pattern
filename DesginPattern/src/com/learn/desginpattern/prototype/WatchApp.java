package com.learn.desginpattern.prototype;

public class WatchApp extends App {
	public WatchApp() {
		System.out.println("Creating an Watch App");
		setType(AppType.WATCH);
	}

	@Override
	public void develop() {
		System.out.println("Developing an Watch App");
	}
}