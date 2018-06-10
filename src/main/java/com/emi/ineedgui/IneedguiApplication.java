package com.emi.ineedgui;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.QueryLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableCassandraRepositories
public class IneedguiApplication {

	@Autowired
	private Cluster cluster;

	@PostConstruct
	public void initialize() {
		QueryLogger queryLogger = QueryLogger.builder()
				.build();
		cluster.register(queryLogger);
	}

	public static void main(String[] args) {
		SpringApplication.run(IneedguiApplication.class, args);
	}
}
