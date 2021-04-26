package com.tipirates.webflux.controller;

import org.reactivestreams.Publisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {

    @GetMapping
    @ResponseBody
    public Publisher<String> sayHello() {
        return Mono.just("Hello world from Spring Webflux by School of net");
    }
}
