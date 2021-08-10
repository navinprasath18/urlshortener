package com.poc.urlshortener.data;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
public class UrlData {
	@NotNull
	String completeURL;

	String shortURL;

}
