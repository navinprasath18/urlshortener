package com.poc.urlshortener.repo;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.poc.urlshortener.entity.Urls;

@Repository
public interface UrlsRepo extends CassandraRepository<Urls, Long> {

}
