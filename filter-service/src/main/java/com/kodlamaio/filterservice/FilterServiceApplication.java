package com.kodlamaio.filterservice;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.kodlamaio.common.utilities.mapper.ModelMapperManager;
import com.kodlamaio.common.utilities.mapper.ModelMapperService;

@SpringBootApplication
@EnableDiscoveryClient
public class FilterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilterServiceApplication.class, args);
	}


	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
	
	@Bean
	public ModelMapperService getModelMapperService(ModelMapper mapper) {
		return new ModelMapperManager(mapper);
	}
}
