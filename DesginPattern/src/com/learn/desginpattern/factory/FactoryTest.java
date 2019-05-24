package com.learn.desginpattern.factory;

public class FactoryTest {

	public static void main(String [] args) {
		withoutFactory();
		withFactory();
	}
	
	private static void withoutFactory() {
		System.out.println("### Without Factory Start ###");
		AppStore store = new AppStore();
		store.normalOrderApp(AppType.IOS);
		store.normalOrderApp(AppType.TV);
		store.normalOrderApp(AppType.WATCH);
		System.out.println("### Without Factory End ###");
	}
	
	private static void withFactory() {
		System.out.println("### With Factory Start ###");
		AppStore store = new AppStore();
		store.factoryOrderApp(AppType.IOS);
		store.factoryOrderApp(AppType.TV);
		store.factoryOrderApp(AppType.WATCH);
		System.out.println("### With Factory End ###");
	}
	
}
