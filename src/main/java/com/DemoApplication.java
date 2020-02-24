package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

    @SpringBootApplication
    @EnableConfigurationProperties({
            com.property.FileStorageProperties.class
    })
    public static class Wind2019Application {

        public static void main(String[] args) {
            SpringApplication.run(Wind2019Application.class, args);
        }
        @Bean
    public CorsFilter corsFilter ( ){
                final UrlBasedCorsConfigurationSource source= new UrlBasedCorsConfigurationSource();
    final CorsConfiguration configuration = new CorsConfiguration();
            configuration.setAllowCredentials(true);
            configuration.addAllowedHeader("*");
            configuration.addAllowedOrigin("*");
            configuration.addAllowedMethod("OPTIONS");
            configuration.addAllowedMethod("POST");
            configuration.addAllowedMethod("GET");
            configuration.addAllowedMethod("put");
            configuration.addAllowedMethod("DELETE");
            source.registerCorsConfiguration("/**",configuration);
            return new CorsFilter(source);


    }
    }
}
