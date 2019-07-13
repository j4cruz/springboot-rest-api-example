package io.java.springboot.config;

import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application.properties")
public class SecurityConfig implements EnvironmentAware {

	static Environment environment;

	@Override
	public void setEnvironment(Environment environment) {
		SecurityConfig.environment = environment;
	}

	public static String getJWTSecret() {
		return environment.getProperty("jwt.secret");
	}

	public static Long getJWTExpirationTime() {
		return Long.parseLong(environment.getProperty("jwt.expiration.time"));
	}

	public static String getJWTTokenPrefix() {
		return environment.getProperty("jwt.token.prefix");
	}

	public static String getJWTHeaderString() {
		return environment.getProperty("jwt.header.string");
	}

	public static String getJWTSignUpUrl() {
		return environment.getProperty("jwt.signup.url");
	}
}