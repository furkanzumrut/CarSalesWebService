package com.auto.jaxws.cxf.utils;

import org.apache.commons.codec.binary.Base64;


public class TokenChecker {

	
	public TokenChecker(){
		
	}

	public boolean Check(String username, String password, String token){
		
			if(generateToken(username,password).equals(token)) 
				return true;
			
		return false;
	}


	public String generateToken(String username, String password){
		return base64encode(username+password);		
	}
	
	public String getToken(String username,String password){
		
		if(userAuth(username, password)){
			return generateToken(username, password);
		}
		return "false";
	}
	
	private String base64encode(String data){
		
		byte[] encoded = Base64.encodeBase64(data.getBytes());     
		return new String(encoded);
	}
	
	public boolean userAuth(String username, String password){
		if("admin".equals(username)&&"12345".equals(password)){return true;}
		return false;
	}

}
