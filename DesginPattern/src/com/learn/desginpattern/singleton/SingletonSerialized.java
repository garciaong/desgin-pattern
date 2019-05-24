package com.learn.desginpattern.singleton;

import java.io.Serializable;

public class SingletonSerialized implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 592708951187470719L;
	public static final SingletonSerialized INSTANCE = new SingletonSerialized();
	private int value;
	
    private SingletonSerialized() {
    }

    protected Object readResolve() {
        return INSTANCE;
    }

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
    
}
