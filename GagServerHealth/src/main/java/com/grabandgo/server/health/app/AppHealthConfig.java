package com.grabandgo.server.health.app;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.TrustStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @author Alexandr_I
 *
 */
@SpringBootApplication
@ComponentScan({ "com.grabandgo.server.health.aop", "com.grabandgo.server.health.controller", "com.grabandgo.server.health.service", "com.grabandgo.server.fwk", "com.grabandgo.server.health.swagger2" })
@EnableJpaRepositories("com.grabandgo.server.health.jpa")
@EntityScan("com.grabandgo.server.health.model")
@EnableAspectJAutoProxy
public class AppHealthConfig {

	private static final Logger LOG = LoggerFactory.getLogger(AppHealthConfig.class);

	@Bean
	//	@LoadBalanced
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		LOG.debug("Creating RestTemplate from builder: {}", builder);
		RestTemplate theResult = null;

		try {
			TrustStrategy acceptingTrustStrategy = (X509Certificate[] chain, String authType) -> true;
			SSLContext sslContext = org.apache.http.ssl.SSLContexts.custom().loadTrustMaterial(null, acceptingTrustStrategy).build();
			SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext);

			CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(csf).build();

			HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();

			requestFactory.setHttpClient(httpClient);
			theResult = builder.build();
			theResult.setRequestFactory(requestFactory);
		} catch (KeyManagementException | NoSuchAlgorithmException | KeyStoreException e) {
			LOG.error("Error While creating RestTemplate: ", e);
			System.exit(-1);
		}

		return theResult;
	}
}
