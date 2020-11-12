package com.nit.util;

import java.util.Base64;
import java.util.Date;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JWTUtil {
	
	public String generateTOken(String id, String subject, String key) {
		
		return Jwts.builder()
				.setId("A253")
				.setSubject(subject)
				.setIssuer("PRIYA")
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.signWith(SignatureAlgorithm.HS256, Base64.getEncoder().encode(key.getBytes()))
				.compact();
	}
	public Claims getClaims(String key, String token) {
		
		
		return Jwts.parser()
				.setSigningKey(Base64.getEncoder().encode(key.getBytes()))
				.parseClaimsJws(token)
				.getBody();
	}

}
