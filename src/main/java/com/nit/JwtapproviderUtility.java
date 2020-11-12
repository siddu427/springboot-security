package com.nit;

import com.nit.util.JWTUtil;

import io.jsonwebtoken.Claims;

public class JwtapproviderUtility {

	public static void main(String[] args) {
		JWTUtil jwt= new JWTUtil();
		String token = jwt.generateTOken("A123456", "SIDARTH", "NAGALGAON");
		System.out.println("TOKEN IS \n"+token);
		
		Claims claims = jwt.getClaims("NAGALGAON", token);
		System.out.println("CLAIMS ARE \n"+claims);
		
	
	}

}
