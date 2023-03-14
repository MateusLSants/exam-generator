package br.com.dev.examgenerator.security.filter;

import java.util.concurrent.TimeUnit;

public class Constants {
    public static final String SECRET = "secret";
    public static final String TOKE_PREFIX = "Bearer";
    public static final String HEADER_STRING = "Authorization";
    public static final long EXPIRARTION_TIME = 86400000000l;

    public static void main(String[] args) {
        System.out.println(TimeUnit.MICROSECONDS.convert(1, TimeUnit.DAYS));
    }
}
