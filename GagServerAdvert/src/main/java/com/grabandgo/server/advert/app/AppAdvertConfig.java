package com.grabandgo.server.advert.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Alexandr_I
 *
 */
@SpringBootApplication
@ComponentScan({ "com.grabandgo.server.advert.aop", "com.grabandgo.server.advert.controller", "com.grabandgo.server.advert.service", "com.grabandgo.server.fwk", "com.grabandgo.server.advert.swagger2" })
@EnableJpaRepositories("com.grabandgo.server.advert.jpa")
@EntityScan("com.grabandgo.server.advert.model")
@EnableAspectJAutoProxy
public class AppAdvertConfig {

	private static final Logger LOG = LoggerFactory.getLogger(AppAdvertConfig.class);

	/*@Bean
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
	}*/
}
