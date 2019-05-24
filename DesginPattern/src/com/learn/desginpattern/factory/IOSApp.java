package com.learn.desginpattern.factory;

public class IOSApp implements App{

	@Override
	public void develop() {
		System.out.println("IOS App developing");
	}

	@Override
	public void test() {
		System.out.println("IOS App testing");
	}

	@Override
	public void debug() {
		System.out.println("IOS App debugging");
	}

	@Override
	public void deliver() {
		System.out.println("IOS App delivering");
	}

}
