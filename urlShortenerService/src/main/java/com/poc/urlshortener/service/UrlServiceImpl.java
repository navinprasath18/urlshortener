package com.poc.urlshortener.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.urlshortener.data.UrlData;
import com.poc.urlshortener.repo.UrlsRepo;

@Service
public class UrlServiceImpl implements URLservice {

	@Autowired
	UrlsRepo repo;

	@Override
	public String getURL(String shortURL) {
		return shortURL;

	}

	@Override
	public UrlData createURL(UrlData data) {
		return data;
	}

}
