package com.learn.desginpattern.factory;

public class WatchApp implements App{

	@Override
	public void develop() {
		System.out.println("Watch App developing");
	}

	@Override
	public void test() {
		System.out.println("Watch App testing");
	}

	@Override
	public void debug() {
		System.out.println("Watch App debugging");
	}

	@Override
	public void deliver() {
		System.out.println("Watch App delivering");
	}

}
