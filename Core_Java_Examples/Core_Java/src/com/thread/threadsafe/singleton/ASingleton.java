package com.thread.threadsafe.singleton;

public class ASingleton {

	private static ASingleton instance = null;

	private ASingleton() {
	}

	public static ASingleton getInstance() {
		if (instance == null) {
			instance = new ASingleton();
		}
		return instance;
	}
}
