package com.springSecurity.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@PropertySource(value = { "users.properties" })
public class MyApp {

	@Value("${user1.name}")
	private String firstUsername;

	@Value("${user1.password}")
	private String firstUserpassword;

	@Value("${user2.name}")
	private String secondUsername;

	@Value("${user2.password}")
	private String secondUserpassword;

	@Value("${user3.name}")
	private String thirdUsername;

	@Value("${user3.password}")
	private String thirdUserpassword;

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public UserDetailsService userDetailsService() {

		UserDetails userDetails1 = User.builder().username(firstUsername)
				.password(passwordEncoder().encode(firstUserpassword)).build();
		UserDetails userDetails2 = User.builder().username(secondUsername)
				.password(passwordEncoder().encode(secondUserpassword)).build();

		UserDetails userDetails3 = User.builder().username(thirdUsername)
				.password(passwordEncoder().encode(thirdUserpassword)).build();

		return new InMemoryUserDetailsManager(userDetails1, userDetails2, userDetails3);
	}
}
