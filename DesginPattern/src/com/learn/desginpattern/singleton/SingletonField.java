package com.learn.desginpattern.singleton;

public class SingletonField {

	public static final SingletonField INSTANCE = new SingletonField();
	private int value;
	
    private SingletonField() {
    }

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
    
}
