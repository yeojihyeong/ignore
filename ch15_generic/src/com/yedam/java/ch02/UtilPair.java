package com.yedam.java.ch02;

public class UtilPair {
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2)
	{
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valuCompare = p1.getValue().equals(p2.getValue());
		
		return keyCompare & valuCompare;
	}
}
