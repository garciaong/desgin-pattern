package com.learn.desginpattern.singleton;

public class SingletonFactory {

	private static final SingletonFactory INSTANCE = new SingletonFactory();
	private int value;
	
    private SingletonFactory() {
    }

    public static SingletonFactory getInstance() {
        return INSTANCE;
    }

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
