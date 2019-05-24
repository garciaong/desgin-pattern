package com.learn.desginpattern.factory;

public class TVApp implements App{

	@Override
	public void develop() {
		System.out.println("TV App developing");
	}

	@Override
	public void test() {
		System.out.println("TV App testing");
	}

	@Override
	public void debug() {
		System.out.println("TV App debugging");
	}

	@Override
	public void deliver() {
		System.out.println("TV App delivering");
	}

}
