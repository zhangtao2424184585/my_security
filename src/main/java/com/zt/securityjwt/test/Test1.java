package com.zt.securityjwt.test;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * @Classname Test1
 * @Description TODO
 * @Date 2020/8/28 10:41
 * @Created by zhangtao
 */
public class Test1 {
    public static void main(String[] args) {
        String key = "1234123412341234123412341234123412341234";
        SecretKey secretKey = new SecretKeySpec(key.getBytes(), SignatureAlgorithm.HS256.getJcaName());
        String token = Jwts.builder()
                .setSubject("hello world")
                .signWith(secretKey)
                .compact();
        System.out.println(token);
        try {
            String key1 = "1234123412341234123412341234123412341234";
            SecretKeySpec secretKeySpec = new SecretKeySpec(key1.getBytes(), SignatureAlgorithm.HS256.getJcaName());
            Jwts.parser().setSigningKey(secretKeySpec).parseClaimsJws(token);
            System.out.println("验证成功");
        }catch (JwtException e){
            System.out.println("验证失败");
        }
        Claims body = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody();
        System.out.println(body.getSubject());
    }
}
