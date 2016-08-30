package com.bangkokair.model;

public enum AuthoritiesType {

	USER("USER"), SUPERUSER("SUPERUSER"), ADMIN("ADMIN"), SUPERADMIN("SUPERADMIN"), DBA("DBA");

	String authoritiesType;

	private AuthoritiesType(String authoritiesType) {
		this.authoritiesType = authoritiesType;
	}

	public String getAuthoritiesType() {
		return authoritiesType;
	}

}