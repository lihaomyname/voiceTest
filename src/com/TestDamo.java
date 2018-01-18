package com;

import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Set;

import javax.sound.sampled.AudioFormat.Encoding;


public class TestDamo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		Set<String[]> set = new HashSet<>();
		String[] str = new String[]{"1","2","3"};
		String[] arr = new String[]{"1","2","3"};
		set.add(arr);
		set.add(str);
		System.out.println(set);
		System.out.println(set.size());
	}
}
