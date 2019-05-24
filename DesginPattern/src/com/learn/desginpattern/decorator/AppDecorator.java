package com.learn.desginpattern.decorator;

public class AppDecorator implements App{

	private final App delegate;

	/**
     * A required constructor to set the delegate for this app.
     *
     * @param delegate
     *            the delegate which should be decorated.
     */
    public AppDecorator(App delegate) {
        this.delegate = delegate;
    }

	@Override
	public void develop() {
		System.out.println("Preparing extra content...");
		this.delegate.develop();
		System.out.println("Fine-tuning the app to be more perfect...");
	}

}
