package com.thread.threadsafe.singleton;

public class ASingleton_v1 {

	private static volatile ASingleton_v1 instance;
	private static Object mutex = new Object();

	private ASingleton_v1() {
	}

	public static ASingleton_v1 getInstance() {
		ASingleton_v1 result = instance;
		if (result == null) {
			synchronized (mutex) {
				result = instance;
				if (result == null)
					instance = result = new ASingleton_v1();
			}
		}
		return result;
	}

}
