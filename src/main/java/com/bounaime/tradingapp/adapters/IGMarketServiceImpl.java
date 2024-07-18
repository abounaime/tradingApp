package com.bounaime.tradingapp.adapters;

import com.bounaime.tradingapp.core.model.OrderRequest;
import com.bounaime.tradingapp.core.usecase.IGMarketService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class IGMarketServiceImpl implements IGMarketService {

    private final WebClient webClient;
    @Value("${ig.api.username}")
    private String username;
    @Value("${ig.api.password}")
    private String password;

    public IGMarketServiceImpl(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.build();
    }

    @Override
    public Mono<String> login() {
        return null;
    }

    @Override
    public Mono<ResponseEntity<String>> sendOrder(OrderRequest orderRequest, String authToken) {
        return null;
    }
}
