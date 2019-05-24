package com.learn.desginpattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonTest {

	public static void main(String[] args) {
		fieldSingleton();
		factorySingleton();
		lazyLoadSingleton();
		serializeDeserializeSingleton();
		enumSingleton();
	}

	private static void fieldSingleton() {
		System.out.println("### Field Singleton Start ###");
		SingletonField.INSTANCE.setValue(1);
		SingletonField.INSTANCE.setValue(2);
		System.out.println(SingletonField.INSTANCE.getValue());
		System.out.println(SingletonField.INSTANCE.getValue());
		System.out.println("Both instance are the same : "+(SingletonField.INSTANCE == SingletonField.INSTANCE));
		System.out.println("### Field Singleton End ###");
	}
	
	private static void factorySingleton() {
		System.out.println("### Factory Singleton Start ###");
		SingletonFactory singleton1 = SingletonFactory.getInstance();
		SingletonFactory singleton2 = SingletonFactory.getInstance();
		singleton1.setValue(1);
		singleton2.setValue(2);
		System.out.println(singleton1.getValue());
		System.out.println(singleton2.getValue());
		System.out.println("Both instance are the same : "+(singleton1 == singleton2));
		System.out.println("### Factory Singleton End ###");
	}
	
	private static void lazyLoadSingleton() {
		System.out.println("### Lazy Load Singleton Start ###");
		SingletonLazyLoad singleton1 = SingletonLazyLoad.getInstance();
		SingletonLazyLoad singleton2 = SingletonLazyLoad.getInstance();
		singleton1.setValue(1);
		singleton2.setValue(2);
		System.out.println(singleton1.getValue());
		System.out.println(singleton2.getValue());
		System.out.println("Both instance are the same : "+(singleton1 == singleton2));
		System.out.println("### Lazy Load Singleton End ###");
	}

	private static void serializeDeserializeSingleton() {
		System.out.println("### Serializable Singleton Start ###");
		SingletonSerialized singleton1 = SingletonSerialized.INSTANCE;
		singleton1.setValue(1);

		// Serialize the singleton with value = 1
		try {
			//SingletonSerialized.ser is the serialized file to be generated
			FileOutputStream fileOut = new FileOutputStream("SingletonSerialized.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(singleton1);
			out.close();
			fileOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		singleton1.setValue(2); // Change the value of the singleton in memory to 2

		// Deserialize the serialized singleton with value 1
		SingletonSerialized singleton2 = null;
		try {
			FileInputStream fileIn = new FileInputStream("SingletonSerialized.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			singleton2 = (SingletonSerialized) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
		} catch (ClassNotFoundException c) {
			System.out.println("singletons.SingletonEnum class not found");
			c.printStackTrace();
		}

		if (singleton1 == singleton2) {
			System.out.println("Two objects are same");
		} else {
			System.out.println("Two objects are not same");
		}

		System.out.println(singleton1.getValue());
		System.out.println(singleton2.getValue());
		System.out.println("### Serializable Singleton End ###");
	}

	private static void enumSingleton() {
		System.out.println("### Enum Singleton Start ###");
		SingletonEnum singleton = SingletonEnum.INSTANCE;
		singleton.setValue(1);
        singleton.setValue(2);
        System.out.println(singleton.getValue());
        System.out.println(singleton.getValue());
        System.out.println("### Enum Singleton End ###");
	}
	
}
