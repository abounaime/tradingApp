package com.bounaime.tradingapp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class IGMarketConfig {
    @Value("${ig_api_base_key}")
    private String baseUrl;
    @Value("${ig_api_key}")
    private String apiKey;

    @Bean
    public WebClient.Builder webClientBuilder(){
        return WebClient.builder()
                .baseUrl(baseUrl)
                .defaultHeader("X-IG-API-KEY", apiKey);
    }
}
