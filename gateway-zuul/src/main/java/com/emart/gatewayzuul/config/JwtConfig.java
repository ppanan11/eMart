//package com.emart.gatewayzuul.config;
//import org.springframework.beans.factory.annotation.Value;
//import lombok.Data;
//
//@Data
//public class JwtConfig {
//    @Value("${security.jwt.uri:/auth/**}")
//    private String Uri;
//
//    @Value("${security.jwt.header:Authorization}")
//    private String header;
//
//    @Value("${security.jwt.prefix:Bearer }")
//    private String prefix;
//
//    @Value("${security.jwt.expiration:#{24*60*60}}")
//    private int expiration;
//
//    @Value("${security.jwt.secret:JwtSecretKey}")
//    private String secret;
//
//    public String getHeader(){
//        return header;
//    }
//
//
//    public String getUri() {
//        return Uri;
//    }
//
//
//    public String getPrefix() {
//        return prefix;
//    }
//
//    public String getSecret() {
//        return secret;
//    }
//
//    public int getExpiration() {
//        return expiration;
//    }
//}
