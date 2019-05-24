package com.learn.desginpattern.decorator;

public class DecoratorTest {

	public static void main(String [] args) {
		AppStore store = new AppStore();
		store.orderApp(AppType.IOS);
		store.orderApp(AppType.TV);
		store.orderApp(AppType.WATCH);
	}
	
}
