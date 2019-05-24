package com.learn.desginpattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class BasicAppCache {

	private Map<AppType, App> appCache = new HashMap<>();

	/**
	 * Loads all available types of the application and puts them into the cache.
	 */
	public void load() {
		System.out.println("Loading App of type " + AppType.IOS.name());
		this.appCache.put(AppType.IOS, new IOSApp());
		System.out.println("Loading App of type " + AppType.TV.name());
		this.appCache.put(AppType.TV, new TVApp());
		System.out.println("Loading App of type " + AppType.WATCH.name());
		this.appCache.put(AppType.WATCH, new WatchApp());
	}

	/**
	 * Gets the app from the cache based on its type
	 */
	public App get(AppType type) {
		System.out.println("Getting App of type " + type.name());
		final App app = this.appCache.get(type);
		if (app != null) {
			try {
				return (App) app.clone();
			} catch (final CloneNotSupportedException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
