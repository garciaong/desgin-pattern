package com.learn.desginpattern.factory;

public class AppStore {

	//Dependencies inside the class, if other classes has the same methods change in logic will impact all
	public void normalOrderApp(AppType type) {
		App app;
		switch (type) {
		case IOS:
			app = new IOSApp();
			break;
		case TV:
			app = new TVApp();
			break;
		case WATCH:
			app = new WatchApp();
			break;
		default:
			app = new IOSApp();
			break;
		}
		app.develop();
		app.test();
		app.debug();
		app.deliver();
	}

	public void factoryOrderApp(AppType type) {
		AppFactory factory = new AppFactory();
		App app = factory.createApp(type);
		app.develop();
		app.test();
		app.debug();
		app.deliver();
	}
}
