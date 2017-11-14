/**
 * 
 */
package com.grabandgo.server.health.swagger2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

/**
 * @author Alexandr_I
 *
 */
@Configuration
@EnableSwagger2
public class AppSwagger2Config {

	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api").apiInfo(apiInfo()).select()//--
				.apis(RequestHandlerSelectors.basePackage("com.grabandgo.server.health.controller"))//-
				.paths(postPaths()).build();
	}

	private Predicate<String> postPaths() {
		return regex("/api.*");
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Gag Health API").description("API for Health codes")//-
				.termsOfServiceUrl("http://gag.by")//--
				.contact(new Contact("Admin", "http://gag.by", "admin@gag.by"))//--
				.license("Gag License").licenseUrl("admin@gag.by")//--
				.version("1.0").build();
	}

}