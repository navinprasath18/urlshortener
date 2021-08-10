package com.poc.urlshortener.urlController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poc.urlshortener.data.UrlData;
import com.poc.urlshortener.service.UrlServiceImpl;

@RestController
public class UrlController {

	@Autowired
	UrlServiceImpl service;

	@GetMapping("/{shortURL}")
	public void redirect() {

	}

	@PostMapping("/create")
	public UrlData createShortURL(@RequestBody UrlData data) {
		return data;
	}

}
