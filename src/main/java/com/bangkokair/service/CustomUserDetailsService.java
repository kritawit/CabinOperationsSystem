package com.bangkokair.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bangkokair.model.Authorities;
import com.bangkokair.model.CabinCrew;

@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private CabinCrewService cabinCrewService;

	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		CabinCrew cabinCrew = cabinCrewService.findByUsername(username);
		System.out.println("Cabin : " + cabinCrew);
		if (cabinCrew == null) {
			System.out.println("Cabin Crew not found.");
			throw new UsernameNotFoundException("Username not found.");
		}

		return new org.springframework.security.core.userdetails.User(cabinCrew.getUsername(), cabinCrew.getPassword(),
				cabinCrew.getActive().equals(1), true, true, true, getGrantedAuthorities(cabinCrew));
	}

	private List<GrantedAuthority> getGrantedAuthorities(CabinCrew cabinCrew) {

		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

		for (Authorities authority : cabinCrew.getAuthorities()) {

			System.out.println("Authorities : " + authority);
			authorities.add(new SimpleGrantedAuthority("ROLE_" + authority.getType()));
		}

		System.out.println("authorities : " + authorities);

		return authorities;
	}

}
