package com.learn.desginpattern.singleton;

public class SingletonLazyLoad {

	private static SingletonLazyLoad INSTANCE = null;
	private int value;
	
    private SingletonLazyLoad() {
    }

    public static SingletonLazyLoad getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonLazyLoad.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonLazyLoad();
                }
            }
        }
        return INSTANCE;
    }

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
    
}
