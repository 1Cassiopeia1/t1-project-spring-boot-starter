package com.example.t1projectspringbootstarter.feign;

import com.example.t1projectspringbootstarter.dto.TransactionAcceptDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "accept-service", url = "${services.client-service.url}")
public interface ClientFeign {
    @PostMapping("/accept")
    ResponseEntity<Void> saveEvent(@RequestBody TransactionAcceptDto acceptDto);

    @GetMapping("/block")
    ResponseEntity<Boolean> isClientAccountsBlocked(
            @RequestParam Long clientId, @RequestParam Long accountId);
}
