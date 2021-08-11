package com.poc.urlshortener.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.poc.urlshortener.data.UrlData;
import com.poc.urlshortener.service.UrlServiceImpl;

@RestController
public class UrlController {

	@Autowired
	UrlServiceImpl service;

	@GetMapping("/{url}")
	public RedirectView redirect(@PathVariable("url") String shortURL) {
		var data = service.getURL(shortURL);

		RedirectView redirectView = new RedirectView("http://" + data.get().getURL());
		redirectView.setStatusCode(HttpStatus.PERMANENT_REDIRECT);
		return redirectView;

	}

	@PostMapping("/create")
	public UrlData createShortURL(@RequestBody UrlData data) {
		return service.createURL(data);
	}

}
