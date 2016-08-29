package com.bangkokair.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.bangkokair.model.Authorities;
import com.bangkokair.service.AuthoritiesService;

@Component
public class RoleToAuthoritiesConverter implements Converter<Object, Authorities> {

	@Autowired
	private AuthoritiesService authoritiesService;

	@Override
	public Authorities convert(Object element) {
		Integer id = Integer.parseInt((String) element);
		Authorities auth = authoritiesService.findById(id);
		return auth;
	}

}