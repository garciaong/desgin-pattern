package com.learn.desginpattern.prototype;

public class AppStore {
	public void orderApp(AppType type) {
		final App app = new AppFactory().createApp(type);
		app.develop();
		app.test();
		app.debug();
		app.deliver();
	}
}
