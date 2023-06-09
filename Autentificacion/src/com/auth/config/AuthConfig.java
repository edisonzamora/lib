package com.auth.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@EntityScan("com.*")
@Configuration
@PropertySource("classpath:com/auth/config/properties/auth.properties")
public class AuthConfig {

	@Bean(name = "passwordEncoder")
	public BCryptPasswordEncoder bcruptPassword() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
