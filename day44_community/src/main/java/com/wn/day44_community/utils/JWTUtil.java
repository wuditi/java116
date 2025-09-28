package com.wn.day44_community.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.wn.day44_community.entity.UserInfo;

import java.util.Date;

public class JWTUtil {
    public static final String SECRET_KEY = "USER_TOKEN"; //秘钥
    public static final long TOKEN_EXPIRE_TIME = 10000 * 60; //1分钟后token过期
    private static final String ISSUER = "issuer"; //签发人

    /**
     * 生成token字符串
     */
    public static String generateToken(UserInfo user) {
        Date now = new Date(); //当前时间
        //创建签名算法对象
        Algorithm algorithm = Algorithm.HMAC256(SECRET_KEY); //算法

        String token = JWT.create()
                .withIssuer(ISSUER) //签发人
                .withIssuedAt(now)  //签发时间
                .withExpiresAt(new Date(now.getTime() + TOKEN_EXPIRE_TIME))//过期时间
                .withClaim("uid", user.getId()) //保存身份标识
                .withClaim("uname", user.getUsername()) //保存身份标识
                .sign(algorithm);
        return token;
    }

    /**
     * 验证token
     */
    public static TokenEnum verify(String token) {
        try {
            //签名算法
            Algorithm algorithm = Algorithm.HMAC256(SECRET_KEY); //算法
            JWTVerifier verifier = JWT.require(algorithm)
                    .withIssuer(ISSUER)
                    .build();
            verifier.verify(token);
            return TokenEnum.TOKENSUCCESS; //合法token字符串
        } catch (TokenExpiredException e) {
            e.printStackTrace();
            return TokenEnum.TOKENEXPIRE; //token时间过期
        } catch (Exception e) {
            e.printStackTrace();
            return TokenEnum.TOKENINVALID; //非法token
        }
    }

    // 判断token是否过期
//    public static boolean isTokenExpired(String token) {
//
//        try{
//            //创建验证器对象
//            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(SECRET_KEY)).withIssuer(ISSUER).build();
//            //解码token
//            DecodedJWT jwt = verifier.verify(token);
//            //获取过期时间
//            Date expiresDate = jwt.getExpiresAt();
//            System.out.println("比较token是否过期:" + new Date().after(expiresDate));
//            //比较当前时间是否超过过期时间
//            return new Date().after(expiresDate);
//        }catch (Exception e){
//            //如果出现异常也被是为过期
//            e.printStackTrace();
//            return true;
//        }
//    }

    /**
     * 刷新token
     */
    public static String refresh(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            //获取用户名
            String uname = jwt.getClaim("uname").asString(); //获取token中保存的用户名
            Long uid = jwt.getClaim("uid").asLong();//获取token中保存的uid
            Algorithm algorithm = Algorithm.HMAC256(SECRET_KEY);
            Date now = new Date(); //最新时间
            Date expiresDate = new Date(now.getTime() + TOKEN_EXPIRE_TIME); //过期时间

            return JWT.create()
                    .withClaim("uid", uid)
                    .withClaim("username", uname)
                    .withIssuedAt(now)
                    .withExpiresAt(expiresDate)
                    .sign(algorithm);
        } catch (JWTDecodeException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 从token获取uname
     */
    public static String getUname(String token) {
        try {
            return JWT.decode(token).getClaim("uname").asString();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "";
    }

    /**
     * 从token获取uid值
     */
    public static Long getUid(String token) {
        try {
            return JWT.decode(token).getClaim("uid").asLong();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
