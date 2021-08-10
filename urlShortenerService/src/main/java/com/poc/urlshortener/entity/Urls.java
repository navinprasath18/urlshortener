package com.poc.urlshortener.entity;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Getter;
import lombok.Setter;

@Table
@Getter
@Setter
public class Urls {

	@PrimaryKey
	private String shortURL;

	private String URL;

}
