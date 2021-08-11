package com.poc.urlshortener.service;

import java.util.Base64;

import org.springframework.stereotype.Service;

@Service
public class KeyGeneratorImpl implements KeyGenerator {

	@Override
	public String getKey(String url) {
		return new String(Base64.getEncoder().encode(url.getBytes()));
	}

}
