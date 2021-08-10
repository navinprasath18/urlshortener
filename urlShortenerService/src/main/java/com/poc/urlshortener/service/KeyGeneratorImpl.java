package com.poc.urlshortener.service;

public class KeyGeneratorImpl implements KeyGenerator {

	@Override
	public String getKey() {
		return "url" + Math.random();
	}

}
