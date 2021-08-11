package com.poc.urlshortener.service;

import org.springframework.stereotype.Service;

@Service
public class KeyGeneratorImpl implements KeyGenerator {

	@Override
	public String getKey() {
		return "url" + Math.random();
	}

}
