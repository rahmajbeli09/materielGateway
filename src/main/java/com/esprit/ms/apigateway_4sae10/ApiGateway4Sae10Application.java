package com.esprit.ms.apigateway_4sae10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGateway4Sae10Application {

	public static void main(String[] args) {
		SpringApplication.run(ApiGateway4Sae10Application.class, args);
	}

	@Bean
	public RouteLocator getroutesApiGateway(RouteLocatorBuilder builder)
	{return builder.routes()
			.route("MS-job-s",r->r.path("/job/**")
					.uri("http://localhost:8080"))
			.build();


	}


}
