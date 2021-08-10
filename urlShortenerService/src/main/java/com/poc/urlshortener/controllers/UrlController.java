package com.poc.urlshortener.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.poc.urlshortener.data.UrlData;
import com.poc.urlshortener.entity.Urls;
import com.poc.urlshortener.service.UrlServiceImpl;

@RestController
public class UrlController {

	@Autowired
	UrlServiceImpl service;

	@GetMapping("/{shortURL}")
	public Urls redirect(@RequestParam("shortURL") String shortURL) {
		return service.getURL(shortURL).get();

	}

	@PostMapping("/create")
	public UrlData createShortURL(@RequestBody UrlData data) {
		return service.createURL(data);
	}

}
