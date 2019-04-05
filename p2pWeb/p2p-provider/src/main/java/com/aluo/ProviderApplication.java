package com.aluo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement(proxyTargetClass = true)
@SpringBootApplication
public class ProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProviderApplication.class, args);
	}
}
