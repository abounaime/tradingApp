package com.bounaime.tradingapp.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.reactive.function.client.WebClient;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = IGMarketConfig.class)
public class IGMarketConfigTest {
    @Autowired
    private WebClient.Builder webClientBuilder;
    @Test
    void webClientShouldBeConfigured(){assertNotNull(webClientBuilder);
    }
}
