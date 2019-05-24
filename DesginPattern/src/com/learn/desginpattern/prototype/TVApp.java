package com.learn.desginpattern.prototype;

public class TVApp extends App {
	public TVApp() {
		System.out.println("Creating an TV App");
		setType(AppType.TV);
	}

	@Override
	public void develop() {
		System.out.println("Developing an TV App");
	}
}