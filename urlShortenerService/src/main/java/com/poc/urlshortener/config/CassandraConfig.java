package com.poc.urlshortener.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.core.cql.keyspace.CreateKeyspaceSpecification;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

import lombok.Getter;

@Configuration
@EnableCassandraRepositories
@Getter
public class CassandraConfig extends AbstractCassandraConfiguration {

	@Value("${spring.data.cassandra.contact-points}")
	private String contactPoints;

	@Value("${spring.data.cassandra.port}")
	private int port;

	@Value("${spring.data.cassandra.username:#{null}}")
	private String username;

	@Value("${spring.data.cassandra.password:#{null}}")
	private String password;

	@Value("${spring.data.cassandra.schema-action}")
	private String schemaAction;

	@Value("${vcap.services.cig-cassandra.credentials.seeds:}")
	private List<String> seeds;

	@Override
	public SchemaAction getSchemaAction() {
		return SchemaAction.CREATE_IF_NOT_EXISTS;
	}
	
	

	@Override
	protected List<CreateKeyspaceSpecification> getKeyspaceCreations() {
		Integer replicationFactor = seeds.isEmpty() ? 1 : seeds.size();
		return List.of(CreateKeyspaceSpecification.createKeyspace(getKeyspaceName()).ifNotExists()
				.withSimpleReplication(replicationFactor));
	}
	
	@Value("${spring.data.cassandra.keyspace}")
    private String keyspace;

    @Override
    protected String getKeyspaceName() {
        return getKeyspace();
    }
    
    
    @Override
    public String getContactPoints() {
      return "127.0.0.1";
    }



	

}
