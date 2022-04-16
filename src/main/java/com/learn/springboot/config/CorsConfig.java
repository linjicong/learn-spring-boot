package com.learn.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*"); // 允许访问的客户端域名
        corsConfiguration.addAllowedHeader("*"); // 允许服务端访问的客户端请求头
        corsConfiguration.addAllowedMethod("*"); // 允许访问的方法名
        corsConfiguration.setAllowCredentials(true);// 允许请求带有cookie信息
        corsConfiguration.setMaxAge(18000L); // 最大时长
        return corsConfiguration;
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig()); // 4
        return new CorsFilter(source);
    }
}
