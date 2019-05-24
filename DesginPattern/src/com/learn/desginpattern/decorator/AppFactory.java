package com.learn.desginpattern.decorator;

public class AppFactory {
	
	public App createApp(AppType type) {
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
		return app;
	}
	
}