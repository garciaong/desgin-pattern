package com.learn.desginpattern.decorator;

public class AppStore {

	public void orderApp(AppType type) {
		App app = new AppDecorator(new AppFactory().createApp(type));
		app.develop();
	}
}
