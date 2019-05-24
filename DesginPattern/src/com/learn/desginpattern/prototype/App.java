package com.learn.desginpattern.prototype;

public abstract class App implements Cloneable {
	private AppType type;

	public abstract void develop();

	public void test() {
	}

	public void debug() {
	}

	public void deliver() {
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public AppType getType() {
		return this.type;
	}

	protected void setType(AppType type) {
		this.type = type;
	}
}