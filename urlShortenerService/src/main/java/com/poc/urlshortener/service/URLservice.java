package com.poc.urlshortener.service;

import com.poc.urlshortener.data.UrlData;

interface URLservice {

	String getURL(String shortURL);

	UrlData createURL(UrlData data);

}
