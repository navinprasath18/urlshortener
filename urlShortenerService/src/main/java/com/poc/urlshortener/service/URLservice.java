package com.poc.urlshortener.service;

import java.util.Optional;

import com.poc.urlshortener.data.UrlData;
import com.poc.urlshortener.entity.Urls;

interface URLservice {

	Optional<Urls> getURL(String shortURL);

	UrlData createURL(UrlData data);

}
