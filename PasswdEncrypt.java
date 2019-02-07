package com.basic;

import org.apache.commons.codec.binary.Base64;

public class PasswdEncrypt {

	public static void main(String[] args) {
		String pwd="anudanda";
	byte[]	encodedpwd=Base64.encodeBase64(pwd.getBytes());
	System.out.println("encoded password:" + new String(encodedpwd));
	
	byte[] decodedpwd=Base64.decodeBase64(encodedpwd);
	System.out.println("decoded password:" +new String(decodedpwd));
	}

}
