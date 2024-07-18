package com.bounaime.tradingapp.core.usecase;

import com.bounaime.tradingapp.core.model.OrderRequest;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

public interface IGMarketService {
    Mono<String> login();
    Mono<ResponseEntity<String>> sendOrder(OrderRequest orderRequest,
                                           String authToken);
}
