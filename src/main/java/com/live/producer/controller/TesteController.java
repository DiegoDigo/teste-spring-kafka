package com.live.producer.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("teste")
@RequiredArgsConstructor
public class TesteController {

    private final KafkaTemplate<String, String> template;

    @GetMapping
    public ResponseEntity<?> send() {
        template.send("topic-1", "teste de envio: " + LocalDateTime.now());
        return ResponseEntity.ok().build();
    }
}
