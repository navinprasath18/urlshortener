package com.poc.urlshortener.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.urlshortener.data.UrlData;
import com.poc.urlshortener.entity.Urls;
import com.poc.urlshortener.repo.UrlsRepo;

@Service
public class UrlServiceImpl implements URLservice {

	@Autowired
	UrlsRepo repo;

	@Autowired
	KeyGenerator ketgenerator;

	@Override
	public Optional<Urls> getURL(String shortURL) {
		return repo.findById(shortURL);

	}

	@Override
	@Transactional
	public UrlData createURL(UrlData data) {
		Urls urls = new Urls(ketgenerator.getKey(), data.getCompleteURL());
		repo.save(urls);
		data.setShortURL(urls.getShortURL());
		return data;
	}

}
