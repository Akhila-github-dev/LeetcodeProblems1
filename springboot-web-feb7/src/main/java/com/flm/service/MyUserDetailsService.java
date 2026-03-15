package com.flm.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.flm.entity.MyUser;
import com.flm.repository.MyUserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MyUserDetailsService implements UserDetailsService{

	private final MyUserRepository myUserRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<MyUser> optMyUser = myUserRepository.findByUsername(username);
		if (optMyUser.isPresent()) return optMyUser.get();
		throw new UsernameNotFoundException("User is not found!!");
	}

}
