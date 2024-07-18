package com.bounaime.tradingapp.core.usecase;

import com.bounaime.tradingapp.adapters.IGMarketServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.mockito.Mockito.when;

public class IGMarketServiceTest {
    @InjectMocks
    private IGMarketServiceImpl igMarketService;
    @Mock
    private WebClient.ResponseSpec responseSpec;

    @Test
    void testLogin(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("CST", "testCST");
        headers.add("X-SECURITY-TOKEN", "testToken");
        when(responseSpec.toBodilessEntity()).thenReturn(Mono
                .just(ResponseEntity.ok().headers(headers).build()));

        Mono<String> authTokenMono = igMarketService.login();

        StepVerifier.create(authTokenMono)
                .expectNext("testCST:testToken")
                .verifyComplete();
    }
}
